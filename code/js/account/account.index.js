$(document).ready(function() {
	loadDataGridContent(columnsDefined(), 'formatData');

	/**
	 * 刷新或搜索
	 */
	$('body').delegate('.action-refresh, #action_search', 'click', function() {
		$('#content_listing').datagrid('reload');
	});

	/**
	 * 关键字搜索 - 支持回车
	 */
	$("input[name=key]").on('keypress', function(event) {
		if (event.which == '13') {
			$('#content_listing').datagrid('reload');
			return false;
		}
	});

	/**
	 * 单个删除
	 */
	$('body').delegate('.operate-delete', 'click', function() {
		var del = confirm('确定要删除吗？');
		if (!del) {
			return false;
		}
		
				var accountId = $(this).attr("accountId");
		
		/* 执行 */
		$.ajax({
			type : 'post',
			url : BASE_URL + '/back/account/delete',
			data : 'accountId=' + accountId,
			dataType : 'json',
			timeout : 10000,
			success : function(data) {
				if (data.status == 0) {
					$('#content_listing').datagrid('reload');
				} else {
					alert(data.msg);
				}
				return false;
			}
		});
	});
});

function columnsDefined() {
	return [
				{
					property: '_query',
					label: ''
				},
				{
					property : 'accountId',
					label : '账户ID',
					sortable : false
				},
				{
					property : 'userId',
					label : '用户UID',
					sortable : false
				},
				{
					property : 'userType',
					label : '账户类型',
					sortable : false
				},
				{
					property : 'status',
					label : '用户状态',
					sortable : false
				},
				{
					property : 'createTime',
					label : '创建时间',
					sortable : false
				},
				{
					property : 'updateTime',
					label : '',
					sortable : false
				},
				{
					property : '_action',
					label : '操作',
					sortable : false
				} 
			];
}

function formatData(items) {
	$.each(items, function(index, item) {
		item._query = '<a href="'+BASE_URL + '/back/account/detail?accountId=' + item.accountId + '"  class="modal-detail"><i class="fa fa-search-plus" title="查看详情"></i></a>';
		item._action = '<a href="' + BASE_URL + '/back/account/edit?accountId=' + item.accountId
				+ '" class="operating-edit" title="编辑"><i class="fa fa-pencil"></i></a>&nbsp;&nbsp;'
				+ '<a href="javascript:;" class="operate-delete" id="accountId_' + item.accountId + '" accountId="' + item.accountId
				+ '" title="删除"><i class="fa fa-trash-o"></i></a>';


		var strUserType = '未知';
		if (item.userType == 1) {
			strUserType = '个人账户';
		} else if (item.userType == 2) {
			strUserType = '企业账户';
		}
        item.userType = strUserType;

		var strStatus = '未知';
		if (item.status == -1) {
			strStatus = '删除';
		} else if (item.status == 0) {
			strStatus = '冻结';
		} else if (item.status == 1) {
			strStatus = '正常';
		}
        item.status = strStatus;
		item.createTime = dateConverter(item.createTime, PATTERN_ENUM.datetime);
		item.updateTime = dateConverter(item.updateTime, PATTERN_ENUM.datetime);
	});
}
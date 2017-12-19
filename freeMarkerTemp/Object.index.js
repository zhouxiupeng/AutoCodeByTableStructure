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
		
		<#list pkPropertyList as pk>
		var ${pk.name} = ${meiYuanFuHao}(this).attr("${pk.name}");
		</#list>
		
		/* 执行 */
		$.ajax({
			type : 'post',
			url : BASE_URL + '/back/${name}/delete',
		<#list pkPropertyList as pk>
			data : '${pk.name}=' + ${pk.name},
		</#list>
			dataType : 'json',
			timeout : 10000,
			success : function(data) {
				if (data.status == 0) {
		<#list pkPropertyList as pk>
					$('#content_listing').datagrid('reload');
		</#list>
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
			<#list propertyList as p>
				{
					property : '${p.name}',
					label : '${p.noteMain}',
					sortable : false
				},
			</#list>
				{
					property : '_action',
					label : '操作',
					sortable : false
				} 
			];
}

function formatData(items) {
	$.each(items, function(index, item) {
	<#list pkPropertyList as pk>
		item._query = '<a href="'+BASE_URL + '/back/${name}/detail?${pk.name}=' + item.${pk.name} + '"  class="modal-detail"><i class="fa fa-search-plus" title="查看详情"></i></a>';
		item._action = '<a href="' + BASE_URL + '/back/${name}/edit?${pk.name}=' + item.${pk.name}
				+ '" class="operating-edit" title="编辑"><i class="fa fa-pencil"></i></a>&nbsp;&nbsp;'
				+ '<a href="javascript:;" class="operate-delete" id="${pk.name}_' + item.${pk.name} + '" ${pk.name}="' + item.${pk.name}
				+ '" title="删除"><i class="fa fa-trash-o"></i></a>';
	</#list>

	<#list propertyList as p>
		<#if p.javaType == "Date">
		item.${p.name} = dateConverter(item.${p.name}, PATTERN_ENUM.datetime);
		</#if>
		<#if p.isDropDown == "true">

		var str${p.nameFU} = '未知';
		<#list p.dropDownList as d>
		<#if d_index!=0>} else </#if>if (item.${p.name} == ${d.id}) {
			str${p.nameFU} = '${d.name}';
		</#list>
		}
        item.${p.name} = str${p.nameFU};
		</#if>
	</#list>
	});
}
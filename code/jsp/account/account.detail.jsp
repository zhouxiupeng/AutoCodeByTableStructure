<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="../wrapper.prefix.jsp"/>

<section class="hbox stretch">
    <aside class="bg-white">
        <section class="vbox">
            <header class="header bg-white b-b clearfix">
                <div class="m-t-sm">
                    <a href="#subNav" data-toggle="class:hide" class="btn btn-sm btn-default active btn-nav-goods" btn_nav_goods_index="0">
                        <i class="fa fa-caret-right text fa-lg"></i>
                        <i class="fa fa-caret-left text-active fa-lg"></i>
                    </a>
                        <a href="javascript:;" class="btn btn-sm btn-default" id="button_cancel"><i class="fa fa-reply"></i> 返回</a>
                </div>
            </header>
              
            <section class="scrollable wrapper">
                <section class="panel panel-default portlet-item">
	                <header class="panel-heading">账户信息详情</header>
		            <table class="table table-striped2 m-b-none text-sm">
                        <tbody>
                        
                            <tr>  
                                <td class="col-sm-2">账户ID：</td>
                                <td class="col-sm-4">${account.accountId}</td>
                                <td class="col-sm-2">用户UID：</td>
                                <td class="col-sm-4">${account.userId}</td>
                            </tr>
                            <tr>  
								<td class="col-sm-2">账户类型：</td>
                                <td class="col-sm-4">
									<c:if test="${account.userType == 1}">
									个人账户
									</c:if>
									<c:if test="${account.userType == 2}">
									企业账户
									</c:if>
								</td>
								<td class="col-sm-2">用户状态：</td>
                                <td class="col-sm-4">
									<c:if test="${account.status == -1}">
									删除
									</c:if>
									<c:if test="${account.status == 0}">
									冻结
									</c:if>
									<c:if test="${account.status == 1}">
									正常
									</c:if>
								</td>
                            </tr>
                            <tr>  
                                <td class="col-sm-2">创建时间：</td>
                                <td class="col-sm-4">
                                    <fmt:formatDate value="${account.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                </td>
                                <td class="col-sm-2">：</td>
                                <td class="col-sm-4">
                                    <fmt:formatDate value="${account.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                </td>
                            </tr>
                         
                        </tbody>
                    </table>
                </section>
            </section>
        </section>
    </aside>
</section>

<jsp:include page="../wrapper.suffix.jsp"/>
<script src="${STATIC_URL}/back/modules/account/js/account.detail.js" type="text/javascript"></script>

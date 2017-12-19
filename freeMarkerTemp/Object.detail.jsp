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
	                <header class="panel-heading">${note}详情</header>
		            <table class="table table-striped2 m-b-none text-sm">
                        <tbody>
                        
                     <#list propertyList as p>
                         <#assign index=p_index/>
                         <#if index%2==0>
                            <tr>  
                         </#if>
                            <#if p.javaType == "Date">
                                <td class="col-sm-2">${p.noteMain}：</td>
                                <td class="col-sm-4">
                                    <fmt:formatDate value="${meiYuanFuHao}{${name}.${p.name}}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                </td>
							<#elseif p.isDropDown == "true">
								<td class="col-sm-2">${p.noteMain}：</td>
                                <td class="col-sm-4">
									<#list p.dropDownList as d>
									<c:if test="${meiYuanFuHao}{${name}.${p.name} == ${d.id}}">
									${d.name}
									</c:if>
									</#list>
								</td>
                            <#else>                  
                                <td class="col-sm-2">${p.noteMain}：</td>
                                <td class="col-sm-4">${meiYuanFuHao}{${name}.${p.name}}</td>
                            </#if>
                         <#if index%2==1>
                            </tr>
                         </#if>
                     </#list>
                         <#if index%2==0>
                                <td class="col-sm-2"></td>
                                <td class="col-sm-4"></td>
                            </tr>
                         </#if>
                         
                        </tbody>
                    </table>
                </section>
            </section>
        </section>
    </aside>
</section>

<jsp:include page="../wrapper.suffix.jsp"/>
<script src="${meiYuanFuHao}{STATIC_URL}/back/modules/${moduleName}/js/${noModuleName}.detail.js" type="text/javascript"></script>

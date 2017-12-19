<#assign hasDate = "" />
<#list propertyList as p>
    <#if p.javaType == "Date">
        <#assign hasDate = "true" />
    </#if>
</#list>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<#if hasDate == "true">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</#if>
<jsp:include page="../wrapper.prefix.jsp"/>

<#if hasDate == "true">
<link href="${meiYuanFuHao}{STATIC_URL}/plugins/datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css"/>
</#if>
  
<section class="hbox stretch">
    <aside class="aside-md bg-white b-r">
        <section class="vbox">
            <header class="b-b header">
                <p class="h4"> <c:choose> <c:when test="${meiYuanFuHao}{${name}!=null}">编辑</c:when><c:otherwise>添加</c:otherwise></c:choose></p>
            </header>
                
            <section class="scrollable wrapper w-f">
                <form class="form-horizontal" id="edit_form" action=<c:choose> <c:when test="${meiYuanFuHao}{${name}!=null}">"${meiYuanFuHao}{BASE_URL}/back/${name}/edit"</c:when><c:otherwise>"${meiYuanFuHao}{BASE_URL}/back/${name}/add"</c:otherwise></c:choose> method="post">
                <#list noPKpropertyList as p>
                    <#if p.javaType == "Date">
                    <div class="form-group m-b-xs">
                        <label for="${p.name}" class="col-sm-3 control-label"><#if p.nullable != 1><font class="red">* </font></#if>${p.noteMain}</label>
                        <div class="col-sm-4">
                            <input type="text" class="input-sm input-s datetimepicker-input form-control" id="${p.name}" name="${p.name}" 
                            value="<fmt:formatDate value="${meiYuanFuHao}{${name}.${p.name}}" pattern="yyyy-MM-dd HH:mm"/>" placeholder="请选择${p.noteMain}时间" readonly="readonly"/>
                        </div>
                    </div>
                    <div class="line line-dashed line-lg pull-in"></div>
					<#elseif p.isDropDown == "true">
					<div class="form-group">
				        <label class="col-sm-3 control-label"><#if p.nullable != 1><font class="red">* </font></#if>${p.noteMain}</label>
				        <div class="col-sm-4">
				            <select id="${p.name}" name="${p.name}" class="form-control">
				                <option value="0">请选择</option>
								<#list p.dropDownList as d>
				                	<option value="${d.id}" <c:if test="${meiYuanFuHao}{${name}.${p.name} == ${d.id}}">selected="selected"</c:if>>${d.name}</option>
								</#list>
				            </select>
				        </div>
				    </div>
				    <div class="line line-dashed line pull-in"></div>
                    <#else>
                    <div class="form-group">
                        <label for="${p.name}" class="col-sm-3 control-label"><#if p.nullable != 1><font class="red">* </font></#if>${p.noteMain}</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="${p.name}" name="${p.name}" value="${meiYuanFuHao}{${name}.${p.name}}" onkeydown="if(event.keyCode==13)return false;" placeholder="请输入" />
                        </div>
                    </div>
					<div class="line line-dashed line pull-in"></div>
                    </#if>
                </#list>
                <#list pkPropertyList as pk>
                    <input type="hidden" name="${pk.name}" value="${meiYuanFuHao}{${name}.${pk.name}}" />
                </#list>

                </form>
            </section>
        
            <footer class="footer b-t bg-white-only">
                <div class="m-t-sm">
                    <button type="button" data_submit_type="submit_save_back" class="btn btn-s-md btn-primary btn-sm input-submit">保存</button>
                    <c:if test="${meiYuanFuHao}{${name}==null}"><button type="button" data_submit_type="submit_save_continue" class="btn btn-s-md btn-primary btn-sm input-submit">保存并继续添加</button></c:if>
                    <button type="button" data_submit_type="submit_cancel" class="btn btn-danger btn-sm input-submit">取消</button>
                    <span id="edit_notice"></span>
                </div>
            </footer>
        </section>
    </aside>
</section>

<jsp:include page="../wrapper.suffix.jsp"/>
<#if hasDate == "true">
<script src="${meiYuanFuHao}{STATIC_URL}/plugins/datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<script src="${meiYuanFuHao}{STATIC_URL}/plugins/datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
</#if>
<script src="${meiYuanFuHao}{STATIC_URL}/back/modules/${moduleName}/js/${noModuleName}.edit.js" type="text/javascript"></script>
<!-- / modal - 编辑-->
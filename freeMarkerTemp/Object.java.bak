package com.bluemobi.po${packageName};

<#assign hasBigDecimal = "" />
<#assign hasDate = "" />
<#list propertyList as p>
    <#if p.javaType == "BigDecimal">
        <#assign hasBigDecimal = "true" />
    <#elseif p.javaType == "Date">
        <#assign hasDate = "true" />
    </#if>
</#list>
<#if hasBigDecimal == "true">
import java.math.BigDecimal;
</#if>
<#if hasDate == "true">
import java.util.Date;
</#if>

import com.appcore.model.AbstractObject;

/**
 * 【${note}】持久化对象 数据库表：${dbName}
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
public class ${nameFU} extends AbstractObject {

    public static final long serialVersionUID = 1L;

<#list propertyList as p>
    // ${p.note}
    private ${p.javaType} ${p.name};
</#list>

<#list propertyList as p>
    /** 获取 ${p.note} */
    public ${p.javaType} get${p.nameFU}() {
        return ${p.name};
    }

    /** 设置 ${p.note} */
    public void set${p.nameFU}(${p.javaType} ${p.name}) {
        this.${p.name} = ${p.name};
    }

</#list>
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("${nameFU}");
        <#list propertyList as p>
        sb.append("<#if p_index==0>{</#if><#if p_index!=0>, </#if>${p.name}=").append(${p.name});
        </#list>
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ${nameFU}) {
            ${nameFU} ${name} = (${nameFU}) obj;
            if (<#list pkPropertyList as pk>this.get${pk.nameFU}().equals(${name}.get${pk.nameFU}())<#if pk_has_next> && </#if></#list>) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String pkStr = "" + <#list pkPropertyList as pk>this.get${pk.nameFU}()<#if pk_has_next> + </#if></#list>;
        return pkStr.hashCode();
    }

}
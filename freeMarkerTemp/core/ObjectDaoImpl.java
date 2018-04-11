package com.yundong.${dbNameT}dao.impl${packageName};

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;



import com.yundong.m1_core.common.BaseUtil;

import com.yundong.api.dao.AbstractDao;
import com.yundong.${dbNameT}dao${packageName}.I${nameFU}Dao;
import com.yundong.${dbNameT}entity.${nameFU};

/**
 * 【${note}】 数据访问对象 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Repository
public class ${nameFU}DaoImpl extends AbstractDao implements I${nameFU}Dao {

    public static final String PREFIX = ${nameFU}DaoImpl.class.getName() + ".";

    //数据库表所有字段
    //<#list propertyList as p>${p.dbName}<#if p_has_next>,</#if></#list>
    @Override
    public String getPrefix() {
        return PREFIX;
    }
    @Override
  public int save${nameFU}(${nameFU} _${name}) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("insert into "+BaseUtil.database_name+".${dbName} (");
        <#list propertyList as p>
        strSql.append("${p.dbName}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")values (");
        <#list propertyList as p>
        strSql.append("${maoHao}${p.name}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")");
        SqlParameterSource source = new BeanPropertySqlParameterSource(_${name});
        KeyHolder keyHolder = new GeneratedKeyHolder();
        return  this.namedJdbcTemplate.update(strSql.toString(),  source, keyHolder);   		 
    }
	@Override
  public ${nameFU} get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.javaType}	_${pk.dbName}</#list>) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("select "); 
    	<#list propertyList as p>
    	strSql.append("${p.dbName}<#if p_has_next>,</#if>");
	    </#list>	
	    strSql.append("  from "+BaseUtil.database_name+".${dbName}  ");
	    strSql.append(" where ");
	    <#list pkPropertyList as pk>
		<#if pk_index!=0>strSql.append(" and ");</#if>
		strSql.append("${pk.dbName}=${maoHao}${pk.dbName}");
	</#list>
	 MapSqlParameterSource paramSource = new MapSqlParameterSource();
		<#list pkPropertyList as pk>		
		 paramSource.addValue("${pk.dbName}",_${pk.dbName});
	</#list>
	 List<${nameFU}> list = this.namedJdbcTemplate.query(strSql.toString(), paramSource, this.createRowMapper(${nameFU}.class));
       if (list.size() > 0) {
		return list.get(0);
     }
     return null;
   }
  @Override
  public int update${nameFU}(${nameFU} _${name}) {
	  StringBuilder strSql=new StringBuilder();
  	 strSql.append("update "+BaseUtil.database_name+".${dbName}  set "); 
		<#list propertyList as p>	
		strSql.append("${p.dbName}=${maoHao}${p.name},");		
		</#list>
		strSql.append(" where ");
		<#list pkPropertyList as pk>
		strSql.append("<#if pk_index!=0> and</#if>${pk.dbName}=${maoHao}${pk.name} ");
		</#list>
		
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(_${name});
		return namedJdbcTemplate.update(strSql.toString(), paramSource);
  }
}

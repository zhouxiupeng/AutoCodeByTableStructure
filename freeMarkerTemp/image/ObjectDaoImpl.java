package com.yundong.${dbNameT}dao.impl${packageName};

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.yundong.sharding.core.ShardingManager;
import com.yundong.sharding.core.ShardingNamedParameterJdbcTemplate;
import com.yundong.${dbNameT}dao${packageName}.I${nameFU}Dao;
import com.yundong.image.storage.common.AbstractDao;
import com.yundong.${dbNameT}entity.${nameFU};

/**
 * 【${note}】 数据访问对象 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Repository
public class ${nameFU}DaoImpl  extends AbstractDao implements I${nameFU}Dao {

    public static final String PREFIX = ${nameFU}DaoImpl.class.getName() + ".";
   
    //数据库表所有字段
    //<#list propertyList as p>${p.dbName}<#if p_has_next>,</#if></#list>
    @Override
    public String getPrefix() {
        return PREFIX;
    }
    @Override
  public int save${nameFU}(long key,${nameFU} ${name}) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("insert into "+shardingNameParameterJdbcTemplate.getDbNameByShardKey(key)+".${dbName} (");
        <#list propertyList as p>
        strSql.append("${p.dbName}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")values (");
        <#list propertyList as p>
        strSql.append("${maoHao}${p.name}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")");
        SqlParameterSource source = new BeanPropertySqlParameterSource(${name});
        KeyHolder keyHolder = new GeneratedKeyHolder();
        return  this.shardingNameParameterJdbcTemplate.update(key,strSql.toString(),  source, keyHolder);   		 
    }
	@Override
  public ${nameFU} get${nameFU}ByID(long key, <#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.javaType}	${pk.dbName}</#list>) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("select "); 
    	<#list propertyList as p>
    	strSql.append("${p.dbName}<#if p_has_next>,</#if>");
	    </#list>	
	    strSql.append("  from "+shardingNameParameterJdbcTemplate.getDbNameByShardKey(key)+".${dbName}  ");
	    strSql.append(" where ");
	    <#list pkPropertyList as pk>
		<#if pk_index!=0>strSql.append(" and ");</#if>
		strSql.append("${pk.dbName}=${maoHao}${pk.dbName}");
	</#list>
	 MapSqlParameterSource paramSource = new MapSqlParameterSource();
		<#list pkPropertyList as pk>		
		 paramSource.addValue("${pk.dbName}",${pk.dbName});
	</#list>
	 List<${nameFU}> list = this.shardingNameParameterJdbcTemplate.query(key,strSql.toString(), paramSource, this.createRowMapper(${nameFU}.class));
       if (list.size() > 0) {
		return list.get(0);
     }
     return null;
   }
  @Override
  public int update${nameFU}(long key, ${nameFU} ${name}) {
	  StringBuilder strSql=new StringBuilder();
  	 strSql.append("update "+shardingNameParameterJdbcTemplate.getDbNameByShardKey(key)+".${dbName}  set "); 
		<#list propertyList as p>	
		strSql.append("${p.dbName}=${maoHao}${p.name}<#if p_has_next>,</#if>");		
		</#list>
		strSql.append(" where ");
		<#list pkPropertyList as pk>
		strSql.append("<#if pk_index!=0> and</#if>${pk.dbName}=${maoHao}${pk.name} ");
		</#list>
		
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(${name});
		return shardingNameParameterJdbcTemplate.update(key,strSql.toString(), paramSource);
  }
}

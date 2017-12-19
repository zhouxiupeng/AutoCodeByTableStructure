package com.bluemobi.daoimpl${packageName};

import org.springframework.stereotype.Repository;

import com.appcore.dao.impl.MyBatisBaseDaoImpl;
import com.bluemobi.dao${packageName}.${nameFU}Dao;

/**
 * 【${note}】 数据访问对象 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Repository(value = "${name}Dao")
public class ${nameFU}DaoImpl extends AbstractDao implements I${nameFU}Dao {

    public static final String PREFIX = ${nameFU}Dao.class.getName() + ".";

    //数据库表所有字段
    //<#list propertyList as p>${p.dbName}<#if p_has_next>,</#if></#list>
    @Override
    public String getPrefix() {
        return PREFIX;
    }
    @Override
  public int save${nameFU}(${nameFU}VO _${name}) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("insert into "+ConstUtil.database_name+".${dbName} (";    
    	//region 代码自动生成脚本
        <#list propertyList as p>
        strSql.append("${p.dbName}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")values (");
        <#list propertyList as p>
        strSql.append("${maoHao}${p.name}<#if p_has_next>,</#if>");
        </#list>
        strSql.append(")";
      //end
        SqlParameterSource source = new BeanPropertySqlParameterSource(_${name});
        KeyHolder keyHolder = new GeneratedKeyHolder();
        return  this.namedJdbcTemplate.update(strSql.toString(),  source, keyHolder);   		 
    }
	@Override
  public ${nameFU}VO get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> and</#if>${pk.javaType}	_${pk.dbName}</#list>) {
    	StringBuilder strSql=new StringBuilder();
    	strSql.append("select "+ConstUtil.database_name+".${dbName} (";    
    	//region 代码自动生成脚本
    	<#list propertyList as p>
    	strSql.append("${p.dbName}<#if p_has_next>,</#if>");
	    </#list>	    
        //end
	 MapSqlParameterSource paramSource = new MapSqlParameterSource();
		<#list pkPropertyList as pk>
		<#if pk_index!=0> and</#if>
        paramSource.addValue("${pk.dbName}",_${pk.dbName});
	</#list>
	 List<${nameFU}VO> list = this.namedJdbcTemplate.query(strSql.toString(), paramSource, this.createRowMapper(${nameFU}VO.class));
       if (list.size() > 0) {
		return list.get(0);
     }
     return null;
   }
}

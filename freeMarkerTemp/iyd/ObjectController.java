package com.bluemobi.controller.back${packageName};
<#assign hasDate = "" />
<#list propertyList as p>
    <#if p.javaType == "Date">
        <#assign hasDate = "true" />
    </#if>
</#list>
<#if hasDate == "true">
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
</#if>
import java.util.HashMap;
import java.util.Map;

<#if hasDate == "true">
import javax.servlet.http.HttpServletRequest;
</#if>

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
<#if hasDate == "true">
import org.springframework.beans.propertyeditors.CustomDateEditor;
</#if>
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

<#if hasDate == "true">
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
</#if>
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appcore.page.Page;
import com.bluemobi.controller.AbstractBackController;
import com.bluemobi.po${packageName}.${nameFU};
import com.bluemobi.service${packageName}.${nameFU}Service;
import com.bluemobi.to.ResultTO;



/**
 * 【${note}】控制器
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Controller
@RequestMapping("back/${name}")
public class ${nameFU}Controller extends AbstractBackController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(${nameFU}Controller.class);
    
    @Autowired
    private ${nameFU}Service ${name}Service;
    

    <#if hasDate == "true">
    /**
     * 将请求参数中的字符串转换成日期格式
     * @param request
     * @param binder
     * @return string
     * @author ${author}
     * @date ${timeMonth}
     */
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//请求参数中的日期字符串格式
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }
    </#if>
    
    /**
     * 进入【${note}】主页
     * @param model
     * @return string
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/${moduleName}/${noModuleName}.index";
    }
    
    /**
     * 分页查询【${note}】
     * @param key
     * @param pageSize
     * @param pageIndex
     * @return
     * @return Page<Map<String,Object>>
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "page", method = RequestMethod.POST)
    @ResponseBody
    public Page<Map<String, Object>> page(String key, int pageSize, int pageIndex) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", key);
        Page<Map<String, Object>> page = ${name}Service.page(map,pageIndex, pageSize);
        return page;
    }
    
    /**
     * 查询【${note}】详情
     * @param model
     * @return string
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(Model model, <#list pkPropertyList as pk><#if pk_index!=0>, </#if>${pk.javaType} ${pk.name}</#list>) {
        // 加载公共数据
        initIndex(model);
        Map<Object, Object> map = new HashMap<Object, Object>();
        <#list pkPropertyList as pk>
        map.put("${pk.name}", ${pk.name}); 
        </#list>
        model.addAttribute("${name}", ${name}Service.selectObject(map));
        return "back/${moduleName}/${noModuleName}.detail";
    }
    
    /**
     * 进入新增【${note}】页面
     * @param model
     * @return string
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/${moduleName}/${noModuleName}.edit";
    }
    
    /**
     * 新增【${note}】数据
     * @param ${name}
     * @return ResultTO
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO add${nameFU}(@ModelAttribute ${nameFU} ${name}, BindingResult result) {
        try {
            ${name}Service.insert(${name});
            LOGGER.info("用户【{}】添加${note}数据【{}】成功", new Object[] { this.getUserId(), ${name} } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】添加${note}数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), ${name}, e });
            return ResultTO.newFailResultTO("添加失败", null);
        }
        return ResultTO.newSuccessResultTO("添加成功", null);
    }
    
    /**
     * 进入修改【${note}】页面
     * @param model
     * @return string
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(Model model, <#list pkPropertyList as pk><#if pk_index!=0>, </#if>${pk.javaType} ${pk.name}</#list>) {
        // 加载公共数据
        initIndex(model);
        Map<String, Object> map = new HashMap<String, Object>();
        <#list pkPropertyList as pk>
        map.put("${pk.name}", ${pk.name}); 
        </#list>
        model.addAttribute("${name}", ${name}Service.selectObject(map));
        return "back/${moduleName}/${noModuleName}.edit";
    }
    
    /**
     * 修改【${note}】数据
     * @param ${name}
     * @return ResultTO
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO edit${nameFU}(@ModelAttribute ${nameFU} ${name}, BindingResult result) {
        try {
            ${name}Service.update(${name});
            LOGGER.info("用户【{}】修改${note}数据【{}】成功", new Object[] { this.getUserId(), ${name} } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】修改${note}数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), ${name}, e });
            return ResultTO.newFailResultTO("更新失败", null);
        }
        return ResultTO.newSuccessResultTO("更新成功", null);
    }
    
    /**
     * 删除【${note}】数据
     <#list pkPropertyList as pk>
     * @param ${pk.name}
     </#list>
     * @return ResultTO
     * @author ${author}
     * @date ${timeMonth}
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO delete${nameFU}(<#list pkPropertyList as pk><#if pk_index!=0>, </#if>${pk.javaType} ${pk.name}</#list>) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
         <#list pkPropertyList as pk>
            map.put("${pk.name}", ${pk.name}); 
         </#list>
            ${name}Service.delete(map);
            LOGGER.info("用户【{}】删除${note}数据【{}】成功", new Object[] { this.getUserId(), <#list pkPropertyList as pk>${pk.name}</#list> });
        } catch (Exception e) {
            LOGGER.error("用户【{}】删除${note}数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), <#list pkPropertyList as pk>${pk.name}</#list>, e });
            return ResultTO.newFailResultTO("删除失败", null);
        }
        return ResultTO.newSuccessResultTO("删除成功", null);
    }
    
}

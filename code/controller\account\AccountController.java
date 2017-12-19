package com.bluemobi.controller.back.account;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appcore.page.Page;
import com.bluemobi.controller.AbstractBackController;
import com.bluemobi.po.account.Account;
import com.bluemobi.service.account.AccountService;
import com.bluemobi.to.ResultTO;



/**
 * 【账户信息】控制器
 * 
 * @author AutoCode 309444359@qq.com
 * @date 2017-12
 * 
 */
@Controller
@RequestMapping("back/account")
public class AccountController extends AbstractBackController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
    
    @Autowired
    private AccountService accountService;
    

    /**
     * 将请求参数中的字符串转换成日期格式
     * @param request
     * @param binder
     * @return string
     * @author AutoCode
     * @date 2017-12
     */
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//请求参数中的日期字符串格式
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }
    
    /**
     * 进入【账户信息】主页
     * @param model
     * @return string
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/account/account.index";
    }
    
    /**
     * 分页查询【账户信息】
     * @param key
     * @param pageSize
     * @param pageIndex
     * @return
     * @return Page<Map<String,Object>>
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "page", method = RequestMethod.POST)
    @ResponseBody
    public Page<Map<String, Object>> page(String key, int pageSize, int pageIndex) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", key);
        Page<Map<String, Object>> page = accountService.page(map,pageIndex, pageSize);
        return page;
    }
    
    /**
     * 查询【账户信息】详情
     * @param model
     * @return string
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(Model model, Long accountId) {
        // 加载公共数据
        initIndex(model);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("accountId", accountId); 
        model.addAttribute("account", accountService.selectObject(map));
        return "back/account/account.detail";
    }
    
    /**
     * 进入新增【账户信息】页面
     * @param model
     * @return string
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/account/account.edit";
    }
    
    /**
     * 新增【账户信息】数据
     * @param account
     * @return ResultTO
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO addAccount(@ModelAttribute Account account, BindingResult result) {
        try {
            accountService.insert(account);
            LOGGER.info("用户【{}】添加账户信息数据【{}】成功", new Object[] { this.getUserId(), account } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】添加账户信息数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), account, e });
            return ResultTO.newFailResultTO("添加失败", null);
        }
        return ResultTO.newSuccessResultTO("添加成功", null);
    }
    
    /**
     * 进入修改【账户信息】页面
     * @param model
     * @return string
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(Model model, Long accountId) {
        // 加载公共数据
        initIndex(model);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("accountId", accountId); 
        model.addAttribute("account", accountService.selectObject(map));
        return "back/account/account.edit";
    }
    
    /**
     * 修改【账户信息】数据
     * @param account
     * @return ResultTO
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO editAccount(@ModelAttribute Account account, BindingResult result) {
        try {
            accountService.update(account);
            LOGGER.info("用户【{}】修改账户信息数据【{}】成功", new Object[] { this.getUserId(), account } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】修改账户信息数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), account, e });
            return ResultTO.newFailResultTO("更新失败", null);
        }
        return ResultTO.newSuccessResultTO("更新成功", null);
    }
    
    /**
     * 删除【账户信息】数据
     * @param accountId
     * @return ResultTO
     * @author AutoCode
     * @date 2017-12
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO deleteAccount(Long accountId) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("accountId", accountId); 
            accountService.delete(map);
            LOGGER.info("用户【{}】删除账户信息数据【{}】成功", new Object[] { this.getUserId(), accountId });
        } catch (Exception e) {
            LOGGER.error("用户【{}】删除账户信息数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), accountId, e });
            return ResultTO.newFailResultTO("删除失败", null);
        }
        return ResultTO.newSuccessResultTO("删除成功", null);
    }
    
}

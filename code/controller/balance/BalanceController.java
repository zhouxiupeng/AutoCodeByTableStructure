package com.bluemobi.controller.back;
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
import com.bluemobi.po.Balance;
import com.bluemobi.service.BalanceService;
import com.bluemobi.to.ResultTO;



/**
 * 【账户余额表】控制器
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
@Controller
@RequestMapping("back/balance")
public class BalanceController extends AbstractBackController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(BalanceController.class);
    
    @Autowired
    private BalanceService balanceService;
    

    /**
     * 将请求参数中的字符串转换成日期格式
     * @param request
     * @param binder
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//请求参数中的日期字符串格式
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }
    
    /**
     * 进入【账户余额表】主页
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/balance/balance.index";
    }
    
    /**
     * 分页查询【账户余额表】
     * @param key
     * @param pageSize
     * @param pageIndex
     * @return
     * @return Page<Map<String,Object>>
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "page", method = RequestMethod.POST)
    @ResponseBody
    public Page<Map<String, Object>> page(String key, int pageSize, int pageIndex) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", key);
        Page<Map<String, Object>> page = balanceService.page(map,pageIndex, pageSize);
        return page;
    }
    
    /**
     * 查询【账户余额表】详情
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(Model model, Long balanceId) {
        // 加载公共数据
        initIndex(model);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("balanceId", balanceId); 
        model.addAttribute("balance", balanceService.selectObject(map));
        return "back/balance/balance.detail";
    }
    
    /**
     * 进入新增【账户余额表】页面
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/balance/balance.edit";
    }
    
    /**
     * 新增【账户余额表】数据
     * @param balance
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO addBalance(@ModelAttribute Balance balance, BindingResult result) {
        try {
            balanceService.insert(balance);
            LOGGER.info("用户【{}】添加账户余额表数据【{}】成功", new Object[] { this.getUserId(), balance } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】添加账户余额表数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balance, e });
            return ResultTO.newFailResultTO("添加失败", null);
        }
        return ResultTO.newSuccessResultTO("添加成功", null);
    }
    
    /**
     * 进入修改【账户余额表】页面
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(Model model, Long balanceId) {
        // 加载公共数据
        initIndex(model);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("balanceId", balanceId); 
        model.addAttribute("balance", balanceService.selectObject(map));
        return "back/balance/balance.edit";
    }
    
    /**
     * 修改【账户余额表】数据
     * @param balance
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO editBalance(@ModelAttribute Balance balance, BindingResult result) {
        try {
            balanceService.update(balance);
            LOGGER.info("用户【{}】修改账户余额表数据【{}】成功", new Object[] { this.getUserId(), balance } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】修改账户余额表数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balance, e });
            return ResultTO.newFailResultTO("更新失败", null);
        }
        return ResultTO.newSuccessResultTO("更新成功", null);
    }
    
    /**
     * 删除【账户余额表】数据
     * @param balanceId
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO deleteBalance(Long balanceId) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("balanceId", balanceId); 
            balanceService.delete(map);
            LOGGER.info("用户【{}】删除账户余额表数据【{}】成功", new Object[] { this.getUserId(), balanceId });
        } catch (Exception e) {
            LOGGER.error("用户【{}】删除账户余额表数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balanceId, e });
            return ResultTO.newFailResultTO("删除失败", null);
        }
        return ResultTO.newSuccessResultTO("删除成功", null);
    }
    
}

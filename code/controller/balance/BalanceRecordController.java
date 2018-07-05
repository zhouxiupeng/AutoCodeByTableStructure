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
import com.bluemobi.po.BalanceRecord;
import com.bluemobi.service.BalanceRecordService;
import com.bluemobi.to.ResultTO;



/**
 * 【账号交易明细数据】控制器
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
@Controller
@RequestMapping("back/balanceRecord")
public class BalanceRecordController extends AbstractBackController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(BalanceRecordController.class);
    
    @Autowired
    private BalanceRecordService balanceRecordService;
    

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
     * 进入【账号交易明细数据】主页
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/balance/record.index";
    }
    
    /**
     * 分页查询【账号交易明细数据】
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
        Page<Map<String, Object>> page = balanceRecordService.page(map,pageIndex, pageSize);
        return page;
    }
    
    /**
     * 查询【账号交易明细数据】详情
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(Model model, Long balanceRecordId) {
        // 加载公共数据
        initIndex(model);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("balanceRecordId", balanceRecordId); 
        model.addAttribute("balanceRecord", balanceRecordService.selectObject(map));
        return "back/balance/record.detail";
    }
    
    /**
     * 进入新增【账号交易明细数据】页面
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        // 加载公共数据
        initIndex(model);
        return "back/balance/record.edit";
    }
    
    /**
     * 新增【账号交易明细数据】数据
     * @param balanceRecord
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO addBalanceRecord(@ModelAttribute BalanceRecord balanceRecord, BindingResult result) {
        try {
            balanceRecordService.insert(balanceRecord);
            LOGGER.info("用户【{}】添加账号交易明细数据数据【{}】成功", new Object[] { this.getUserId(), balanceRecord } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】添加账号交易明细数据数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balanceRecord, e });
            return ResultTO.newFailResultTO("添加失败", null);
        }
        return ResultTO.newSuccessResultTO("添加成功", null);
    }
    
    /**
     * 进入修改【账号交易明细数据】页面
     * @param model
     * @return string
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(Model model, Long balanceRecordId) {
        // 加载公共数据
        initIndex(model);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("balanceRecordId", balanceRecordId); 
        model.addAttribute("balanceRecord", balanceRecordService.selectObject(map));
        return "back/balance/record.edit";
    }
    
    /**
     * 修改【账号交易明细数据】数据
     * @param balanceRecord
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO editBalanceRecord(@ModelAttribute BalanceRecord balanceRecord, BindingResult result) {
        try {
            balanceRecordService.update(balanceRecord);
            LOGGER.info("用户【{}】修改账号交易明细数据数据【{}】成功", new Object[] { this.getUserId(), balanceRecord } );
        } catch (Exception e) {
            LOGGER.error("用户【{}】修改账号交易明细数据数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balanceRecord, e });
            return ResultTO.newFailResultTO("更新失败", null);
        }
        return ResultTO.newSuccessResultTO("更新成功", null);
    }
    
    /**
     * 删除【账号交易明细数据】数据
     * @param balanceRecordId
     * @return ResultTO
     * @author 代码自动生成
     * @date 2017-12
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public ResultTO deleteBalanceRecord(Long balanceRecordId) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("balanceRecordId", balanceRecordId); 
            balanceRecordService.delete(map);
            LOGGER.info("用户【{}】删除账号交易明细数据数据【{}】成功", new Object[] { this.getUserId(), balanceRecordId });
        } catch (Exception e) {
            LOGGER.error("用户【{}】删除账号交易明细数据数据【{}】失败 Exception:【{}】", new Object[] { this.getUserId(), balanceRecordId, e });
            return ResultTO.newFailResultTO("删除失败", null);
        }
        return ResultTO.newSuccessResultTO("删除成功", null);
    }
    
}

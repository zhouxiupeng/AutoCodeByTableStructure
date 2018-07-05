package com.yundong.api.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.api.dao.IYdTopicInfoHdnowaterDao;
import com.yundong.api.service.IYdTopicInfoHdnowaterService;
import com.yundong.api.entity.YdTopicInfoHdnowater;

/**
 * 【】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2018-07
 * 
 */
@Service
public class YdTopicInfoHdnowaterServiceImpl  implements IYdTopicInfoHdnowaterService {

    @Autowired
    private IYdTopicInfoHdnowaterDao ydTopicInfoHdnowaterDaoImpl;


    @Override
    public int saveYdTopicInfoHdnowater(YdTopicInfoHdnowater ydTopicInfoHdnowater) {
    	return this.ydTopicInfoHdnowaterDaoImpl.saveYdTopicInfoHdnowater(ydTopicInfoHdnowater);
    }

    @Override
    public YdTopicInfoHdnowater getYdTopicInfoHdnowaterByID(Long	topic_info_id) {
    	return this.ydTopicInfoHdnowaterDaoImpl.getYdTopicInfoHdnowaterByID(topic_info_id);
    }
    @Override
    public int updateYdTopicInfoHdnowater(YdTopicInfoHdnowater ydTopicInfoHdnowater) {
    	return this.ydTopicInfoHdnowaterDaoImpl.updateYdTopicInfoHdnowater(ydTopicInfoHdnowater);
    }
}

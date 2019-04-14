package com.gf.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gf.crm.entity.ClueEntity;
import com.gf.crm.vo.*;


/**
 * 线索主信息表
 *
 * @author 阿甘
 * @email zhaoyf@weilaicheng.com
 * @date 2019-02-26 12:16:22
 */
public interface ClueService extends IService<ClueEntity> {
    
    /**
     * 查询详情页top信息
     *
     * @param clueId
     * @return
     */
    ClueEntity queryClueTopInfo(String clueId);
    
    
}


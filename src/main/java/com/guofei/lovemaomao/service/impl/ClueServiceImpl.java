package com.gf.crm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gf.crm.dao.ClueDao;
import com.gf.crm.entity.ClueEntity;
import com.gf.crm.service.ClueService;
import com.gf.crm.vo.ClueTopInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 线索主信息表
 *
 * @author 阿甘
 * @email zhaoyf@weilaicheng.com
 * @date 2019-02-26 12:16:22
 */
@Slf4j
@Service("clueService")
@Transactional(rollbackFor = Throwable.class)
public class ClueServiceImpl extends ServiceImpl<ClueDao, ClueEntity> implements ClueService {
    
    @Autowired
    private ClueDao clueDao;
    
    
    @Override
    public ClueEntity queryClueTopInfo(String clueId) {
        ClueEntity clueEntity = this.getById(clueId);
        return clueEntity;
    }
}

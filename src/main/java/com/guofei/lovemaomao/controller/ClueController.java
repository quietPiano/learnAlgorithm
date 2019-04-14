package com.gf.crm.controller;

import com.gf.crm.entity.ClueEntity;
import com.gf.crm.service.ClueService;
import com.gf.crm.vo.ClueTopInfoVO;
import com.sun.xml.internal.ws.api.pipe.SyncStartForAsyncFeature;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

/**
 * ${DESCRIPTION}
 *
 * @author 阿飞
 * @email guof@weilaicheng.com
 * @date 2019-03-17 21:42
 */
@Slf4j
@Api(tags = "线索信息相关")
@RestController
@RequestMapping("/clue")
public class ClueController {
    @Autowired
    private ClueService clueService;

    /**
     * 查询头部信息
     *
     * @param clueId
     * @return
     */
    @ApiOperation("根据线索ID查询详情页头部信息")
    @GetMapping("/top/info")
    @ResponseBody
    public ClueEntity getTopInfo(@NotBlank @ApiParam(value = "线索ID", required = true) @RequestParam String clueId) {

        ClueEntity clueEntity = clueService.queryClueTopInfo(clueId);
        return clueEntity;
    }
}

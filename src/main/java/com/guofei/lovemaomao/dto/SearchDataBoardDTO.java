package com.gf.crm.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据看板搜索条件
 *
 * @author 阿甘
 * @email zhaoyf@weilaicheng.com
 * @date 2019-03-02 16:07
 */
@Data
@ApiModel
public class SearchDataBoardDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("销售中心ID")
    private String centerId;

    @ApiModelProperty("销售团队ID")
    private String teamId;

    @ApiModelProperty("销售小组ID")
    private String groupId;

    @ApiModelProperty("销售ID")
    private String userId;

    @ApiModelProperty("统计开始时间")
    private Date startDate;

    @ApiModelProperty("统计结束时间")
    private Date endDate;

    @ApiModelProperty(value = "展示类型", example = "日")
    private String showType = "日";

    @ApiModelProperty(value = "页码", example = "1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数", example = "20")
    private Long pageSize = 20L;
}

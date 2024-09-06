package com.mashang.elearning.domain.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("查询所有班级")
@Data
public class MsClassAllVo {

    @ApiModelProperty("班级主键")
    private Long classId;

    @ApiModelProperty("班级名称")
    private String className;
}

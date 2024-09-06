package com.mashang.elearning.domain.Vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("班级分页模型")
public class MsClassPageVo {

    @ApiModelProperty("班级主键")
    private Long classId;

    @ApiModelProperty("班级名称")
    private String className;

    @ApiModelProperty("班级备注")
    private String remark;
}

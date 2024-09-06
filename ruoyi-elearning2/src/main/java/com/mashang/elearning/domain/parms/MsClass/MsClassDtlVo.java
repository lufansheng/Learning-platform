package com.mashang.elearning.domain.parms.MsClass;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("班级详情模型")
@Data
public class MsClassDtlVo {

    @ApiModelProperty("班级主键")
    private Long classId;

    @ApiModelProperty("班级名称")
    private String className;

    @ApiModelProperty("班级备注")
    private String remark;

}

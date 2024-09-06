package com.mashang.elearning.domain.parms.MsClass;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("添加模型")
public class MsClassCreate {

    @ApiModelProperty(value = "班级名称",required = true)
    @NotBlank(message = "班级名称不能为空")
    private String className;

    @ApiModelProperty("备注")
    private String remark;
}

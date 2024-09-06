package com.mashang.elearning.domain.parms.MsClass;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("修改模型")
public class MsClassUpdate {

    @NotNull(message = "班级ID不能为null")
    private Long classId;

    @ApiModelProperty(value = "班级名称",required = true)
    @NotBlank(message = "班级名称不能为空")
    private String className;

    @ApiModelProperty("备注")
    private String remark;


}

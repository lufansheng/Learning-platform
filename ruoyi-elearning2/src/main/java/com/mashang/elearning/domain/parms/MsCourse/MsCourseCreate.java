package com.mashang.elearning.domain.parms.MsCourse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ApiModel("课程添加参数")
@Data
public class MsCourseCreate {

    @NotNull(message = "班级id不能为null")
    @ApiModelProperty(value = "班级id",required = true)
    private Long classId;

    @NotNull(message = "教师id不能为null")
    @ApiModelProperty(value = "教师id",required = true)
    private Long teacherId;

    @NotBlank(message = "课程名称不能为null")
    @ApiModelProperty(value = "课程名称",required = true)
    private String courseName;

    @NotBlank(message = "课程封面不能为null")
    @ApiModelProperty(value = "课程封面",required = true)
    private String courseCover;

    @ApiModelProperty("备注")
    private String remark;

}

package com.mashang.elearning.domain.Vo.stu;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("学生端课程分页查询")
public class StuCoursePageVo {

    @ApiModelProperty("课程id")
    private Long courseId;

    @ApiModelProperty("课程id")
    private String courseName;

    @ApiModelProperty("课程id")
    private String courseCover;

    @ApiModelProperty("课程id")
    private Long teacherId;

    @ApiModelProperty("课程id")
    private String tearcharName;

    @ApiModelProperty("课程id")
    private String remark;
}

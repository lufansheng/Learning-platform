package com.mashang.elearning.domain.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("查询课程分页")
@Data
public class MsCoursePageVo {

    @ApiModelProperty("课程id")
    private Long courseId;

    @ApiModelProperty("课程id")
    private String courseName;

    @ApiModelProperty("课程id")
    private String courseCover;

    @ApiModelProperty("课程id")
    private Long classId;

    @ApiModelProperty("课程id")
    private String className;

    @ApiModelProperty("课程id")
    private Long teacherId;

    @ApiModelProperty("课程id")
    private String tearcharName;

    @ApiModelProperty("课程id")
    private String remark;
}

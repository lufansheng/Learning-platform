package com.mashang.elearning.domain.Vo;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("课程详情查询模型")
@Data
public class MsCourseDtlVo {

  @ApiModelProperty("课程id")
  private Long courseId;

  @ApiModelProperty("课程名称")
  private String courseName;

  @ApiModelProperty("课程封面")
  private String courseCover;

  @ApiModelProperty("班级id")
  private Long classId;

  @ApiModelProperty("教师id")
  private Long teacherId;

  @ApiModelProperty("课程介绍")
  private String remark;

  @ApiModelProperty("班级名称")
  private String className;

  @ApiModelProperty("教师名称")
  private String teacherName;
}

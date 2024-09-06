package com.mashang.elearning.domain.parms.MsLesson;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ApiModel("节的作业添加修改参数")
@Data
public class MsLessonHomeworkUpdate {

  @ApiModelProperty(value = "节id",required = true)
  @NotNull(message = "节id不为null")
  private Long lessonId;

  @ApiModelProperty("发布状态")
  private String homeworkPublish;

  @ApiModelProperty("作业内容")
  private String homework;

}

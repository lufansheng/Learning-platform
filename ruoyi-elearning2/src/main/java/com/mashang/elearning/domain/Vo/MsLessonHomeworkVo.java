package com.mashang.elearning.domain.Vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel("节的作业添加修改参数")
@Data
public class MsLessonHomeworkVo {

  @ApiModelProperty(value = "节id",required = true)
  @NotNull(message = "节id不为null")
  private Long lessonId;

  @ApiModelProperty("作业提交地址")
  private String homeworkUrl;

  @ApiModelProperty("是否通过")
  private String pass;

  @ApiModelProperty("作业内容")
  private String homework;

}

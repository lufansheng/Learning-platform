package com.mashang.elearning.domain.Vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel("节详情参数")
@Data
public class MsLessonDtlVo {

  @NotNull(message = "节id不为null")
  private Long lessonId;

  private String lessonName;

  private Long lessonSort;

  @ApiModelProperty("视频文件名称")
  private String playName;

  @ApiModelProperty("视频播放地址")
  private String playUrl;

  @ApiModelProperty("课件名称")
  private String coursewareName;

  @ApiModelProperty("课件地址")
  private String coursewareUrl;

}

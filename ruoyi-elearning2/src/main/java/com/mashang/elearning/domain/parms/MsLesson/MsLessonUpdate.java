package com.mashang.elearning.domain.parms.MsLesson;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("节添加参数")
@Data
public class MsLessonUpdate {


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

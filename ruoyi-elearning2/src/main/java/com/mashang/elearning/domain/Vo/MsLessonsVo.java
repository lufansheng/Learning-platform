package com.mashang.elearning.domain.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("节模块")
public class MsLessonsVo {

    @ApiModelProperty("节id")
    private Long lessonId;

    @ApiModelProperty("节名称")
    private String lessonName;

    @ApiModelProperty("节排序")
    private Long lessonSort;

}

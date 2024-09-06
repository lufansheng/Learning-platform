package com.mashang.elearning.domain.Vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("章查询")
public class MsChapterLessonsVo {
    @ApiModelProperty("节信息")
    private Long chapterId;

    @ApiModelProperty("节信息")
    private String chapterName;

    @ApiModelProperty("节信息")
    private Long chapterSort;

    @ApiModelProperty("节信息")
    private Long courseId;

    @ApiModelProperty("节信息")
    private List<MsLessonsVo> lessons;
}

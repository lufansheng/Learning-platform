package com.mashang.elearning.domain.parms.MsChapter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("修改接口")
public class MsChapterUpdate {

    @NotNull(message = "课程id不为null")
    private Long courseId;

    @NotNull(message = "章id不为null")
    private Long chapterId;

    @NotBlank(message = "章名称不为null")
    @ApiModelProperty("章名称")
    private String chapterName;

    @NotNull(message = "章序号不为null")
    private Long chapterSort;
}

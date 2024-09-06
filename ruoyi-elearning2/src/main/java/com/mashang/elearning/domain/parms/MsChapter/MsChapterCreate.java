package com.mashang.elearning.domain.parms.MsChapter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("章添加")
public class MsChapterCreate {

    @NotNull(message = "课程id不为null")
    private Long courseId;

    @NotBlank(message = "章名称不为null")
    @ApiModelProperty("章名称")
    private String chapterName;

    @NotNull(message = "章序号不为null")
    private Long chapterSort;
}

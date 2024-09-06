package com.mashang.elearning.domain.parms.MsLesson;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("节添加")
public class MsLessonCreate {

    @NotNull(message = "课程id不为null")
    private Long courseId;

    @NotNull(message = "章id不为null")
    private Long chapterId;

    @NotBlank(message = "章名称不为null")
    @ApiModelProperty("节名称")
    private String lessonName;

    @NotNull(message = "章序号不为null")
    private Long lessonSort;
}

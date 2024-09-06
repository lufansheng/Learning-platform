package com.mashang.elearning.domain.Vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;


@Data
@ApiModel("章详情")
public class MsChapterDtlVo {
    @TableId(type = IdType.AUTO)
    private Long chapterId;
    private Long courseId;
    private String chapterName;
    private Long chapterSort;
}

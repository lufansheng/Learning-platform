package com.mashang.elearning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashang.elearning.domain.MsChapter;
import com.mashang.elearning.domain.Vo.MsChapterLessonsVo;

import java.util.List;

public interface MsChapterMapper extends BaseMapper<MsChapter> {
    List<MsChapterLessonsVo> list(Long courseId);
}

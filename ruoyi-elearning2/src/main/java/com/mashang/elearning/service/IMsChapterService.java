package com.mashang.elearning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashang.elearning.domain.MsChapter;
import com.mashang.elearning.domain.Vo.MsChapterLessonsVo;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterCreate;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterUpdate;

import java.util.List;

public interface IMsChapterService extends IService<MsChapter> {

    List<MsChapterLessonsVo> list(Long courseId);

    int delete(Long chapterId);

    int create(MsChapterCreate create);

    int update(MsChapterUpdate update);
}

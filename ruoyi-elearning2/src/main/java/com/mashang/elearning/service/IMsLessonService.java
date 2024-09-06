package com.mashang.elearning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsLessonsVo;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonCreate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonUpdate;

public interface IMsLessonService extends IService<MsLesson> {

    int create(MsLessonCreate create);

    int update(MsLessonUpdate update);

}

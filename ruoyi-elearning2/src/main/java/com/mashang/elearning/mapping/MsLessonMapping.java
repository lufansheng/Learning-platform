package com.mashang.elearning.mapping;

import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsLessonDtlVo;
import com.mashang.elearning.domain.Vo.MsLessonHomeworkVo;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonCreate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonHomeworkUpdate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MsLessonMapping {
    MsLessonMapping INSTANCE = Mappers.getMapper(MsLessonMapping.class);

    MsLesson to(MsLessonCreate create);

    MsLesson to(MsLessonUpdate update);

    MsLessonDtlVo to(MsLesson msLesson);

    MsLesson to(MsLessonHomeworkUpdate update);

    MsLessonHomeworkVo toHomeWork(MsLesson msLesson);

}

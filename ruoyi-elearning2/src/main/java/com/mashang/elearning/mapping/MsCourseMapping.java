package com.mashang.elearning.mapping;

import com.mashang.elearning.domain.MsCourse;
import com.mashang.elearning.domain.Vo.MsCourseDtlVo;
import com.mashang.elearning.domain.parms.MsCourse.MsCourseCreate;
import com.mashang.elearning.domain.parms.MsCourse.MsCourseUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MsCourseMapping {
    MsCourseMapping INSTANCE = Mappers.getMapper(MsCourseMapping.class);

    MsCourse to(MsCourseCreate create);

    MsCourse to(MsCourseUpdate update);

    MsCourseDtlVo to(MsCourse msCourse);
}

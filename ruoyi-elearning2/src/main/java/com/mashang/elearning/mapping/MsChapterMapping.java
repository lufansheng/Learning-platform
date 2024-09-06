package com.mashang.elearning.mapping;

import com.mashang.elearning.domain.MsChapter;


import com.mashang.elearning.domain.Vo.MsChapterDtlVo;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterCreate;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MsChapterMapping {
    MsChapterMapping INSTANCE = Mappers.getMapper(MsChapterMapping.class);

    MsChapter to(MsChapterCreate create);

    MsChapter to(MsChapterUpdate update);

    MsChapterDtlVo to(MsChapter chapter);
}

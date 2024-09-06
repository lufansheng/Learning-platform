package com.mashang.elearning.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MsHomeworkSubmMapping {
    MsHomeworkSubmMapping INSTANCE = Mappers.getMapper(MsHomeworkSubmMapping.class);
}

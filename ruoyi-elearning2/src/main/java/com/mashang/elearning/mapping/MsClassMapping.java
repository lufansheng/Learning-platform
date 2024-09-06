package com.mashang.elearning.mapping;

import com.mashang.elearning.domain.MsClass;
import com.mashang.elearning.domain.Vo.MsClassAllVo;
import com.mashang.elearning.domain.Vo.MsClassPageVo;


import com.mashang.elearning.domain.parms.MsClass.MsClassCreate;
import com.mashang.elearning.domain.parms.MsClass.MsClassDtlVo;
import com.mashang.elearning.domain.parms.MsClass.MsClassUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MsClassMapping {
    MsClassMapping INSTANCE = Mappers.getMapper(MsClassMapping.class);

    List<MsClassPageVo> to(List<MsClass> msClasses);

    MsClass to(MsClassCreate create);

    MsClass to(MsClassUpdate update);

    MsClassDtlVo to(MsClass msClass);

    List<MsClassAllVo> toAllVo(List<MsClass> list);
}

package com.mashang.elearning.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mashang.elearning.domain.MsCourse;
import com.mashang.elearning.domain.Vo.MsCourseDtlVo;
import com.mashang.elearning.domain.Vo.MsCoursePageVo;
import com.mashang.elearning.domain.Vo.stu.StuCoursePageVo;
import org.apache.ibatis.annotations.Param;


public interface MsCourseMapper extends BaseMapper<MsCourse> {
    Page<MsCoursePageVo> page(@Param("page") Page<MsCoursePageVo> page,
                             @Param(Constants.WRAPPER) Wrapper wrapper);

    MsCourseDtlVo getDtlById(Long courseId);

    Page<StuCoursePageVo> stuPage(@Param("page") Page<StuCoursePageVo> page,
                               @Param(Constants.WRAPPER) Wrapper wrapper);
}

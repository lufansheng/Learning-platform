package com.mashang.elearning.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mashang.elearning.domain.MsCourse;
import com.mashang.elearning.domain.Vo.MsCourseDtlVo;
import com.mashang.elearning.domain.Vo.MsCoursePageVo;
import com.mashang.elearning.domain.Vo.stu.StuCoursePageVo;
import com.ruoyi.common.core.page.Pager;
import org.springframework.stereotype.Service;

public interface IMsCourseService extends IService<MsCourse> {
    Page<MsCoursePageVo> page(Pager pager,Long teacher,String courseName);

    MsCourseDtlVo getDtlById(Long courseId);

    Page<StuCoursePageVo> stuPage(Pager pager, Long teacherId, String courseName);
}

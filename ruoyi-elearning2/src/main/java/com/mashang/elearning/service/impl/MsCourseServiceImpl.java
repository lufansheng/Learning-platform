package com.mashang.elearning.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashang.elearning.domain.MsCourse;
import com.mashang.elearning.domain.Vo.MsCourseDtlVo;
import com.mashang.elearning.domain.Vo.MsCoursePageVo;
import com.mashang.elearning.domain.Vo.stu.StuCoursePageVo;
import com.mashang.elearning.mapper.MsCourseMapper;
import com.mashang.elearning.service.IMsCourseService;
import com.ruoyi.common.core.page.Pager;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsCourseServiceImpl extends ServiceImpl<MsCourseMapper, MsCourse> implements
        IMsCourseService {

    @Autowired
    private MsCourseMapper msCourseMapper;

    @Override
    public Page<MsCoursePageVo> page(Pager pager, Long teacherId, String courseName) {
        Page<MsCoursePageVo> p = new Page<>(pager.getPageNum(), pager.getPageSize());

        QueryWrapper<MsCoursePageVo> qw = new QueryWrapper<>();
        qw.ne("t1.del_flag",2);
        qw.eq(teacherId != null,"t1.teacher_id",teacherId);
        qw.like(StringUtils.isNotEmpty(courseName),"t1.course_name",courseName);
        qw.orderByDesc("t1.create_time");
        return msCourseMapper.page(p,qw);
    }

    @Override
    public MsCourseDtlVo getDtlById(Long courseId) {
        return msCourseMapper.getDtlById(courseId);
    }

    @Override
    public Page<StuCoursePageVo> stuPage(Pager pager, Long teacherId, String courseName) {
        Page<StuCoursePageVo> p = new Page<>(pager.getPageNum(), pager.getPageSize());

        QueryWrapper<StuCoursePageVo> qw = new QueryWrapper<>();
        qw.ne("t2.del_flag",2);
        qw.eq(teacherId != null,"t3.teacher_id",teacherId);
        qw.like(StringUtils.isNotEmpty(courseName),"t2.course_name",courseName);
        qw.eq("t1.user_id", SecurityUtils.getUserId());
        qw.orderByDesc("t2.create_time");
        return msCourseMapper.stuPage(p,qw);
    }

}

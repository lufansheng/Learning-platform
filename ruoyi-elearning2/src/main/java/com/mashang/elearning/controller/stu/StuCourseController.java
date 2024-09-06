package com.mashang.elearning.controller.stu;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mashang.elearning.core.TableDate;
import com.mashang.elearning.domain.Vo.stu.StuCoursePageVo;
import com.mashang.elearning.service.IMsCourseService;
import com.ruoyi.common.core.page.Pager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu/course")
@Api(tags = "学生端课程模块")
public class StuCourseController {
    @Autowired
    private IMsCourseService msCourseService;

    @ApiOperation("学生课程分页查询")
    @GetMapping("/list")
    public TableDate<StuCoursePageVo> list(@Validated Pager pager,Long teacherId,String courseName){
        Page<StuCoursePageVo> page = msCourseService.stuPage(pager, teacherId, courseName);

        List<StuCoursePageVo> records = page.getRecords();
        long total = page.getTotal();

        return TableDate.success(records,total);
    }
}

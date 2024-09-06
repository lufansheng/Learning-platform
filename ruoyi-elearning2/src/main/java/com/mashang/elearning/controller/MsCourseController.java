package com.mashang.elearning.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mashang.elearning.core.Result;
import com.mashang.elearning.core.TableDate;
import com.mashang.elearning.domain.MsCourse;
import com.mashang.elearning.domain.Vo.MsCourseDtlVo;
import com.mashang.elearning.domain.Vo.MsCoursePageVo;
import com.mashang.elearning.domain.parms.MsCourse.MsCourseCreate;
import com.mashang.elearning.domain.parms.MsCourse.MsCourseUpdate;
import com.mashang.elearning.mapping.MsCourseMapping;
import com.mashang.elearning.service.IMsCourseService;
import com.ruoyi.common.core.page.Pager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "课程模块")
@RestController
@RequestMapping("/course")
public class MsCourseController {

    @Autowired
    private IMsCourseService msCourseService;

    @ApiOperation("课程分页查询")
    @GetMapping("/list")
    public TableDate<MsCoursePageVo> page(@Validated Pager pager,Long teacherId,String courseName){
        Page<MsCoursePageVo> page = msCourseService.page(pager, teacherId, courseName);
        Long total = page.getTotal();
        return TableDate.success(page.getRecords(),total);
    }

    @ApiOperation("课程添加")
    @PostMapping
    public Result create(@RequestBody @Validated MsCourseCreate create){
        MsCourse msCourse = MsCourseMapping.INSTANCE.to(create);
        return Result.to(msCourseService.save(msCourse));
    }

    @ApiOperation("课程修改接口")
    @PutMapping
    public Result update(@RequestBody @Validated MsCourseUpdate update){
        MsCourse msCourse = MsCourseMapping.INSTANCE.to(update);
        return Result.to(msCourseService.updateById(msCourse));
    }

    @ApiOperation("课程删除接口")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        MsCourse msCourse = new MsCourse();
        msCourse.setCourseId(id);
        msCourse.setDelFlag("2");
        return Result.to(msCourseService.updateById(msCourse));
    }

    @ApiOperation("课程详情接口")
    @GetMapping("/{courseId}")
    public Result<MsCourseDtlVo> getById(@PathVariable Long courseId){

        return Result.success(msCourseService.getDtlById(courseId));
    }
}

package com.mashang.elearning.controller;

import com.mashang.elearning.core.Result;
import com.mashang.elearning.domain.MsChapter;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsChapterDtlVo;
import com.mashang.elearning.domain.Vo.MsChapterLessonsVo;
import com.mashang.elearning.domain.Vo.MsLessonDtlVo;
import com.mashang.elearning.domain.Vo.MsLessonHomeworkVo;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterCreate;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterUpdate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonCreate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonHomeworkUpdate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonUpdate;
import com.mashang.elearning.mapping.MsChapterMapping;
import com.mashang.elearning.mapping.MsLessonMapping;
import com.mashang.elearning.service.IMsChapterService;
import com.mashang.elearning.service.IMsLessonService;
import com.ruoyi.common.core.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "节模块")
@RestController
@RequestMapping("/lesson")
public class MsLessonController extends BaseController {


    @Autowired
    private IMsLessonService msLessonService;

    @ApiOperation("节添加")
    @PostMapping
    public Result create(@RequestBody @Validated MsLessonCreate create){
        int rs = msLessonService.create(create);
        return Result.to(rs);
    }

    @ApiOperation("节修改")
    @PutMapping
    public Result update(@RequestBody @Validated MsLessonUpdate update){
        int rs = msLessonService.update(update);
        return Result.to(rs);
    }

    @ApiOperation("节详情")
    @GetMapping("/{lessonId}")
    public Result<MsLessonDtlVo> update(@PathVariable Long lessonId){
        MsLesson msLesson = msLessonService.getById(lessonId);
        return Result.success(MsLessonMapping.INSTANCE.to(msLesson));
    }

    @ApiOperation("节删除")
    @DeleteMapping("/{lessonId}")
    public Result delete(@PathVariable Long lessonId){

        MsLesson msLesson = new MsLesson();
        msLesson.setDelFlag("2");
        msLesson.setLessonId(lessonId);

        return Result.to(msLessonService.updateById(msLesson));
    }

    @ApiOperation("添加/修改作业")
    @PutMapping("/homework")
    public Result update(@RequestBody @Validated MsLessonHomeworkUpdate update){
        MsLesson msLesson = MsLessonMapping.INSTANCE.to(update);
        return Result.to(msLessonService.updateById(msLesson));
    }

    @ApiOperation("查询作业")
    @GetMapping("/homework/{lessonId}")
    public Result<MsLessonHomeworkVo> getHomeworkById(@PathVariable Long lessonId){


        return Result.success(MsLessonMapping.INSTANCE.toHomeWork(msLessonService.getById(lessonId)));
    }

}

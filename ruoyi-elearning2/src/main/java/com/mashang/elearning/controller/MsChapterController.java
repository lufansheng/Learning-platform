package com.mashang.elearning.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mashang.elearning.core.Result;
import com.mashang.elearning.domain.MsChapter;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsChapterDtlVo;
import com.mashang.elearning.domain.Vo.MsChapterLessonsVo;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterCreate;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterUpdate;
import com.mashang.elearning.mapping.MsChapterMapping;
import com.mashang.elearning.service.IMsChapterService;
import com.mashang.elearning.service.IMsLessonService;
import com.ruoyi.common.core.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "章模块")
@RestController
@RequestMapping("/chapter")
public class MsChapterController extends BaseController {

    @Autowired
    private IMsChapterService msChapterService;

    @Autowired
    private IMsLessonService msLessonService;

    @ApiOperation("查询所有章")
    @GetMapping("/list")
    public Result<List<MsChapterLessonsVo>> list(Long courseId){
        return Result.success(msChapterService.list(courseId));
    }

//    @ApiOperation("删除章")
//    @DeleteMapping("{chapterId}")
//    public Result delete(@PathVariable Long chapterId){
//        LambdaQueryWrapper<MsLesson> qw = new LambdaQueryWrapper<>();
//        qw.ne(MsLesson::getDelFlag,"2");
//        qw.eq(MsLesson::getCourseId,chapterId);
//        long count = msLessonService.count(qw);
//
//        if (count > 0){
//            return Result.error("删除失败,底下有小节");
//        }
//
//        MsChapter msChapter = new MsChapter();
//        msChapter.setDelFlag("2");
//        msChapter.setChapterId(chapterId);
//        return Result.to(msChapterService.updateById(msChapter));
//    }

    @ApiOperation("删除章")
    @DeleteMapping("{chapterId}")
    public Result delete(@PathVariable Long chapterId){
        return Result.to(msChapterService.delete(chapterId));
    }

    @ApiOperation("添加章")
    @PostMapping
    public Result delete(@RequestBody @Validated MsChapterCreate create){
        return Result.to(msChapterService.create(create));
    }

    @ApiOperation("修改章")
    @PutMapping
    public Result update(@RequestBody @Validated MsChapterUpdate update){
        return Result.to(msChapterService.update(update));
    }

    //修改的时候要先把章节信息查出来
    //查询详情直接用plus构造就行
    @ApiOperation("详情")
    @GetMapping("/{chapterId}")
    public Result<MsChapterDtlVo> getById(@PathVariable Long chapterId){
        MsChapter msChapter = msChapterService.getById(chapterId);
        return Result.success(MsChapterMapping.INSTANCE.to(msChapter));
    }
}

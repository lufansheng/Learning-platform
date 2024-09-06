package com.mashang.elearning.controller;

import com.mashang.elearning.core.Result;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsLessonDtlVo;
import com.mashang.elearning.domain.Vo.MsLessonHomeworkVo;
import com.mashang.elearning.domain.Vo.MshomeworkSubmVo;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonCreate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonHomeworkUpdate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonUpdate;
import com.mashang.elearning.mapping.MsLessonMapping;
import com.mashang.elearning.service.IMsHomeworkSubmService;
import com.mashang.elearning.service.IMsLessonService;
import com.ruoyi.common.core.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "作业提交模块")
@RestController
@RequestMapping("/homework/submit")
public class MsHomeworkSubmController extends BaseController {


    @Autowired
    private IMsHomeworkSubmService msHomeworkSubmService;

    @ApiOperation("查询小节详情")
    @GetMapping("/list")
    public Result<List<MshomeworkSubmVo>> create(Long classId,Long lessonId){
        return Result.success(msHomeworkSubmService.list(classId,lessonId));
    }

}

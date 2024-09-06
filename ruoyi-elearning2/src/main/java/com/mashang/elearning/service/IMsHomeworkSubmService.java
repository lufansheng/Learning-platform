package com.mashang.elearning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashang.elearning.domain.MsHomeworkSubm;
import com.mashang.elearning.domain.Vo.MshomeworkSubmVo;

import java.util.List;

public interface IMsHomeworkSubmService extends IService<MsHomeworkSubm> {

    List<MshomeworkSubmVo> list(Long classId,Long lessonId);
}

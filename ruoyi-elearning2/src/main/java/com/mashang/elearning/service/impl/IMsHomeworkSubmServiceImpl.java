package com.mashang.elearning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashang.elearning.domain.MsHomeworkSubm;
import com.mashang.elearning.domain.Vo.MshomeworkSubmVo;
import com.mashang.elearning.mapper.MsHomeworkSubmMapper;
import com.mashang.elearning.service.IMsHomeworkSubmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMsHomeworkSubmServiceImpl extends ServiceImpl<MsHomeworkSubmMapper, MsHomeworkSubm>
implements IMsHomeworkSubmService {

    @Autowired
    private MsHomeworkSubmMapper msHomeworkSubmMapper;

    @Override
    public List<MshomeworkSubmVo> list(Long classId, Long lessonId) {
        return msHomeworkSubmMapper.list(classId,lessonId);
    }
}

package com.mashang.elearning.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonCreate;
import com.mashang.elearning.domain.parms.MsLesson.MsLessonUpdate;
import com.mashang.elearning.mapper.MsLessonMapper;
import com.mashang.elearning.mapping.MsLessonMapping;
import com.mashang.elearning.service.IMsLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MsLessonServiceImpl extends ServiceImpl<MsLessonMapper, MsLesson> implements IMsLessonService {

    @Autowired
    MsLessonMapper msLessonMapper;

    @Override
    public int create(MsLessonCreate create) {

        MsLesson msLesson = MsLessonMapping.INSTANCE.to(create);

        updateSort(msLesson);

        int rs = msLessonMapper.insert(msLesson);

        return rs;
    }

    @Transactional
    @Override
    public int update(MsLessonUpdate update) {

        MsLesson msLesson = MsLessonMapping.INSTANCE.to(update);

        updateSort(msLesson);

        return msLessonMapper.updateById(msLesson);
    }

    public void updateSort(MsLesson msLesson){


        LambdaQueryWrapper<MsLesson> qw = new LambdaQueryWrapper<>();
        qw.ne(MsLesson::getDelFlag,"2");
        qw.eq(MsLesson::getChapterId,msLesson.getChapterId());
        qw.eq(MsLesson::getLessonSort,msLesson.getLessonSort());
        Long count = msLessonMapper.selectCount(qw);

        if (count > 0){
            LambdaUpdateWrapper<MsLesson> uw = new LambdaUpdateWrapper<>();
            uw.setSql("lesson_sort = lesson_sort + 1");
            uw.ge(MsLesson::getLessonSort,msLesson.getLessonSort());

            msLessonMapper.update(null,uw);
        }
    }
}

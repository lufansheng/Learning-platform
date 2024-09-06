package com.mashang.elearning.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashang.elearning.core.Result;
import com.mashang.elearning.domain.MsChapter;
import com.mashang.elearning.domain.MsLesson;
import com.mashang.elearning.domain.Vo.MsChapterLessonsVo;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterCreate;
import com.mashang.elearning.domain.parms.MsChapter.MsChapterUpdate;
import com.mashang.elearning.mapper.MsChapterMapper;
import com.mashang.elearning.mapper.MsCourseMapper;
import com.mashang.elearning.mapper.MsLessonMapper;
import com.mashang.elearning.mapping.MsChapterMapping;
import com.mashang.elearning.service.IMsChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MsChapterServiceImpl extends ServiceImpl<MsChapterMapper,
        MsChapter> implements IMsChapterService {

    @Autowired
    MsChapterMapper msChapterMapper;

    @Autowired
    MsLessonMapper msLessonMapper;

    @Override
    public List<MsChapterLessonsVo> list(Long courseId) {

        return msChapterMapper.list(courseId);
    }

    @Transactional
    @Override
    public int delete(Long chapterId) {

        MsChapter msChapter = new MsChapter();
        msChapter.setChapterId(chapterId);
        msChapter.setDelFlag("2");

        int rs = msChapterMapper.updateById(msChapter);

        LambdaUpdateWrapper<MsLesson> qw = new LambdaUpdateWrapper<>();
        qw.eq(MsLesson::getChapterId,chapterId);
        qw.ne(MsLesson::getDelFlag,"2");
        Long count = msLessonMapper.selectCount(qw);

        if (count > 0){


            MsLesson msLesson = new MsLesson();
            msLesson.setDelFlag("2");

            LambdaUpdateWrapper<MsLesson> uw = new LambdaUpdateWrapper<>();
            uw.eq(MsLesson::getChapterId,chapterId);

            //把节里面满足uw条件的数据更新成meLesson
            msLessonMapper.update(msLesson,uw);
        }

        return rs;
    }


    @Override
    public int create(MsChapterCreate create) {
        MsChapter msChapter = MsChapterMapping.INSTANCE.to(create);
        updateSort(msChapter);
        int rs = msChapterMapper.insert(msChapter);
        return rs;
    }

    @Transactional
    @Override
    public int update(MsChapterUpdate update) {

        MsChapter msChapter = MsChapterMapping.INSTANCE.to(update);

        updateSort(msChapter);

        int rs = msChapterMapper.updateById(msChapter);

        return rs;
    }

    public void updateSort(MsChapter msChapter){

        LambdaQueryWrapper<MsChapter> qw = new LambdaQueryWrapper<>();
        qw.ne(MsChapter::getDelFlag,"2");
        qw.ne(MsChapter::getCourseId,msChapter.getCourseId());
        qw.eq(MsChapter::getChapterSort,msChapter.getChapterSort());

        Long count = msChapterMapper.selectCount(qw);

        if (count > 0){
            LambdaUpdateWrapper<MsChapter> uw = new LambdaUpdateWrapper<>();
            uw.ge(MsChapter::getChapterSort,msChapter.getChapterSort());
            uw.setSql("chapter_sort = chapter_sort + 1");
            msChapterMapper.update(null,uw);
        }
    }
}

package com.mashang.elearning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashang.elearning.domain.MsHomeworkSubm;
import com.mashang.elearning.domain.Vo.MshomeworkSubmVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsHomeworkSubmMapper extends BaseMapper<MsHomeworkSubm> {

    List<MshomeworkSubmVo> list(@Param("lessonId")Long lessonId,@Param("classId") Long classId);

}

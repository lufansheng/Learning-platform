package com.mashang.elearning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashang.elearning.domain.MsClass;
import com.mashang.elearning.mapper.MsClassMapper;
import com.mashang.elearning.service.IMsClassService;
import org.springframework.stereotype.Service;

@Service
public class MsClassServiceImpl extends ServiceImpl<MsClassMapper,MsClass>
    implements IMsClassService {
}

package com.mashang.elearning.domain.Vo;

import com.mashang.elearning.domain.Vo.MsHomeworkSubmDtlVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel("作业提交信息")
@Data
public class MshomeworkSubmVo {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("学生姓名")
    private String nickName;

    @ApiModelProperty("作业提交详情")
    private List<MsHomeworkSubmDtlVo> homeworks;


}
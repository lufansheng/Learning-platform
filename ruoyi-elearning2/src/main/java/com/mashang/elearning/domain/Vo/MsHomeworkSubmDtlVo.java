package com.mashang.elearning.domain.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("作业提交信息-详细信息")
public class MsHomeworkSubmDtlVo {
  @ApiModelProperty("作业提交主键id")
  private Long homeworkSubmId;

  @ApiModelProperty("作业提交地址")
  private String homeworkUrl;

  @ApiModelProperty("是否通过")
  private String pass;

  @ApiModelProperty("评语")
  private String comment;

  @ApiModelProperty("作业名称")
  private String homeworkName;
}
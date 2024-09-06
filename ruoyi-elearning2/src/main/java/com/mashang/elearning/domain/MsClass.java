package com.mashang.elearning.domain;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class MsClass {

  @TableId(type = IdType.AUTO)
  @TableField
  private Long classId;
  private String className;
  private String delFlag;

  @TableField(fill = FieldFill.INSERT)
  private String createBy;
  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(fill = FieldFill.INSERT_UPDATE)
  private String updateBy;
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;


  private String remark;
}

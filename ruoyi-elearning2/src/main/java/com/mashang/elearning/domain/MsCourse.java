package com.mashang.elearning.domain;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MsCourse {

  @TableId(type = IdType.AUTO)
  private Long courseId;
  private String courseName;
  private String courseCover;
  private Long classId;
  private Long teacherId;
  private String delFlag;
  @TableField(fill = FieldFill.INSERT)
  private String createBy;
  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  @TableField(fill = FieldFill.INSERT_UPDATE)
  private String updateBy;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;
  private String remark;

}

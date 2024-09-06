package com.mashang.elearning.domain;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MsLesson {

  @TableId(type = IdType.AUTO)
  private Long lessonId;
  private Long courseId;
  private Long chapterId;
  private String lessonName;
  private Long lessonSort;
  private String playName;
  private String playUrl;
  private String coursewareName;
  private String coursewareUrl;
  private String homeworkPublish;
  private String homework;
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

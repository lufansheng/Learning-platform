package com.mashang.elearning.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("分页数据")
@Data
public class TableDate<T> {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("提示消息")
    private String msg;

    @ApiModelProperty("数据")
    private List<T> row;

    @ApiModelProperty("总条数")
    private Long total;

    public TableDate(Integer code, String msg, List<T> row, Long total) {
        this.code = code;
        this.msg = msg;
        this.row = row;
        this.total = total;
    }

    public static TableDate success(List list,Long total){
        return new TableDate(200,"操作成功",list,total);
    }
}

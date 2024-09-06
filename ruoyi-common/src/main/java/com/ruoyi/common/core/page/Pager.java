package com.ruoyi.common.core.page;

import javax.validation.constraints.NotNull;

public class Pager {

    @NotNull(message = "页码不能为null")
    private Integer pageNum;

    @NotNull(message = "分页数量不能为null")
    private Integer pageSize;

    public Pager(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

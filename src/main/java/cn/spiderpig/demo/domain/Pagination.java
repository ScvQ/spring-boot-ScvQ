package cn.spiderpig.demo.domain;

import java.util.List;

public class Pagination<T> {

    // 一共多少数据
    private Integer totleRecord;

    // 每页多少数据
    private Integer pageSize;

    // 一共多少页
    private Integer totlePage;

    // 当前是第几页
    private Integer currentPage;

    // 数据
    private List<T> pageData;

    public Pagination() {
        super();
    }

    public Pagination(Integer totleRecord, Integer pageSize, Integer totlePage, Integer currentPage, List<T> pageData) {
        super();
        this.totleRecord = totleRecord;
        this.pageSize = pageSize;
        this.totlePage = totlePage;
        this.currentPage = currentPage;
        this.pageData = pageData;
    }

    public Integer getTotleRecord() {
        return totleRecord;
    }

    public void setTotleRecord(Integer totleRecord) {
        this.totleRecord = totleRecord;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotlePage() {
        return totlePage;
    }

    public void setTotlePage(Integer totlePage) {
        this.totlePage = totlePage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

}

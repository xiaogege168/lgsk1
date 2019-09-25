package com.entity;

import java.io.Serializable;
import java.util.Date;

public class SkRecords implements Serializable {
    private Integer recordsid;

    private Integer goodsid;

    private Date createtime;

    private Integer plusmount;

    private Integer submount;

    private static final long serialVersionUID = 1L;

    public Integer getRecordsid() {
        return recordsid;
    }

    public void setRecordsid(Integer recordsid) {
        this.recordsid = recordsid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPlusmount() {
        return plusmount;
    }

    public void setPlusmount(Integer plusmount) {
        this.plusmount = plusmount;
    }

    public Integer getSubmount() {
        return submount;
    }

    public void setSubmount(Integer submount) {
        this.submount = submount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordsid=").append(recordsid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", createtime=").append(createtime);
        sb.append(", plusmount=").append(plusmount);
        sb.append(", submount=").append(submount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
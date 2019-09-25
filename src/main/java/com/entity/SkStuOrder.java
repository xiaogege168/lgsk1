package com.entity;

import java.io.Serializable;

public class SkStuOrder implements Serializable {
    private Integer orderid;

    private Integer stuid;

    private String ordertime;

    private String teachcomment;

    private String ampm;

    private String today;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getTeachcomment() {
        return teachcomment;
    }

    public void setTeachcomment(String teachcomment) {
        this.teachcomment = teachcomment == null ? null : teachcomment.trim();
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm == null ? null : ampm.trim();
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today == null ? null : today.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", stuid=").append(stuid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", teachcomment=").append(teachcomment);
        sb.append(", ampm=").append(ampm);
        sb.append(", today=").append(today);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
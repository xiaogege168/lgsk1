package com.entity;

import java.io.Serializable;

public class SkCourse implements Serializable {
    private Integer courseid;

    private String coursetime;

    private Integer courseprice;

    private String coursecontent;

    private static final long serialVersionUID = 1L;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime == null ? null : coursetime.trim();
    }

    public Integer getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(Integer courseprice) {
        this.courseprice = courseprice;
    }

    public String getCoursecontent() {
        return coursecontent;
    }

    public void setCoursecontent(String coursecontent) {
        this.coursecontent = coursecontent == null ? null : coursecontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseid=").append(courseid);
        sb.append(", coursetime=").append(coursetime);
        sb.append(", courseprice=").append(courseprice);
        sb.append(", coursecontent=").append(coursecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
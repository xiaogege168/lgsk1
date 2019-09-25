package com.entity;

import java.io.Serializable;

public class SkShop implements Serializable {
    private Integer shopid;

    private String address;

    private Integer leaderid;

    private Integer monthincome;

    private static final long serialVersionUID = 1L;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    public Integer getMonthincome() {
        return monthincome;
    }

    public void setMonthincome(Integer monthincome) {
        this.monthincome = monthincome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopid=").append(shopid);
        sb.append(", address=").append(address);
        sb.append(", leaderid=").append(leaderid);
        sb.append(", monthincome=").append(monthincome);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
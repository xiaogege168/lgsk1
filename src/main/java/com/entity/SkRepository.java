package com.entity;

import java.io.Serializable;

public class SkRepository implements Serializable {
    private Integer repositoryid;

    private String name;

    private Integer amount;

    private Integer shopid;

    private static final long serialVersionUID = 1L;

    public Integer getRepositoryid() {
        return repositoryid;
    }

    public void setRepositoryid(Integer repositoryid) {
        this.repositoryid = repositoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repositoryid=").append(repositoryid);
        sb.append(", name=").append(name);
        sb.append(", amount=").append(amount);
        sb.append(", shopid=").append(shopid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
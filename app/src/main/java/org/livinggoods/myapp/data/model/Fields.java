package org.livinggoods.myapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("CHP details")
    @Expose
    private CHPDetails cHPDetails;
    @SerializedName("Index")
    @Expose
    private Integer index;
    @SerializedName("Scan time")
    @Expose
    private String scanTime;


    public CHPDetails getCHPDetails() {
        return cHPDetails;
    }

    public void setCHPDetails(CHPDetails cHPDetails) {
        this.cHPDetails = cHPDetails;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "CHP details='" + cHPDetails  + '\'' +
                ", Scan time='" + scanTime + '\'' +
                ", id=" + index +
                '}';
    }
}
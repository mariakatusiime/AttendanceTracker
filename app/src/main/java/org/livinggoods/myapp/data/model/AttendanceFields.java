package org.livinggoods.myapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttendanceFields {

    @SerializedName("CHP details")
    @Expose
    private CHPDetails cHPDetails;

    public CHPDetails getCHPDetails() {
        return cHPDetails;
    }

    public void setCHPDetails(CHPDetails cHPDetails) {
        this.cHPDetails = cHPDetails;
    }

}


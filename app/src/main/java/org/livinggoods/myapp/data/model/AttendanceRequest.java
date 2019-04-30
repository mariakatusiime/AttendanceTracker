package org.livinggoods.myapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttendanceRequest {

    @SerializedName("fields")
    @Expose
    private AttendanceFields fields;

    public AttendanceFields getFields() {
        return fields;
    }

    public void setFields(AttendanceFields fields) {
        this.fields = fields;
    }

}
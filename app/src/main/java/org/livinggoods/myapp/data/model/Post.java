package org.livinggoods.myapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("Index")
    @Expose
    private int index;

    @SerializedName("Scan time")
    private String scan_time;


    private String text;

    //public Post(int price, String dishName) {
     //   this.price = price;
      //  this.DishName = dishName;
    //}

    public int getIndex() {
        return index;
    }

    public String getScan_time() {
        return scan_time;
    }

    public String getText() {
        return text;
    }


}

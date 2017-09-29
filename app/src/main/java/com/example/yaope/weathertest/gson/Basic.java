package com.example.yaope.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bobbyyyao on 2017/9/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
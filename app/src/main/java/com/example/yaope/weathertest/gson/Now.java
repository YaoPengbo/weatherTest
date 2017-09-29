package com.example.yaope.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bobbyyyao on 2017/9/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

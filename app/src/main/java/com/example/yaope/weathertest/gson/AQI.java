package com.example.yaope.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bobbyyyao on 2017/9/29.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

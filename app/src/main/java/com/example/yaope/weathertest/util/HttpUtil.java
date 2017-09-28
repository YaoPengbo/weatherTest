package com.example.yaope.weathertest.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by bobbyyyao on 2017/9/28.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}

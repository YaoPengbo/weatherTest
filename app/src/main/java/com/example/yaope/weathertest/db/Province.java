package com.example.yaope.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yaope on 2017/9/28.
 * Contact Me : yaopengbo1@gmail.com
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}

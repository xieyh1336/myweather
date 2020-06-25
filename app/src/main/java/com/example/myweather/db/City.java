package com.example.myweather.db;

import org.litepal.crud.DataSupport;
//存放市的数据表
public class City extends DataSupport {
    private int id;//每个实体类中应有的字段
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//当前市所属省份的id值

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

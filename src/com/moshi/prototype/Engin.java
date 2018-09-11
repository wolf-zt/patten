package com.moshi.prototype;

import java.io.Serializable;

/**
 * Created by 56498838@qq.com 张涛 on 2018/6/27.
 *
 * @version 2.0.0
 */
public class Engin implements Cloneable,Serializable {
    String enginName;

    public String getEnginName() {
        return enginName;
    }

    public void setEnginName(String enginName) {
        this.enginName = enginName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

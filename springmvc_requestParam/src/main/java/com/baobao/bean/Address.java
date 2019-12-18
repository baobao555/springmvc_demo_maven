package com.baobao.bean;

import java.io.Serializable;

/**
 * @author baobao
 * @create 2019-11-25 23:27
 * @description
 */
public class Address implements Serializable {
    private String province;
    private String block;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", block='" + block + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}

package com.baobao.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author baobao
 * @create 2019-11-25 23:37
 * @description
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private List<Address> addressList;
    private Map<String,Address> addressMap;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addressList=" + addressList +
                ", addressMap=" + addressMap +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Map<String, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }
}

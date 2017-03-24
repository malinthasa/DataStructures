package com.malintha.datastructures.collections;

/**
 * Created by malintha on 3/24/17.
 */
public class Singer {
    private String name;
    private int age;
    private String province;

    public Singer(String name, int age, String province) {
        this.name = name;
        this.age = age;
        this.province = province;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
package com.gy.pojo;

/**
 * @ClassName Paint
 * @Author gaoyang
 * @Date 2019/9/111:43
 * @Version 1.0
 **/
public class Paint {
    private int age;
    private int blood;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "age=" + age +
                ", blood=" + blood +
                '}';
    }
}

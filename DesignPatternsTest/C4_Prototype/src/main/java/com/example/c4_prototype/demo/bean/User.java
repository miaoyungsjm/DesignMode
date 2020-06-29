package com.example.c4_prototype.demo.bean;

/**
 * @author ggz
 * @date 2020/6/29
 */
public class User implements Cloneable {
    public int age;
    public String name;
    public String phone;
    public Address address;

    @Override
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}

package com.example.prototype.demo2;

public class User {
    public int age;
    public String name;
    public String phone;
    public Address address;

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

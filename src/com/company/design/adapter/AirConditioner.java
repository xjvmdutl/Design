package com.company.design.adapter;

public class AirConditioner implements Electronic220V{
    //220V 사용
    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}

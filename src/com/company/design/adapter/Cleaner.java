package com.company.design.adapter;

public class Cleaner implements Electronic220V{
    //220V 사용
    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}

package com.company.design.strategy;

public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD" + text;//ABCD를 더해준다
    }
}

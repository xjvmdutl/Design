package com.company.design.strategy;

public class Encoder {
    private  EncodingStrategy encodingStrategy;

    public  String getMessage(String message){
        //각각의 전략에 따라 결과가 달라진다.
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy){
        this.encodingStrategy = encodingStrategy;
    }
}

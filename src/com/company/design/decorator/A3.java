package com.company.design.decorator;

public class A3 extends AudiDecorator{

    public A3(ICar icar, String modelName) {
        super(icar, modelName, 1000);
    }
}

package com.company.design.decorator;

public class AudiDecorator implements ICar{

    protected ICar icar;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar icar,String modelName,int modelPrice){
        this.icar = icar;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return icar.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName+"의 가격은 "+getPrice()+"원 입니다.");
    }
}

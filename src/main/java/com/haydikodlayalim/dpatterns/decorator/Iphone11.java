package com.haydikodlayalim.dpatterns.decorator;

public class Iphone11 extends PhoneDecorator {
    public Iphone11(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "iphone 11";
    }

    @Override
    public int CameraCount() {
        return super.CameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

}

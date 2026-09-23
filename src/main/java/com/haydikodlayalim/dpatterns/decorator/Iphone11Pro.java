package com.haydikodlayalim.dpatterns.decorator;

public class Iphone11Pro extends PhoneDecorator {

    public Iphone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "pro";
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

package com.haydikodlayalim.dpatterns.decorator;

public class Iphone11ProMax extends
        Iphone11Pro {

    public Iphone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "max";
    }

    @Override
    public int CameraCount() {
        return super.CameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200;
    }

    public String extraMethod() {
        return "mavi";
    }

}

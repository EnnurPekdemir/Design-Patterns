package com.haydikodlayalim.dpatterns.decorator;

public class PhoneDecorator implements Phone {

    protected Phone basicphone;

    public PhoneDecorator(Phone phone) {
        this.basicphone = phone;
    }

    @Override
    public String getName() {
        return basicphone.getName();
    }

    @Override
    public int CameraCount() {
        return basicphone.CameraCount();
    }

    @Override
    public double getPrice() {
        return basicphone.getPrice();
    }
}

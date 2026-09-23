
package com.haydikodlayalim.dpatterns.decorator;

public class IPhone implements Phone {

    @Override
    public String getName() {
        return "iPhone";
    }

    @Override
    public int CameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}

package com.haydikodlayalim.dpatterns.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone basicPhone = new IPhone();
        System.out.println("Phone Name:" + basicPhone.getName());
        System.out.println("Camera:" + basicPhone.CameraCount());
        System.out.println("Price:" + basicPhone.getPrice());
        System.out.println("--------------------------------------");

        Phone iphone11 = new Iphone11(basicPhone);
        System.out.println("Phone Name:" + iphone11.getName());
        System.out.println("Camera:" + iphone11.CameraCount());
        System.out.println("Price:" + iphone11.getPrice());
        System.out.println("--------------------------------------");

        Phone iphone11Pro = new Iphone11Pro(iphone11);
        System.out.println("Phone Name:" + iphone11Pro.getName());
        System.out.println("Camera:" + iphone11Pro.CameraCount());
        System.out.println("Price:" + iphone11Pro.getPrice());
        System.out.println("--------------------------------------");

        Phone iphone11ProMax = new Iphone11ProMax(iphone11Pro);
        System.out.println("Phone Name:" + iphone11ProMax.getName());
        System.out.println("Camera:" + iphone11ProMax.CameraCount());
        System.out.println("Price:" + iphone11ProMax.getPrice());
        System.out.println("--------------------------------------");
    }
}

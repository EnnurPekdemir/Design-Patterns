package com.haydikodlayalim.dpatterns.decorator;

public class NormalSample {

    public static class Iphone11 {
        public String name() {
            return "iPhone 11";
        }

        public int getCamera() {
            return 2;
        }
    }

    public static class Iphone11Pro extends Iphone11 {
        @Override
        public String name() {
            return "iPhone 11 Pro";
        }

        @Override
        public int getCamera() {
            return 3;
        }

    }

    public static class Iphone11ProMax extends Iphone11 {
        @Override
        public String name() {
            return "iPhone 11 Pro Max";
        }

        @Override
        public int getCamera() {
            return 3;
        }

    }

}

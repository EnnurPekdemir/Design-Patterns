package com.haydikodlayalim.dpatterns.singleton;

public class BillPuaghSingleton {

    private BillPuaghSingleton() {
    }

    public static BillPuaghSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPuaghSingleton INSTANCE = new BillPuaghSingleton();
    }

    public void singletonTest() {
        System.out.println("Bill Puagh Singleton metot çalıştı.");

    }
}

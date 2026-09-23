package com.haydikodlayalim.dpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public void singletonTest() {
        System.out.println("Thread Safe Singleton metot çalıştı.");
    }

}

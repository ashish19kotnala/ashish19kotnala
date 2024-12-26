package com.ash.karo.devparadise.threading;

class MyRunnable implements Runnable {
    private static int n = 1;
    private static char c = 'a';

    public void run() {
        for (int i = 1; i <= 26; i++) {
            synchronized (this) {
                try {
                    notifyAll();
                    if (Thread.currentThread().getName().equals("A")) {
                        System.out.print(c + ",");
                        c++;
                    } else {
                        System.out.print(n + ",");
                        n++;
                    }
                    if (i != 26) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TwoSyncThreads {

    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread tAlphabet = new Thread(r, "A");
        Thread tNumber = new Thread(r, "N");
        tAlphabet.start();
        Thread.sleep(100);
        tNumber.start();
    }

}
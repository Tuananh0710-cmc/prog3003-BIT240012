/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.baitap3;

/**
 *
 * @author panhh
 */
class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread dang chay...");
    }
}
class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable dang chay...");
    }
}

public class MainApp {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread();
        thread1.start();
        WorkerRunnable myRunnable = new WorkerRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

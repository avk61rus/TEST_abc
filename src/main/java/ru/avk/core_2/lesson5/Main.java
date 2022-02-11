package ru.avk.core_2.lesson5;

/**
 * THREAD
 */
public abstract class Main {
    public static void main(String[] args) {
            System.out.printf("Привет из Main потоку по имени: %s\n",
                    Thread.currentThread().getName());
        Thread t1 = new MyThread();
        t1.setPriority(10);
        t1.start();
        
        MyRunnable mr = new MyRunnable();
        Thread tr1 = new Thread(mr);
        tr1.start();

        Thread t2 = new MyThread("Лажа");
        t2.start();
        
        try {
         
            t1.join();
            tr1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    
        System.out.println("all close");
    }
        static class MyThread extends Thread {
            public MyThread() {}
    
            public MyThread(String name) {
                super(name);
            }
            
            
            @Override
            public void run() {
               
                System.out.printf("Привет из потока MyThread потоку по имени:" +
                        " " +
                        "%s\n", MyThread.currentThread().getName());
            }
        }

                static class MyRunnable implements Runnable {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.printf("Привет из потока  MyRunnable " +
                                "потоку по имени:" +
                                " %s\n", Thread.currentThread().getName());
                        
            }
        }
        
}

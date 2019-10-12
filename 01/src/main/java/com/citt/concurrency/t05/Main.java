package com.citt.concurrency.t05;

public class Main {

	public static void main(String[] args) {
		ThreadExample05 t1 = new ThreadExample05();
        ThreadExample05 t2 = new ThreadExample05();
        ThreadExample05 t3 = new ThreadExample05();
        
        System.out.println("Prioridad del hilo t1 : " + t1.getPriority()); // Por defecto 5
        System.out.println("Prioridad del hilo t2 : " + t2.getPriority()); // Por defecto 5
        System.out.println("Prioridad del hilo t3 : " + t3.getPriority()); // Por defecto 5
        
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        
        // t3.setPriority(21); arrojará IllegalArgumentException
        System.out.println("Prioridad del hilo t1 : " + t1.getPriority());  //2
        System.out.println("Prioridad del hilo t2 : " + t2.getPriority()); //5
        System.out.println("Prioridad del hilo t3 : " + t3.getPriority());//8
        
        // Hilo Principal (Main thread)
        System.out.print(Thread.currentThread().getName() + ": ");
        System.out.println("Prioridad del hilo Main : " + Thread.currentThread().getPriority());
        // La prioridad del hilo principal se establece en 10
        
        Thread.currentThread().setPriority(10);
        
        System.out.println("Prioridad del hilo Main : " + Thread.currentThread().getPriority());

	}

}

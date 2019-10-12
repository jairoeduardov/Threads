package com.citt.concurrency.t03;

public class ThreadExample03 extends Thread {
	
	public ThreadExample03(String str) {
		super(str);
	}
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " " + getName() );
			System.out.println("termina thread " + getName());
		}
	}
	
	/*
	public static void main (String[] args) {
		new ThreadExample03("Pepe").start();
		new ThreadExample03("Juan").start();
		System.out.println("termina thread main");
	}
	*/

}

package com.citt.concurrency.t03;

public class Main {
	
	public static void main (String[] args) {
		new ThreadExample03("Pepe").start();
		new ThreadExample03("Juan").start();
		System.out.println("termina thread main");
	}
}

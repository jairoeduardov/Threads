package com.citt.concurrency.t04;

public class Main {

	public static void main(String[] args) {
		 new ThreadExample04("Conejo").start();
	     new ThreadExample04("Tortuga").start();
	     new ThreadExample04("Zorro").start();
	}
}

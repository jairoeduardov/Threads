package com.citt.concurrency.t01;

public class Main {

	public static void main(String[] args) {
		
		ThreadExample01 t1 = new ThreadExample01("Pedro");
		ThreadExample01 t2 = new ThreadExample01("Pablo");
		ThreadExample01 t3 = new ThreadExample01("Juan");
		
		t1.start();
		t2.start();
		t3.start();
		
		//t1.run();
		//t2.run();
		//t3.run();

	}

}

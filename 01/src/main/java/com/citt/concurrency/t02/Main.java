package com.citt.concurrency.t02;

public class Main {
	public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i < n; i++) 
        { 
        	ThreadExample02 object = new ThreadExample02(); 
            object.start(); 
        } 
    }
}

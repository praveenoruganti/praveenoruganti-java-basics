package com.praveenoruganti.threads;

public class RunnableThread implements Runnable {

	public void run() {
		System.out.println("Starting  " + Thread.currentThread().getName());
	}

	public static void main(String args[]) {

		RunnableThread rt1 = new RunnableThread();
		Thread t1=new Thread(rt1);
		t1.setName("t1");
		RunnableThread rt2 = new RunnableThread();
		Thread t2=new Thread(rt2);
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}

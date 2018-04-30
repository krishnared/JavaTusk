package com.MultiThreading;

public class ThreadBasics {

	public static void main(String[] args) {
		// 1st-way - using runnable interface
		Runnable r = () -> {
			System.out.println("Hello");
		};
		Thread obj = new Thread(r);
		obj.start();
		// Lamda Declaration " () -> "
		// 2nd-way - simplified using lamda and anonymous object
		new Thread(() -> {
			System.out.println("Good Morning");
		}).start();

		// 3rd-way -> General way
		B b1 = new B();
		b1.start();
	}

	public void zindagi() {
		System.out.println("Hello");
	}
}

// Only one class .. Other two are defined in Top.
class B extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
				System.out.println(this.hashCode());
			} catch (InterruptedException e) {
			}
		}

	}
}

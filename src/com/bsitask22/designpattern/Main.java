package com.bsitask22.designpattern;

public class Main {
	public static void main(String[] args) {
		Singleton singletonObject1 = Singleton.getInstance();
		Singleton singletonObject2 = Singleton.getInstance();

		System.out.println(singletonObject1);
		System.out.println(singletonObject2);

		System.out.println(singletonObject1 == singletonObject2);
	}

}

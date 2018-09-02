package com.bjgoodwill;

public class Main {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();

		System.out.println(st1.i);
		System.out.println(st2.i);

		int a = 47, b = 10;
		System.out.println("-------");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("-------");
		int x = -a;
		System.out.println("x: " + x);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("-------");
		int x1 = a * -b;
		System.out.println("x1: " + x1);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("-------");
		int x2 = a * (-b);
		System.out.println("x2: " + x2);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("-------");

		System.out.println("finished the new footer [issue 1]");
	}
}

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
		System.out.println("finished the new footer featureB");

		// 1. 【强制】避免通过一个类的对象引用访问此类的静态变量或静态方法,无谓增加编译器解析成本,直接用类名来访问即可
		// StaticTest.i;
		StaticTest t1=new StaticTest();
		System.out.println(t1.i);
		System.out.println(StaticTest.i);
		StaticTest.i++;
		System.out.println(t1.i);
		System.out.println(StaticTest.i);
	}
}

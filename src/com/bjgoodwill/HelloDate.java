/**
 * Java第一个测程序
 *
 * @author :zhangyichao
 * @create :2018-08-27 13:54
 **/
package com.bjgoodwill;

import java.util.Date;

public class HelloDate {
	public static void main(String[] args) {
		System.out.println("Hello. it's: ");
		System.out.println(new Date());

		ShowProperties();
	}

	private static void ShowProperties() {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(
				System.getProperty("java.library.path")
		);
		System.out.println("ShowProperties1");
	}
}


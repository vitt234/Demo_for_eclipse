package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(12);
		list.add("sagar");

		list.add(12.5);

		Iterator itr = list.iterator();

		System.out.println(list);

		for (Object object : list) {

			System.out.println(object);

		}

	}
}

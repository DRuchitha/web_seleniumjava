package com.feuji.test;

import java.util.ArrayList;

public class MergeArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		 list2.add(70);
		 list2.add(96);
		System.out.println( list1);
		System.out.println(list2);
		 list1.addAll(list2);
		System.out.println( list1);

	}

}

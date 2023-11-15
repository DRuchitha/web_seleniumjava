package com.feuji.test;

import java.util.HashMap;

//Write a java program to find the duplicate words and their number of occurrences in a string?(Ex : Test auto Test Code Auto Manual Test)
public class DuplicateStringExample {

	public static void main(String[] args) {
		
String s="Test auto Test Code Auto Manual Test";
String[] a = s.split(" ");
//HashMap h = new HashMap<>();
for (int i = 0; i < a.length; i++) {

	int count = 1;
	if (!a[i].equals("-1")) {
		for (int j = i + 1; j < a.length; j++) {
			if (!a[j].equals("-1") && a[i].equals(a[j])) {
				count++;
				a[j] = "0";
			}

		}
		if(count>1 && a[i]!="0") {
		System.out.println(a[i]+ " "+count);	
		}
		//h.put(a[i], count);
	}
}
//System.out.println(h);

}
}



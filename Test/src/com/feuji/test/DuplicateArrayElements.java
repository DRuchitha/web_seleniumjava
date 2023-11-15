package com.feuji.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Print duplicate elements in a given array.

public class DuplicateArrayElements {

	public static void main(String[] args) {
		

		int[] a= {3,6,3,4,2,6,3};
		int count=0;
	for(int i=0;i<a.length;i++) {
		
		boolean temp=false;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]!=-1&&a[j]!=-1&&a[i]==a[j]) {
				a[j]=-1;
				temp=true;
				
				
			}
		}
		if(temp==true) {
			System.out.println(a[i]);
		}
	}
		
	}
}
	
	



package com.feuji.first;

import java.util.ArrayList;
import java.util.Arrays;

public class NthArray {
//An N length array contains some integers with zeros (Ex:108096040), sort the array so that zeros and other non-zero integers are grouped together (Ex : 000018964).
	public static void main(String[] args) {
		
      int[] n= {1,0,8,0,9,6,0,4,0};
      ArrayList<Integer> result1=new ArrayList<>();
      ArrayList<Integer> result2=new ArrayList<>();
      int[] result=new int[n.length];
      for(int i=0;i<n.length;i++) {
    	  if(n[i]==0) {
    		  result1.add(n[i]);
    	  }
    	  else {
    		  result2.add(n[i]);
    	  }
      }
      int k=0;
      for(int zeros:result1) {
    	  result[k]=zeros;
    	  k++;
	}
      for(int nonZeros:result2) {
    	  result[k]=nonZeros;
    	  k++;
      }
      System.out.println(Arrays.toString(result));
      
      

}
}

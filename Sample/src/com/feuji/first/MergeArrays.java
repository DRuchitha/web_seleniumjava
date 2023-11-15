package com.feuji.first;

public class MergeArrays {
	public static void main(String[] args) {		
	
int[] a1= {2,3,4,7,5};
int[] a2= {7,9,3,6};

int n1=a1.length;
int n2=a2.length;
int n3=n1+n2;
int[] res=new int[n3];
int k=0;

for(int i=0;i<n1;i++) {
	res[k]=a1[i];
   k++;
	}
for(int j=0;j<n2;j++) {
	res[k]=a2[j];
   k++;
	}
for(int i=0;i<res.length;i++) {
	System.out.print(res[i]+",");
}


}
}

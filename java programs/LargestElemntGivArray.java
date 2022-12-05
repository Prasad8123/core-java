package com.xworkz.interview;

public class LargestElemntGivArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {23,633,7364,2,45,224};
		int max=a[0];
		
		System.out.print("the largest number is : -");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		
		}
		System.out.print(max);
		
	}

}

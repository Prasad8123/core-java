package com.xworkz.interview;

public class ThreeedLargestNumInGivArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {12,25,9,5,74,64,15,20};
		int temp=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println("3rd largets num in given array : "+a[a.length-3]);

	}

}

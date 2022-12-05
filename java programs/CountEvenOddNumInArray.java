package com.xworkz.interview;



public class CountEvenOddNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,0};
	
	
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number are : " + a[i]);
			}
			
		}
		
		for(int i=0; i< a.length; i++)
		{
		if(a[i]%2==1)
		
			{
				System.out.println("odd number are : " + a[i]);
			}
		}

	}

}

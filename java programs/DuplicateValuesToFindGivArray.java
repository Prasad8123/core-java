package com.xworkz.interview;

public class DuplicateValuesToFindGivArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,2,5,3,6,7,5,9};
		
		System.out.println("the duplicate values in given array");

		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}

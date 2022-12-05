package com.xworkz.interview;

public class PalandromGivNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,sum=0,n=454;
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp +" it is palandorm");
		}
		else
		{
			System.out.println(temp+" it is not palandrom");
		}

	}

}

package com.xworkz.interview;

public class AmrstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=371,originalNum,remainder,result=0;
		
            originalNum=n;
            
            while(originalNum !=0)
            {
            	remainder = originalNum%10;
            	result=(int) (result+Math.pow(remainder, 3)) ;
            	
            	originalNum =originalNum/10; 	
            
            }
            
            if(result==n)
            {
            	System.out.println(n + "is an amstrong number");
            }
            
            else
            {
            	System.out.println(n + "is not amstrong number");
            }
	}

}

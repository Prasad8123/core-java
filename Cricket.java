class Cricket
{

public static void main(String cricket[])
{


  int rohitHighestScore = 264;
  int sachinHighestScore = 200;
  int mandanaHighestScore = 135;
  int akerrHighestScore = 232;
  int bjclarkHighestScore = 229;
  
  int highestScores [] ={rohitHighestScore, sachinHighestScore,mandanaHighestScore,
                          akerrHighestScore,bjclarkHighestScore};
   
       
	   int ref4 = highestScores[4];
	   
	   int ref0 = highestScores[0];
	   int ref3 = highestScores[3];
	   
	   
	   System.out.println("the element of index 4 "+ref4);
	   System.out.println("the element of index 0 "+ref0);
	   System.out.println("the element of index 3 "+ref3);
	   
	   
	   //length is a property of array
	   
	   System.out.println("the length of higestScore is " +highestScores.length);
	   
	   for(int index =0; index < highestScores.length; index++)
	   {
		   
		    int ref = highestScores[index];
		   System.out.println("element at index "+ index + ref);
		   
	   }
	   
	   
	   }
	   }
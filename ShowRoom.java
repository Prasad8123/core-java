class ShowRoom
{

	static void getCarsShowRoom(String[] carShowRoom){
	
	System.out.println("inside getCarsShowRoom()");
	System.out.println("Numbers of carShowRoom : " + carShowRoom.length );
	System.out.println("list of  TeamMebers");
	for(int c=0; c < carShowRoom.length ; c++)
	{
		System.out.println(carShowRoom[c]);
	
	}
	System.out.println("end of getCarsShowRoom()");
	
	
	}
	
	static void getBikesShowRoom(String[] showRoom){
	
	System.out.println("inside getBikesShowRoom()");
	System.out.println("Numbers of bikesShowRoom : " + showRoom.length );
	System.out.println("list of  TeamMebers");
	for(int b=0; b < showRoom.length ; b++)
	{
		System.out.println(showRoom[b]);
	
	}
	System.out.println("end of getBikesShowRoom()");
	
	
	}
}
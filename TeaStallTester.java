class TeaStallTester
{

public static void main(String teaStall[])
{
      //initalization through setter method. 
   TeaStall.setTeaStallId(567);
   TeaStall.setName("manjunatha tea stall");
   TeaStall.setAddress("malleshwram");
   TeaStall.setContactNo(6574674367l);
   
     // get the data through getter method.
   System.out.println(TeaStall.getTeaStallId());
   System.out.println(TeaStall.getName());
   System.out.println(TeaStall.getAddress());
   System.out.println(TeaStall.getContactNo());
   
       
   System.out.println(TeaStall.getTeaStallId() + " " + TeaStall.getName() + " " + TeaStall.getAddress()
                    + " " + TeaStall.getContactNo());
   }
   
   }
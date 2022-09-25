class Garage
{

  static void getVehicleNos(String[] vehicles)
  {
  
  System.out.println("inside getVehicleNos()");
  System.out.println(" size of VehicleNos is " + vehicles.length);
  System.out.println("list of VehicleNos are :");
  for(int g = 0; g < vehicles.length ; g++)
  {
  System.out.println(vehicles[g]);
  }
  System.out.println("end getVehicleNos()");
  
  }

}
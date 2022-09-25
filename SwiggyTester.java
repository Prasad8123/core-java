class SwiggyTester{



 public static void main(String a[]){
 
 // invoking a method
   double itemPrice =Swiggy.takeOrder("mosaranna") ; 
   System.out.println("the item price is " +itemPrice);
   
  double itemPriceWithQuantity = Swiggy.takeOrder("mosaranna" 67 ) ; 
  
  System.out.println("the item price with quantity is " +itemPriceWithQuantity);
  System.out.println("Your Final Is Ready... Enjoyy");
 
 
 }




}
class SuperMarket
{

static void getVegatables(String[] vegatables)
{

System.out.println("inside getVegatables()");

System.out.println("size of vegatables is" + vegatables.length);
System.out.println("list of vegatables are");

for (int index= 0; index< vegatables.length ;index++)
{

System.out.println(vegatables[index]);

}

System.out.println("end of getVegatables() ");
}

static void getPerfumes(String[] perfumes)
{

System.out.println(" inside getperfumes()");
System.out.println("the size of perfumes are " + perfumes.length);

for (int i=0 ; i< perfumes.length ; i++)
{

System.out.println(perfumes[i]);

}

System.out.println(" end of getperfumes() ");
}

static void getBiscuits(String[] biscuits)
{

System.out.println("inside getBiscuits() " );

System.out.println(" the size of biscuits are " +biscuits.length);

for (int z=0 ; z<biscuits.length ;z++)
{
System.out.println(biscuits[z]);
}

System.out.println("end od getbiscuits() " );
}
} 
class SuperMarket
{

static String superMarketName= "Reliance mart";

public static void main(String a[])
{

System.out.println(" Welcome to " + superMarketName);

String vegetables[] = { "carot", "tomato", "mirchi", "potato"};

String perfumes[] = { "fog", "axe", "screat", "white stone", "sweetheart"};

System.out.println("perfoumes section");
System.out.println("the size of perfumes is" +perfumes.length);


for(int z=0;z<perfumes.length;z++)
{

System.out.println(perfumes[z] + " " );
}



System.out.println("vegetables section");
System.out.println("the size of vegetables is" +vegetables.length);

for(int i=0;i<vegetables.length;i++)
{

System.out.println(vegetables[i] + " " );
}


}
}

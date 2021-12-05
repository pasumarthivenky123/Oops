package assignment41;

public class Dog1 {
	private String name;
	public Dog1(String name)
	{
		this.name=name;
	}
     public boolean equals(String other)
{
   boolean b1=name.equals(other);
    return b1;
}
     public static void main(String[] args)
     {
    	 Dog1  d1=new Dog1("Rufus");
    	 Dog1  d2=new Dog1("Sally");
    	 Dog1  d3=new Dog1("Rufus");
    d1=d3;
    Dog1 d4=d3;
    System.out.println(d1.equals(d2));
    System.out.println(d2.equals(d3));
    System.out.println(d1.equals(d3));
    System.out.println(d3.equals(d4));
     }
}
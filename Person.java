package assignment41;
public class Person {
	String name;
	String email;
    String  phoneNumber;
	String Country;
	String State;
	public void Person1(String theName)
	{
		this.name=theName;
	}
     public void Person2(String Email)
	{
	  this.email=Email;
	}
	 public Person(String country)
	{
		this.Country=country;
	}
	public String getName() {return this.name;}
	public String getEmail() {return this.email;}
	public String getcountry() {return this.Country;}
	public void setName(String theName) {this.name=theName;}
	public void setEmail(String Email) {this.email=Email;}
	public void set(String country) {this.Country=country;}
	public String toString()
	{
		return this.name+" "+this.email+" "+this.Country;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1=new Person("Venky");
       System.out.println(p1);
       Person p2=new Person("Venky");
      p2.setEmail("pasumarthiv97@gmail.com");
      System.out.println(p2);
      Person p3=new Person("Venky");
      p3.set("India");
      System.out.println(p3);
	}
}
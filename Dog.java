package assignment41;
public class Dog {
	public void speak()
	{
		System.out.println("woof!");
	}
   static class Beagle extends Dog{
	//@Overrides
	public void speak() {
		System.out.println("arf arf");
	}
}
public static void main(String[] args)
{
	Dog d=new Dog();
	d.speak();
	Dog b=new Beagle();
	b.speak();
}
}
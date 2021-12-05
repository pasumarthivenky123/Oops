package assignment41;
class Vehicle{
	//instance variables
    public String type;
	 public int tyres;
	//Methods
	public void fuelType(String ftype)
	{
		System.out.println("Fuel Type:"+ftype);
	}
	//Getters
public int getTyres()
{
    return this.tyres;	
}
public String getType()
{
	return this.type;
}
//Setters
public  void setTyres(int tyres)
{
	this.tyres=tyres;
}
public void setType(String type)
{
	this.type=type;
}
    public class Automobiles
{
	public static void main(String[] args)
	{
		//Objects
		Vehicle v1=new Vehicle();
		v1.setTyres(4);
		v1.setType("passenger");
		System.out.println(v1.getTyres());
		System.out.println(v1.getType());
		System.out.println();
		//BIKE
		Vehicle bike=new Vehicle();
		bike.fuelType("petrol");
		System.out.println();
		//Car
		Vehicle car=new Vehicle();
		car.fuelType("petrol/diesel");
		System.out.println();
		//truck
		Vehicle truck=new Vehicle();
		truck.fuelType("diesel");
		System.out.println();
	}
}
}
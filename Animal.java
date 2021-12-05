package assignment41;
  class Animal{
	  //data member
	  public static int count=0;
	  public static int age;
	  protected String landAnimal;
	  protected String waterAnimal;
	  protected String landAndWaterAnimal;
	  //constructor
	  public Animal() {
		  this("Dog","Shark");
	  }
	  public Animal(String landAnimal,String waterAnimal) {
		  this.landAnimal=landAnimal;
		  this.waterAnimal=waterAnimal;
	  }
      protected Animal(String landAnimal,String WaterAnimal,String landAndWaterAnimal) {
    	  this.landAnimal=landAnimal;
		  this.waterAnimal=waterAnimal;
	      this.landAndWaterAnimal=landAndWaterAnimal;
      }
      //getters
      public String getLandAnimal() {
    	  return this.landAnimal;
      }
      public String setLandAnimal() {
    	 this.landAnimal=landAnimal;
    	 return this.landAnimal;
      }
      public String getwaterAnimal() {
    	  return this.waterAnimal;
      }
      public String setwaterAnimal() {
    	 this.waterAnimal=waterAnimal;
    	 return this.waterAnimal;
      } 
      public String getLandAndWaterAnimal() {
    	  return this.landAndWaterAnimal;
      }
      public String setLandAndWaterAnimal() {
    	 this.landAnimal=landAndWaterAnimal;
    	 return this.landAndWaterAnimal;
      }
      //member methods
      public void canRun()
      {
    	  System.out.println("Animals can Fly");
      }
      //static methods
      public static void incrementAge() {
    	  System.out.println(age);
    	  count++;
      }
      public class practice{
    	  public static void main(String[] args)
    	  {
    		  //dog
    		 Animal dog=new Animal();
    		dog.landAnimal="dog";
    		 dog.canRun();
    		 Animal.age=6;
    		 Animal.incrementAge();
    		 //cat
    		 Animal cat=new Animal();
     	     cat.waterAnimal="shark";
     		cat.canRun();
     		 Animal.age=10;
     		 Animal.incrementAge();
     		 //buffalo
     		 Animal buffalo=new Animal();
     		 buffalo.canRun();
     		 Animal.age=12;
     		 Animal.incrementAge(); 
    	  }
      }
}

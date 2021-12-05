package assignment41;
abstract class book
  {
	  String title;
	  abstract void setTitle(String s);
	  String getTitle()
	  {
		  return title;
	  }
  }
    class MyBook extends Book{
	  //@Overrides
    void setTitle(String s)
    {
    	this.setTitle(s);
    }
    String getTitle() {
    	this.getTitle();
    	return this.getTitle();
    }
  }
    class Book {
   public static void main(String[] args)
   {
	   MyBook novel=new MyBook();
	   novel.setTitle("A tale of two cities");
	   System.out.println(novel.getTitle());
   }
}
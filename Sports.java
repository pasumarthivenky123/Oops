package assignment41;
public class Sports {
   String getName() {
	   return "Generic Sports";
   }
   void getNumberOfTeamMembers() {
	   System.out.println("Each team has n player in"+getName());
   }
}
class Soccer extends Sports{
	//@Overrides
	String getName() {
		return "Soccer class";
	}
	//@Overrides
	 void getNumberOfTeamMembers() {
		   System.out.println("Each team has 11 players in"+getName());
	   }
	}
class Sport{
	public static void main(String[] args) {
	Sports s1=new Sports();
	System.out.println(s1.getName());
	s1.getNumberOfTeamMembers();
	Sports s2=new Soccer();
	System.out.println(s2.getName());
	s2.getNumberOfTeamMembers();
}
}
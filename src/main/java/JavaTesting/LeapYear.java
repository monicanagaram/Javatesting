package JavaTesting;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2020;
		int year2=2021;
		int year3=2024;
		int year4=2010;
		
		
		LeapYear.checkleapyear(year);
		LeapYear.checkleapyear(year2);
		LeapYear.checkleapyear(year3);
		LeapYear.checkleapyear(year4);
	}
	public static void checkleapyear(int year){
		
		
		if(year%4==0){
			System.out.println("its a leap year");
		}
		else {
			System.out.println("its not");
		}
	}

}

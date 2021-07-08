package thisexam;

public class ThisTest {

	public static void main(String[] args) {
		BirthDay day1 = new BirthDay();
		System.out.println(day1);// thisexam.BirthDay@5ca881b5
		day1.printThis();
		day1.setYear(2000);
		
		BirthDay day2 = new BirthDay();
		System.out.println(day2);// thisexam.BirthDay@24d46ca6
		day2.printThis();
		day2.setYear(1999);
		
		System.out.println(day1.year);
		System.out.println(day2.year);
	}

}

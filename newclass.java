import java.util.*; // import the Scanner class 

class newclass {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		String yourname;
		int age;

		// Enter username and press Enter
		System.out.println("Enter your name and age");
		yourname = myObj.next();
		age = myObj.nextInt();

		System.out.println("your name " +" "+yourname+" "+"and your age is"+" "+age);
	}
}

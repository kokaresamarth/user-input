package userinput;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=S.next();
		System.out.println("Enter your Age:");
		int age=S.nextInt();
		System.out.println("Enter your Gender:");
		char gender=S.next().charAt(0);
		System.out.println("Enter your Phone no:");
		long phno=S.nextLong();
		System.out.println("-------------------------------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("phno.:"+phno);
		
	}

}

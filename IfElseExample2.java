import java.util.Scanner;
 
public class IfElseExample2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        
		System.out.print("How old are you? ");
		int age = reader.nextInt();
        
		if (age >= 100 && age < 150)
			System.out.println("You are old indeed!");
		else if (age < 100 && age >= 60)
			System.out.println("How is your pension?");
		else if (age < 60 && age >= 30)
			System.out.println("You are clearly an adult.");
		else if (age < 30 && age >= 18) 
			System.out.println("You think you are an adult.");
		else if (age < 18 && age >= 7) 
			System.out.println("Learning process not finished yet?");
		else if (age < 7 && age >= 0) 
			System.out.println("A mere child.");
		else 
			System.out.println("I do not believe that you are " + 
				age + " years old!"); // a rather long statement divided into multpile lines
	}
}
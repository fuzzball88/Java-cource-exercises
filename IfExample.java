import java.util.Scanner;
public class IfExample {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number = 0;
		System.out.print("Type in a number between 1 and 10: ");
		number = reader.nextInt();
		// if number is between 1 and 10
		if (number >= 1 && number <= 10) {
			System.out.println("Thanks!");
			if (number < 5)
				System.out.println("Number is 1, 2, 3 or 4.");
		}
	}
}
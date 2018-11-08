import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		int cardValue = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in card value (1-13): ");
		cardValue = reader.nextInt();
		if (cardValue >= 1 && cardValue <= 13) {
			switch (cardValue) {
			case 1:
				System.out.println("Card is ace.");
				break;
			case 13:
				System.out.println("Card is king.");
				break;
			case 12:
				System.out.println("Card is queen.");
				break;
			case 11:
				System.out.println("Card is jack.");
					break;
			default:
				System.out.println("Card is between 2 and 10.");
			}
		} else {
				System.out.println(cardValue + " is not a valid card value!");
		}
	}
}



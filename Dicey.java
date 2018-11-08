import java.util.Scanner;
public class Dicey {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to play DiceGame!");
		System.out.print("Type in your name and press ENTER: ");
		String player = reader.nextLine();
		System.out.print("Type in the number of game rounds and press ENTER: ");
		int Rounds = reader.nextInt();
		DiceGame Dicey = new DiceGame(player, Rounds);
		Dicey.play();
		Dicey.printStats();
	}
}
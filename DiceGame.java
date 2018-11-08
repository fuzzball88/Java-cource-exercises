public class DiceGame {

	// -- attributes -----------------------
	private Dice playerDice;
	private Dice computerDice;
	private String playerName;
	private int GameRounds;
	private int playerWins;
	private int tieGames;

	// -- constructor ----------------------
	public DiceGame(String name, int Rounds) {
		// always play at least one round
		if (Rounds <= 0)
			Rounds = 1;
		playerDice = new Dice();
		computerDice = new Dice();
		playerName = name;
		GameRounds = Rounds;
	}

	// -- methods ---------------------------
	public void play() {
		System.out.println("Play " + GameRounds + " rounds of DiceGame!");
		for (int i=0; i<GameRounds; ++i) {
			System.out.println(playerName + " throws...");
			playerDice.throw();
			System.out.println("Computer throws...");
			computerDice.throw();
			System.out.print(playerName + " " + playerDice.checkEyeCount() +" - ");
			System.out.print("Computer " + computerDice.checkEyeCount() + ", ");
			if (playerDice.checkEyeCount() > computerDice.checkEyeCount()) {
				System.out.println(playerName + " won!");
				playerWins++;
			} else if (playerDice.checkEyeCount() computerDice.checkEyeCount()) {
				System.out.println("Computer won!");
			} else {
				System.out.println("TieGame!");
				tieGames++;
			}
		}
	}

	public void printStats() {
		double playerWinPercentage = 0.;
		double computerWinPercentage = 0.;
		playerWinPercentage =
		        (playerWins/(GameRounds * 1.0)) * 100;
		computerWinPercentage =
			((GameRounds-playerWins-tieGames)/(GameRounds * 1.0))*100;
		System.out.println();
		System.out.println("Wins\n========================");
		System.out.printf("%1$s: %2$d (%3$.1f %)\n",
		        playerName, playerWins, playerWinPercentage);
		System.out.printf("Computer: %1$d (%2$.1f %)\n",
			(GameRounds-playerWins-tieGames), computerWinPercentage);
		System.out.printf("\nTieGames: %d\n", tieGames);
	}
}
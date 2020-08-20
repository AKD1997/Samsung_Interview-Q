package FootBall_Programing;

public class PenaltyShootout {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
	public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED

	public static void main(String[] args) {

		String teamOne = "A";
		String teamTwo = "B";

		System.out.println("|======================================================================|");
		System.out.println("Hello Everyone, Welcome to the Samsung Cup Final between " + teamOne + " and " + teamTwo);
		System.out.println("It was thrilling 120 minutes and both teams ended up with tied score. ");
		System.out.println("The winner will be decided by Penalty shootout, Let's go then!");
		System.out.println("|======================================================================|");

		int teamOneGoals = 0;
		int teamTwoGoals = 0;

		for (int balls = 0; balls <= 5; balls++) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}

		if (teamOneGoals == teamTwoGoals) {
			System.out.println("____________________________");
			System.out.println("It's a tie! It's a tie! We're going to have more rounds of shootout, "
					+ "first one to score goal wins the FINAL!!!");
			System.out.println("_____________________________");
		}

		while (teamOneGoals == teamTwoGoals) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}

		System.out.println("################################");
		if (teamOneGoals > teamTwoGoals) {
			System.out.println("YESSS!!! " + teamOne + " wins the Samsung Cup, What a Game to win here.");
			System.out.println("Thank you everyone for joining us! Bye Bye!");

		} else {
			System.out.println("OMG!!! " + teamTwo + " beat the English side to win the Samsung Cup, "
					+ "What a Game to win here.");
			System.out.println("Thank you everyone for joining us! Bye Bye!");
		}
		System.out.println("################################");

		System.out.println("Here is the Final Score ");
		System.out.println("          ____________________");
		System.out.println("          |    FINAL SCORE    |");
		System.out.println("          |===================|");
		System.out.println(
				"          |   " + teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo + "   |");
		System.out.println("          |___________________|");

	}

	private static int kickTheBall(String team) {
		int goal = Math.random() > 0.5 ? 1 : 0;
		if (goal > 0) {
			try {
				Thread.sleep(1000);
				System.out.println(GREEN_BOLD_BRIGHT + team + " shoots!" + ANSI_RESET);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(RED_BOLD_BRIGHT + team + " missed!" + ANSI_RESET);
		}
		return goal;
	}

}

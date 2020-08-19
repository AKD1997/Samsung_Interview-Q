# Samsung_Interview-Q
Interview Q for Samsung 
Football matches penalty shootout.

Penalty shootout is a sequence in which a player kicks in football in front the goal post with only goalie in front of the post.

Two teams A and B are to play a football penalty shootout match. Both teams take penalty intermediately after one another. Meaning, first penalty will be taken by Team A, while second by Team B and then Team A again and so on. There are total 5 attempts for each team. 

If one team scored more than the other in the first 5 attempts, then the team which scored more wins. If the score is tally after all 5 attempts, then we move to sudden death.

Sudden death is a sequence where both teams takes one penalty kick each, until one team scores and other team don’t. 

A.) If both teams scored, or B.) If both teams lost the penalty, then we move to next sudden death round, until a condition comes where one team scored and the other team didn’t. The team that scores win the match (immediately without going to next round of sudden death).

Until and unless a team scores and other team don’t, sudden death goes on.
Mandatory requirements to be taken care in program.

•	Result outcome of every single penalty kick should be decided randomly by the program. Meaning, the same program if run again, should give different outcome result without changing the code

•	There is absolutely no input to be taken from user in the program execution. 

•	There should be a delay of 1 second between each penalty kick.


Coding standard will be considered for evaluation. Optimal approaches will also be given consideration while evaluation.

Internet can be used while attempting the question.

Maximum time allotted for the question will be not more than 3 hours.

Solution will be a core-java program with public static void main () as the execution point.

*/package FootBall_Programing;

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



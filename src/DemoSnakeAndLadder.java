import java.util.*;

public class DemoSnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean gameOver = false;
        System.out.print("Enter No of Players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Queue<String> players = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Player Name: ");
            String playerName = sc.nextLine();
            players.add(playerName);
        }

        HashMap<String, Integer> score = new HashMap<>();
        for (String player : players) {
            score.put(player, 0);
        }

        Snakes sal1 = new Snakes();
        Ladders sal2 = new Ladders();

        do {
            for (String player : players) {
                Dice dice = new NormalDice();
                System.out.print("Roll Dice");
                String e = sc.nextLine();
                int roll = dice.roll();
                int currentScore = score.get(player);
                int newScore = currentScore + roll;

                if (newScore <= 100) {
                    score.put(player, newScore);
                }

                if (sal1.isWhat(score.get(player)).equals("snake")) {
                    int snakePosition = sal1.jump(score.get(player));
                    score.put(player, snakePosition);
                    System.out.println("pamuKatu");
                } else if (sal2.isWhat(score.get(player)).equals("ladder")) {
                    int ladderPosition = sal2.jump(score.get(player));
                    score.put(player, ladderPosition);
                    System.out.println("Nichana Aku");
                }

                System.out.println(player + " rolled " + roll + " and is now at position " + score.get(player));

                if (score.get(player) == 100) {
                    gameOver = true;
                    System.out.println(player + " wins the game!");
                    break;
                }
            }
        } while (!gameOver);

    }
}

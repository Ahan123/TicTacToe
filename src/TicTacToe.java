import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        boolean gameOver = false;
        String one = "1";
        String two = "2";
        String three = "3";
        String four = "4";
        String five = "5";
        String six = "6";
        String seven = "7";
        String eight = "8";
        String nine = "9";
        int counter = 0;
        String player;
        char playerNumber;
        boolean playChecker = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe. Player one will play as X and player two");
        System.out.println("will play as O.  Follow the on-screen instructions in order to");
        System.out.println("play.  Press enter to proceed.");

        String enter = scanner.nextLine();

        while (gameOver == false) {

            if (counter % 2 == 0) {
                player = "X";
                playerNumber = '1';

            } else {
                player = "O";
                playerNumber = '2';
            }

            System.out.println("PLAYER " + playerNumber + " 'S TURN: Please type in a number and press enter in order");
            System.out.println("to play.");
            System.out.print(one + " ");
            System.out.print(two + " ");
            System.out.println(three);
            System.out.print(four + " ");
            System.out.print(five + " ");
            System.out.println(six);
            System.out.print(seven + " ");
            System.out.print(eight + " ");
            System.out.println(nine);
            playChecker = false;

            while (playChecker == false) {
                String response = scanner.nextLine();
                System.out.println(response);
                if (response.equals("1") || response.equals("2") || response.equals("3") || response.equals("4") || response.equals("5") || response.equals("6") || response.equals("7") || response.equals("8") || response.equals("9")) {
                    playChecker = true;
                } else {
                    System.out.println("Your output wasn't between one and nine.  Please try again.");
                }
                String test = "test";
                if (response.equals("1")) {
                    test = one;
                    one = player;
                }
                if (response.equals("2")) {
                    test = two;
                    two = player;
                }
                if (response.equals("3")) {
                    test = three;
                    three = player;
                }
                if (response.equals("4")) {
                    test = four;
                    four = player;
                }
                if (response.equals("5")) {
                    test = five;
                    five = player;
                }
                if (response.equals("6")) {
                    test = six;
                    six = player;
                }
                if (response.equals("7")) {
                    test = seven;
                    seven = player;
                }
                if (response.equals("8")) {
                    test = eight;
                    eight = player;
                }
                if (response.equals("9")) {
                    test = nine;
                    nine = player;
                }
                if (test.equals("X") || test.equals("O")) {
                    System.out.println("You placed your icon on a used box.  Please try again.");
                    playChecker = false;
                }
            }

            if ((player.equals(one) && player.equals(two) && player.equals(three)) || (player.equals(four) && player.equals(five) && player.equals(six)) || (player.equals(seven) && player.equals(eight) && player.equals(nine)) || (player.equals(one) && player.equals(four) && player.equals(seven)) || (player.equals(two) && player.equals(five) && player.equals(eight)) || (player.equals(three) && player.equals(six) && player.equals(nine)) || (player.equals(one) && player.equals(five) && player.equals(nine)) || (player.equals(seven) && player.equals(five) && player.equals(three))) {
                System.out.println("Player " + playerNumber + " has won the game!");
                gameOver = true;
            }
            counter++;
        }
    }
}
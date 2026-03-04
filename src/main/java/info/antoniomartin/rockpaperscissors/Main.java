package info.antoniomartin.rockpaperscissors;


public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors!");
        Player playerA = new Player("Machine", Move.PAPER);
        Player playerB= new Player("Antonio");

        Game game = new Game(playerA, playerB, 100);

        GameReport result = game.play();

        printResults(playerA.getPlayerName(), playerB.getPlayerName(), result);

    }

    private static void printResults(String aName, String bName, GameReport r) {
        System.out.println("===== FINAL RESULTS =====");
        System.out.printf("%s - Victory: %d | Lost: %d | Draws: %d%n",
                aName, r.aWins(), r.bWins(), r.draws());
        System.out.printf("%s - Victory: %d | Lost: %d | Draws: %d%n",
                bName, r.bWins(), r.aWins(), r.draws());
    }
}

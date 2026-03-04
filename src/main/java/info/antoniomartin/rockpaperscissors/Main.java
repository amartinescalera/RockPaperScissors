package info.antoniomartin.rockpaperscissors;


import static java.lang.String.format;
import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {
        out.println("Welcome to Rock Paper Scissors!");
        Player playerA = new Player("Machine", Move.PAPER);
        Player playerB= new Player("Antonio");

        Game game = new Game(playerA, playerB, 100);

        out.println("Playing....");
        GameReport result = game.play();

        printResults(playerA.getPlayerName(), playerB.getPlayerName(), result);

    }

    private static void printResults(String aName, String bName, GameReport r) {
        out.println(format("""
        ===== FINAL RESULTS ===
        %s - Victory: %d | Lost: %d | Draws: %d
        %s - Victory: %d | Lost: %d | Draws: %d
        """,aName, r.aWins(), r.bWins(), r.draws(), bName, r.bWins(), r.aWins(), r.draws()));
    }
}

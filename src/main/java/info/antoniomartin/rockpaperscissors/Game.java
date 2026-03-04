package info.antoniomartin.rockpaperscissors;

public class Game {

    private final Player playerA;
    private final Player playerB;
    private final int rounds;

    public Game(Player playerA, Player playerB, int rounds) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.rounds = rounds;
    }

    public GameReport play() {
        int aWins = 0;
        int bWins = 0;
        int draws = 0;

        for (int i = 0; i < rounds; i++) {
            var result = playerA.play().compare(playerB.play());
            switch (result) {
                case -1 -> bWins += 1;
                case 1 ->  aWins += 1;
                default -> draws += 1;
            }
        }
        return new GameReport(rounds, aWins, bWins, draws);
    }
}

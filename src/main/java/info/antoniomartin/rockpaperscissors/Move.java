package info.antoniomartin.rockpaperscissors;

public enum Move {

    ROCK, PAPER, SCISSORS;

    /**
     * @return 1 when we win, -1 when we lost
     */
    int compare(Move otherPlayer) {
        if (this == otherPlayer) return 0;
        return switch (this) {
            case ROCK     -> (otherPlayer == SCISSORS) ? 1 : -1;
            case PAPER    -> (otherPlayer == ROCK)     ? 1 : -1;
            case SCISSORS -> (otherPlayer == PAPER)    ? 1 : -1;
        };
    }

}

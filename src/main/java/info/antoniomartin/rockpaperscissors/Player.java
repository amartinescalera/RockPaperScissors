package info.antoniomartin.rockpaperscissors;

import java.util.Objects;
import java.util.random.RandomGenerator;

public class Player {
    private static final RandomGenerator RNG = RandomGenerator.getDefault();
    private static final Move[] VALUES = Move.values();
    private static final int SIZE = VALUES.length;


    private final String playerName;
    private final Move move;


    public Player(String playerName) {
        this.playerName = playerName;
        this.move = null;
    }

    public Player(String playerName, Move move) {
        this.playerName = playerName;
        this.move = move;
    }

    public Move play() {
        if (Objects.isNull(move)) {
            int index = RNG.nextInt(SIZE); // 0 (incl) .. SIZE (excl)
            return VALUES[index];
        }
        return move;
    }

    public String getPlayerName() {
        return playerName;
    }

}


package info.antoniomartin.rockpaperscissors;

public record GameReport(int rounds, int aWins, int bWins, int draws) {
    public GameReport {
        if (rounds < 0 || aWins < 0 || bWins < 0 || draws < 0) {
            throw new IllegalArgumentException("Negative values not allowed");
        }
        if (aWins + bWins + draws != rounds) {
             throw new IllegalArgumentException("Inconsistent totals");
        }
    }
}

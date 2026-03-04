package info.antoniomartin.rockpaperscissors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameReportTest {

    @Test
    void checkBehaviour() {
        //Given
        int rounds = 30;
        int aWins = 10;
        int bWins = 10;
        int draws = 10;
        //when
        GameReport gameResult = new GameReport(rounds, aWins, bWins, draws);
        //Then
        assertThat(gameResult.aWins()).isEqualTo(10);
        assertThat(gameResult.bWins()).isEqualTo(10);
        assertThat(gameResult.draws()).isEqualTo(10);
        assertThat(gameResult.rounds()).isEqualTo(30);
    }

    @Test
    void checkInconsistentData() {
        //Given
        int rounds = 10;
        int aWins = 10;
        int bWins = 10;
        int draws = 10;
        //when
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class, () -> {
            new GameReport(rounds, aWins, bWins, draws);
        });
        //Then
        assertThat(err.getMessage()).isEqualTo("Inconsistent totals");
    }

    @Test
    void checkInvalidData() {
        //Given
        int rounds = 10;
        int aWins = -10;
        int bWins = 10;
        int draws = 10;
        //when
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class, () -> {
            new GameReport(rounds, aWins, bWins, draws);
        });
        //Then
        assertThat(err.getMessage()).isEqualTo("Negative values not allowed");
    }

}

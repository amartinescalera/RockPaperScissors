package info.antoniomartin.rockpaperscissors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class GameTest {

    @Test
    void checkBehaviour() {
        //Given
        Player playerA = new Player("Test 1", Move.PAPER);
        Player playerB = new Player("Test 2", Move.ROCK);

        //When play the Game
        Game game = new Game(playerA, playerB, 10);
        GameReport report = game.play();

        //Then
        assertThat(report.aWins()).isEqualTo(10);
        assertThat(report.bWins()).isZero();
        assertThat(report.draws()).isZero();
    }

    @Test
    void checkRandomBehaviour() {
        //Given
        Player playerA = new Player("Test 1");
        Player playerB = new Player("Test 2");

        //When play the Game
        Game game = new Game(playerA, playerB, 10);
        GameReport report = game.play();

        //Then
        assertThat(report.rounds()).isEqualTo(10);
        assertThat(report.aWins() + report.bWins() + report.draws()).isEqualTo(10);
    }

}

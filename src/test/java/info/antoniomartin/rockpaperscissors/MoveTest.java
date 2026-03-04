package info.antoniomartin.rockpaperscissors;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MoveTest {

    @Test
    void moveDrawWitPaper() {
        //Given
        Move playerA =  Move.PAPER;
        Move playerB =  Move.PAPER;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isZero();
    }

    @Test
    void moveDrawWithScissors() {
        //Given
        Move playerA =  Move.SCISSORS;
        Move playerB =  Move.SCISSORS;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isZero();
    }

    @Test
    void moveDrawWithRock() {
        //Given
        Move playerA =  Move.ROCK;
        Move playerB =  Move.ROCK;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isZero();
    }

    @Test
    void moveScissorAndPaper() {
        //Given
        Move playerA =  Move.SCISSORS;
        Move playerB =  Move.PAPER;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isPositive();
    }

    @Test
    void moveScissorAndRock() {
        //Given
        Move playerA =  Move.SCISSORS;
        Move playerB =  Move.ROCK;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isNegative();
    }

    @Test
    void movePaperAndScissors() {
        //Given
        Move playerA =  Move.PAPER;
        Move playerB =  Move.SCISSORS;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isNegative();
    }

    @Test
    void movePaperAndRock() {
        //Given
        Move playerA =  Move.PAPER;
        Move playerB =  Move.ROCK;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isPositive();
    }

    @Test
    void moveRockAndPaper() {
        //Given
        Move playerA =  Move.ROCK;
        Move playerB =  Move.PAPER;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isNegative();
    }

    @Test
    void moveRockAndScissors() {
        //Given
        Move playerA =  Move.ROCK;
        Move playerB =  Move.SCISSORS;
        //When
        var game = playerA.compare(playerB);
        //Then
        assertThat(game).isPositive();
    }
}

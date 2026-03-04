package info.antoniomartin.rockpaperscissors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @Test
    void testGeneratePlayer() {
        //Given
        Player player = new Player("Computer", Move.PAPER);

        //When
        Move move = player.play();

        //then
        assertThat(move).isEqualTo(Move.PAPER);
    }

    @Test
    void testGeneratePlayerWithRandomPlay() {
        //Given
        Player player = new Player("Antonio");

        //When
        Move move = player.play();

        //then
        assertThat(move).isNotNull();
    }

}

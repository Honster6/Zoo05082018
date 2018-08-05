package pl.sda.lukaszewicz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {
    @Test
    public void shouldThrowExceptionWhenSomeoneFeedTeddyBear() {
        // given
        Animal animal = new TeddyBear();
        // then
        assertThrows(IDontEatException.class, animal::eat);
    }


}
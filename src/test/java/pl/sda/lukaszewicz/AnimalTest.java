package pl.sda.lukaszewicz;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class AnimalTest {
@Test
public void shouldShouldBeAliveAfterCreation() {
    // given
    Animal animal = new PolarBear();
    // when
    assertTrue(animal.isAlive());
    // then
    System.out.println("Misiek żyje i ma się dobrze");
}
@Test
public void shouldBeAliveAfterEating() {
    // given
    Animal animal = new PolarBear();
    // when
    assertTrue(animal.isAlive());
    // then
    System.out.println("Misiek właśnie zjadł obiad");
}
@Test
public void shouldBeDeadAfter11DaysOfNoEating() {
    // given
    Animal animal = spy(new PolarBear());
    // when
    LocalDateTime value = LocalDateTime.now().minusDays(11);
    when(animal.getEatingTime()).thenReturn(value);
    // then
    assertFalse(animal.isAlive());
    System.out.println("Misiek nie żyje :(");
}

}
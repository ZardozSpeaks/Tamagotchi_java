import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void newTamagotchi_instantiatesCorrectly() {
    Tamagotchi testTamagotchi = new Tamagotchi(8,8,8);
    assertEquals(true, testTamagotchi instanceof Tamagotchi);
  }

  @Test
  public void newTamagotchi_returnsEnergy() {
    Tamagotchi testTamagotchi = new Tamagotchi(8,0,8);
    assertEquals(8, testTamagotchi.getEnergy());
  }

  @Test
  public void newTamagotchi_returnsFullness() {
    Tamagotchi testTamagotchi = new Tamagotchi(8,0,8);
    assertEquals(0, testTamagotchi.getFullness());
  }

  @Test
  public void newTamagotchi_returnsTrueWhenAlive_true() {
    Tamagotchi testTamagotchi = new Tamagotchi(8,8,8);
    assertEquals(true, testTamagotchi.isAlive());
  }

  @Test
  public void newTamagotchi_returnsFalseWhenDead_False() {
    Tamagotchi testTamagotchi = new Tamagotchi(0,0,0);
    assertEquals(false, testTamagotchi.isAlive());
  }

  @Test
  public void newTamagotchi_returnsFalseWhenUnconscious_False() {
    Tamagotchi testTamagotchi = new Tamagotchi(1,8,8);
    assertEquals(false, testTamagotchi.isConscious());
  }

  @Test
  public void newTamagotchi_returnsFalseWhenStarving_False() {
    Tamagotchi testTamagotchi = new Tamagotchi(5,1,8);
    assertEquals(false, testTamagotchi.isFull());
  }

  @Test
  public void newTamagotchi_returnsFalseWhenUnhappy_False() {
    Tamagotchi testTamagotchi = new Tamagotchi(5,4,0);
    assertEquals(false, testTamagotchi.isHappy());
  }
}

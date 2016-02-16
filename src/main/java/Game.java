public class Game {

  public boolean isAlive() {
    int energy = Tamagotchi.getEnergy();
    int hunger = Tamagotchi.getHunger();
    int happiness = Tamagotchi.getHappiness();
    boolean stillAlive = true;
    if (energy == 0 && hunger == 8 && happiness == 0) {
      stillAlive = false;
    }
    return stillAlive;
  }

  public boolean isConscious() {
    int energy = Tamagotchi.getEnergy();
    boolean stillConscious = true;
    if (energy <= 2) {
      stillConscious = false;
    }
    return stillConscious;
  }

  public boolean isFull() {
    int hunger = Tamagotchi.getHunger();
    boolean stillFull = true;
    if (hunger <= 2) {
      stillFull = false;
    }
    return stillFull;
  }

  public boolean isHappy() {
    int happiness = Tamagotchi.getHappiness();
    boolean stillHappy = true;
    if (happiness <= 2) {
      stillHappy = false;
    }
    return stillHappy;
  }
}

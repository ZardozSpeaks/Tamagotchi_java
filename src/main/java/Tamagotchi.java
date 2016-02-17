public class Tamagotchi {
  private String mName = "";
  private int mEnergy;
  private int mFullness;
  private int mHappiness;
  private final static int MAX_ENERGY = 8;
  private final static int MAX_FULLNESS = 8;
  private final static int MAX_HAPPINESS = 8;

  public Tamagotchi() {
    mEnergy = MAX_ENERGY;
    mFullness = MAX_FULLNESS;
    mHappiness = MAX_HAPPINESS;
  }

  public int getEnergy() {
    return mEnergy;
  }

  public int getFullness() {
    return mFullness;
  }

  public int getHappiness() {
    return mHappiness;
  }

  public String getName() {
    return mName;
  }

  public boolean isAlive() {
    int energy = getEnergy();
    int fullness = getFullness();
    int happiness = getHappiness();
    boolean stillAlive = true;
    if (energy == 0 && fullness == 0 && happiness == 0) {
      stillAlive = false;
    }
    return stillAlive;
  }

  public boolean isConscious() {
    int energy = getEnergy();
    boolean stillConscious = true;
    if (energy <= 2) {
      stillConscious = false;
    }
    return stillConscious;
  }

  public boolean isFull() {
    int fullness = getFullness();
    boolean stillFull = true;
    if (fullness <= 2) {
      stillFull = false;
    }
    return stillFull;
  }

  public boolean isHappy() {
    int happiness = getHappiness();
    boolean stillHappy = true;
    if (happiness <= 2) {
      stillHappy = false;
    }
    return stillHappy;
  }

  public void feedMe() {
    mEnergy--;
    mHappiness--;
    mFullness = MAX_FULLNESS;
  }

  public void napTime() {
    mFullness--;
    mHappiness--;
    mEnergy = MAX_ENERGY;
  }

  public void playTime() {
    mEnergy--;
    mFullness--;
    mHappiness = MAX_HAPPINESS;
  }
}

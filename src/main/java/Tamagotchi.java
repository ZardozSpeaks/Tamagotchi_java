public class Tamagotchi {
  private int mEnergy = MAX_ENERGY;
  private int mHunger = 0;
  private int mHappiness = MAX_HAPPINESS;
  private final static int MAX_ENERGY = 8;
  private final static int MAX_HUNGER = 8;
  private final static int MAX_HAPPINESS = 8;

  public Tamagotchi(int energy, int hunger, int happiness) {
    mEnergy = energy;
    mHunger = hunger;
    mHappiness = happiness;

  }

  public int getEnergy() {
    return mEnergy;
  }

  public int getHunger() {
    return mHunger;
  }

  public int getHappiness() {
    return mHappiness;
  }

  public void feedMe() {
    energy = getEnergy();
    if !(energy == MAX_ENERGY) {
      mEngery ++;
    }
    mHunger = 0;
  }

  public void napTime() {
    hunger = getHunger();
    if !(hunger == MAX_HUNGER) {
      mHunger++;
    }
    mEnergy = 8;
  }

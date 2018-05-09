// Nastassja Motro 5/8/18

// models a playing die

import java.util.Random;

public class Die {
  
  private static Random numberGenerator = new Random(); // ourRandNumGen
  private final int mySide; // iMyNumSides
  private int result; // iMyResult
  public static final int SIDES = 6; //DEFAULT_SIDES
  
  public Die() {
    this(SIDES);
  }
  
  public Die(int numberOfSides) {
    assert numberOfSides > 1: "Violation of condition: numberOfSides = " + numberOfSides + "numberOfSides must be greather than 1";
    mySide = numberOfSides;
    result = 1;
    assert getResult() == 1 && getNumberOfSides() == numberOfSides;
  }
  
  public Die(int numberOfSides, int endResult) {
    assert numberOfSides > 1 && 1 <= endResult && endResult <= numberofSides: "Violation of condition";
    mySide = numberOfSides;
    result = endResult;
  }
  
  public int roll() {
    result = numberGenerator.nextInt(mySide) + 1;
    assert( 1 <= getResult()) && (getResult() <= getNumberOfSides());
    return result;
  }
  
  public int getNumberOfSides() {
    return mySide
  }
  
  public int getResult() {
    return result;
  }
  
  public boolean equals(Object otherObject) {
    boolean endResult = true;
    if(otherObject == null) {
      endResult = false;
    } else if(this == otherObject) {
      endResult = true;
    } else if (this.getClass() != otherObject.getClass()) {
      endResult = false;
    } else {
      Die otherDie = (Die)otherObject;
      endResult = this.result == otherDie.result && this.mySide == otherDie.mySide;
    }
    return endResult;
  }
  
  public String toString() {
    return "Number of Sides " + getNumberOfSides() + " result " + getResult();
  }
}

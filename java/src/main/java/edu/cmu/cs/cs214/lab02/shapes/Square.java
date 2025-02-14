package edu.cmu.cs.cs214.lab02.shapes;

/**
 * This class represents a square shape and implements the Shape interface.
 * It provides methods to calculate the area and draw the square.
 */
public class Square implements Shape {
  private final double sideLen;  // `final` болгосон

  /**
   * Constructs a square with the specified side length.
   * 
   * @param sideLen The length of the side of the square.
   */
  public Square(double sideLen) {
    this.sideLen = sideLen;
  }

  /**
   * Calculates the area of the square.
   * 
   * @return The area of the square.
   */
  @Override
  public double getArea() {
    return sideLen * sideLen;
  }

  /**
   * Draws the square by printing a message.
   */
  @Override
  public void draw() {
    System.out.println("Drawing a square.");
  }
}

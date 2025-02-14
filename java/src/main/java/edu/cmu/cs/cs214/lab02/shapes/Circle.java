package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Circle класс нь дугуйн талбайг тооцоолж, зурах функцийг агуулна.
 */
public class Circle implements Shape {
  private final double radius;

  /**
   * Circle объект үүсгэнэ.
   *
   * @param radius Дугуйн радиус.
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle.");
  }
}

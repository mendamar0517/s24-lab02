package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape; 

/**
 * Main класс нь програмын гүйцэтгэлийг эхлүүлнэ.
 */
public class Main {
  /**
   * Програмын гол ажиллах цэг.
   *
   * @param args Командын мөрийн аргументууд.
   */
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(2, 3);
    Shape circle = new Circle(5);

    Renderer renderer1 = new Renderer(rectangle);
    Renderer renderer2 = new Renderer(circle);

    renderer1.draw();
    renderer2.draw();
  }
}

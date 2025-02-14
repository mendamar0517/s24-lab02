package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Renderer класс нь өгөгдсөн хэлбэр дүрсийг зурах үүрэгтэй.
 */
public class Renderer {
  private final Shape shape; // `final` болгож сайжруулсан

  /**
   * Renderer классын конструктор.
   *
   * @param shape Зурах хэлбэр дүрс.
   */
  public Renderer(Shape shape) {
    this.shape = shape;
  }

  /**
   * Хэлбэр дүрсийг зурж, талбайн хэмжээг хэвлэнэ.
   */
  public void draw() {
    shape.draw(); // Алдаа засагдсан
    System.out.println("""
        Shape printed
        Its area is """ + shape.getArea()); // Text block ашигласан
  }
}

package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Rectangle класс нь тэгш өнцөгт хэлбэрийн объектыг илэрхийлдэг.
 */
public class Rectangle implements Shape {
  public double height;
  public double width;

  /**
   * Конструктор нь тэгш өнцөгт хэлбэрийн өндөр болон өргөнийг тохируулна.
   *
   * @param height Өндөр
   * @param width Өргөн
   */
  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  /**
   * Тэгш өнцөгтийн талбайг тооцоолох.
   *
   * @return Талбай (өндөр × өргөн)
   */
  @Override
  public double getArea() {
    return height * width;
  }

  /**
   * Тэгш өнцөгтийг зурж хэвлэх.
   */
  @Override
  public void draw() {
    System.out.println("Drawing a rectangle.");
  }
}

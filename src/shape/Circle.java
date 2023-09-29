package shape;

import utils.Coordinate;
import utils.Vector2D;

import java.util.Arrays;

public class Circle implements Shape {
  protected double r;
  private int splits;
  private Vector2D centerPosition;

  public Circle(double r, double x1, double x2, double y1, double y2) {
    this.r = r;
    this.centerPosition = new Vector2D(x2 - x1, y2 - y1);
    this.splits = 1;
  }

  public Circle(double r, int splits, double x1, double x2, double y1, double y2) {
    this.r = r;
    this.centerPosition = new Vector2D(x2 - x1, y2 - y1);
    this.splits = splits;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(this.r, 2) / this.splits;
  }

  @Override
  public double volume() {
    return 0;
  }

  @Override
  public double staticMomentInX() {
    return area() * centerOfMassInX();
  }

  @Override
  public double staticMomentInY() {
    return area() * centerOfMassInY();
  }

  @Override
  public double staticMomentInZ() {
    return 0;
  }

  public double[] staticMoments() {
    return new double[] {staticMomentInX(), staticMomentInY(), staticMomentInZ()};
  }

  @Override
  public double centerOfMassInX() {
    if (splits == 4) {
      return (4 * r) / (3 * Math.PI) + centerPosition.x();
    }
    return centerPosition.x();
  }

  @Override
  public double centerOfMassInY() {
    if (splits == 2 || splits == 4) {
      return (4 * r) / (3 * Math.PI) + centerPosition.y();
    }
    return centerPosition.y();
  }

  @Override
  public double centerOfMassInZ() {
    return 0;
  }

  @Override
  public double[] centerOfMasses() {
    return new double[] {centerOfMassInX(), centerOfMassInY(), centerOfMassInZ()};
  }
  @Override
  public Coordinate getCenterPosition() {
    return null;
  }

  public double circumference() {
    return Math.PI * 2 * Math.pow(r, 2);
  }

  public String toString() {
    return "=== Moments statiques cercle === \n" + Arrays.toString(staticMoments());
  }
}

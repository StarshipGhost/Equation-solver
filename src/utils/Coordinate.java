package utils;

import java.util.Arrays;

public class Coordinate {
  private double[] c;

  public Coordinate(double x, double y, double z) {
    this.c = new double[]{x, y, z};
  }

  public Vector subtract(Coordinate c) {
    return new Vector(this.c[0] - c.c[0], this.c[1] - c.c[1], this.c[2] - c.c[2]);
  }

  public double x() {
    return this.c[0];
  }

  public double y() {
    return this.c[1];
  }

  public double z() {
    return this.c[2];
  }

  public String toString() {

    return "( " + this.c[0] + ", " + this.c[1] + ", " + this.c[2] + " )";
  }
}

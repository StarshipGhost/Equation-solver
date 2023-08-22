package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinate {
  private double[] c;

  public Coordinate(double x, double y, double z) {
    this.c = new double[]{x, y, z};
  }

  public Vector3D subtract(Coordinate c) {
    return new Vector3D(this.x() - c.x(), this.y() - c.y(), this.z() - c.z());
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

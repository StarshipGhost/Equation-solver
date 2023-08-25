package utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Coordinate {
  private double[] coordinates;

  public Coordinate(double... c) {
    this.coordinates = c;
  }

  public Vector3D subtractVector3D(Coordinate c) {
    return new Vector3D(this.x() - c.x(), this.y() - c.y(), this.z() - c.z());
  }

  public Vector2D subtractVector2D(Coordinate c) {
    return new Vector2D(this.x() - c.x(), this.y() - c.y());
  }

  public Vector subtractVector(Coordinate c) {
    double[] a = new double[this.coordinates.length];
    for (int i = 0; i < this.coordinates.length; i++) {
      a[i] = this.get(i) - c.get(i);
    }
    return new Vector(a);
  }

  public double x() {
    return get(0);
  }

  public double y() {
    return get(1);
  }

  public double z() {
    return get(2);
  }

  public double get(int i) {
    return get(i);
  }

  public String toString() {
    return Arrays.stream(coordinates)
        .mapToObj(c -> String.format("%f", c))
        .collect(Collectors.joining(", ", "(", ")"));
  }
}

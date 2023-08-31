package utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Coordinate {
  private double[] coordinates;

  public Coordinate(double... c) {
    this.coordinates = c;
  }


  public Coordinate convert(int power) {
    double[] a = new double[this.coordinates.length];

    for (int i = 0; i < this.coordinates.length; i++) {
      a[i] = this.get(i) * Math.pow(10, power);
    }
    return new Coordinate(a);
  }

  public Vector3D subtract3DCoordinate(Coordinate c) {
    return new Vector3D(this.x() - c.x(), this.y() - c.y(), this.z() - c.z());
  }

  public Vector2D subtract2DCoordinate(Coordinate c) {
    return new Vector2D(this.x() - c.x(), this.y() - c.y());
  }

  public Vector subtractCoordinate(Coordinate c) {
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
    return this.coordinates[i];
  }

  public String toString() {
    return Arrays.stream(coordinates)
        .mapToObj(c -> String.format("%f", c))
        .collect(Collectors.joining(", ", "(", ")"));
  }
}

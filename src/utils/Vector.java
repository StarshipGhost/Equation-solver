package utils;

import static utils.Geometry.sin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Vector implements Iterable<Double> {
  protected double[] components;

  public Vector(double... components) {
    this.components = components;
  }

  public double norm() {
    return Math.sqrt(Arrays.stream(this.components).map(c -> c * c).sum());
  }

  public void unitVector() {
    multiplyComponents(1 / this.norm());
  }

  public void multiplyComponents(double k) {
    for (int i = 0; i < this.components.length; i++) {
      this.components[i] *= k;
    }
  }

  public double scalarProduct(Vector Q) {
    int n = size();
    return IntStream.range(0, n).mapToDouble(i -> this.components[i] * Q.components[i]).sum();
  }

  public double angleBetween(Vector v) {
    if (this.is2Dimension() || this.is3Dimension()) {
      return Math.toDegrees(Math.acos(this.scalarProduct(v) / this.norm() * v.norm()));
    } else {
      throw new IllegalArgumentException();
    }
  }

  public double[] angles() {
    double norm = this.norm();
    return Arrays.stream(components).map(c -> Math.toDegrees(Math.acos(c / norm))).toArray();
  }

  public double angle() {
    if (this.is2Dimension()) {
      return Math.toDegrees(Math.atan(get(1) / get(0)));
    }
    throw new IllegalArgumentException();
  }

  public double momentOfAForce(double r, double F, double angle) {
    if (this.is2Dimension()) {
      return r * F * sin(angle);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public double get(int i) {
    return this.components[i];
  }

  public boolean is3Dimension() {
    return this.components.length == 3;
  }

  public boolean is2Dimension() {
    return this.components.length == 2;
  }

  public int size() {
    return this.components.length;
  }

  @Override
  public Iterator<Double> iterator() {
    return Arrays.stream(components).boxed().toList().iterator();
  }

  @Override
  public String toString() {
    return Arrays.stream(components)
        .mapToObj(c -> String.format("%.4f", c))
        .collect(Collectors.joining(", ", "(", ")"));
  }
}

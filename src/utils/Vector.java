package utils;


public class Vector {
  private double[] v;

  public Vector(double i, double j, double k) {
    this.v = new double[]{i, j, k};
  }

  public double norm() {
    return Math.sqrt(Math.pow(this.v[0], 2) + Math.pow(this.v[1], 2) + Math.pow(this.v[2], 2));
  }

  public Vector unitVector() {
    return new Vector(this.v[0] / norm(), this.v[1] / norm(), this.v[2] / norm());
  }

  public Vector multiplyComponents(double n) {
    return new Vector(this.v[0] * n, this.v[1] * n, this.v[2] * n);
  }

  public double scalarProduct(Vector v) {
    return this.v[0] * v.v[0] + this.v[1] * v.v[1] + this.v[2] * v.v[2];
  }

  public double angleBetweenVectors(Vector v) {
    return Math.toDegrees(Math.acos(this.scalarProduct(v) / this.norm() * v.norm()));
  }

  public double x() {
    return this.v[0];
  }

  public double y() {
    return this.v[1];
  }

  public double z() {
    return this.v[2];
  }

  public static double sin(int x) {
    return Math.sin(x * (Math.PI / 180));
  }

  public static double cos(int x) {
    return Math.cos(x * (Math.PI / 180));
  }

  public String toString() {
    return "(" + String.format("%.4f", x()) + ", " + String.format("%.4f", y()) + ", " + String.format("%.4f", z()) + " )";
  }
}

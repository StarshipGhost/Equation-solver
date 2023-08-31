package utils;

public class Vector2D extends Vector {
  private double F, x, y;

  public Vector2D(double x, double y) {
    super(x, y);
    this.x = x;
    this.y = y;
  }

  public static Vector2D fromMagnitudeAndAngle(double magnitude, double angle) {
    double x = magnitude * Geometry.cos(angle);
    double y = magnitude * Geometry.sin(angle);
    return new Vector2D(x, y);
  }

  public Vector2D(double F, double XYAngle, boolean checkIfAngleOpposedFromXComponent) {
    this.F = F;
    this.x = Fx(XYAngle, checkIfAngleOpposedFromXComponent);
    this.y = Fy(XYAngle, checkIfAngleOpposedFromXComponent);
    super.components = new double[] {x, y};
  }

  public Vector3D crossProduct(Vector2D Q) {
    return new Vector3D(0, 0.0, this.x() * Q.y() - this.y() * Q.x());
  }

  public boolean isAngleOpposedFromXComponent(boolean bool) {
    return bool;
  }

  public double Fx(double angle, boolean checkIfAngleOpposedFromXComponent) {

    if (isAngleOpposedFromXComponent(checkIfAngleOpposedFromXComponent)) {
      return this.F * Geometry.sin(angle);
    } else {
      return this.F * Geometry.cos(angle);
    }
  }

  public double Fy(double angle, boolean checkIfAngleOpposedFromXComponent) {
    if (isAngleOpposedFromXComponent(checkIfAngleOpposedFromXComponent)) {
      return this.F * Geometry.cos(angle);
    }
    return this.F * Geometry.sin(angle);
  }

  public double x() {
    return get(0);
  }

  public double y() {
    return get(1);
  }

  public int zone(int angle) {

    int clock = angle / 90;

    /** [ 0, 90 [ -> 0 [ 90, 180 [ -> 1 [ 180, 270 [ -> 2 [ 270, 360 [ -> 3 */
    return clock;
  }
}

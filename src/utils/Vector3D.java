package utils;

import static utils.Geometry.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Vector3D extends Vector {
  private double F, x, y, z;

  public Vector3D(double x, double y, double z) {
    super(x, y, z);
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Vector3D(
      double F,
      double YZPlanAngle,
      double XZPlanAngle,
      boolean checkIfYZAngleOpposedFromHComponent,
      boolean checkIfXZAngleOpposedFromXComponent) {
    this.F = F;
    this.x =
        Fx(
            YZPlanAngle,
            XZPlanAngle,
            checkIfYZAngleOpposedFromHComponent,
            checkIfXZAngleOpposedFromXComponent);
    this.y = Fy(YZPlanAngle, checkIfYZAngleOpposedFromHComponent);
    this.z =
        Fz(
            YZPlanAngle,
            XZPlanAngle,
            checkIfYZAngleOpposedFromHComponent,
            checkIfXZAngleOpposedFromXComponent);
    super.components = new double[] {x, y, z};
  }

  public Vector3D crossProduct(Vector3D Q) {
//    String format = " %.4f ";
//    List<String> ops = Arrays.asList("*", "-", "*", "%n");
//    String[] labels = {"Vx", "Vy", "Vz"};
//    Double[][] values = {
//      {this.y(), Q.z(), this.z(), Q.y()},
//      {this.x(), Q.z(), this.z(), Q.x()},
//      {this.x(), Q.y(), this.y(), Q.x()}
//    };
//
//    for (int i = 0; i < labels.length; i++) {
//      String label = String.format("%s =", labels[i]);
//      String[] opsWithLabel = Stream.concat(Stream.of(label), ops.stream()).toArray(String[]::new);
//      String line = String.join(format, opsWithLabel);
//      System.out.printf(line, values[i]);
//    }
    // System.out.printf(
    //         "Vx = " + format + " * " + format + " - " + format + " * " + format + "%n" +
    //         "Vy = " + format + " * " + format + " - " + format + " * " + format + "%n" +
    //         "Vz = " + format + " * " + format + " - " + format + " * " + format + "%n",
    //         this.y(), Q.z(), this.z(), Q.y(), this.z(), Q.x(), this.x(), Q.z(), this.x(), Q.y(),
    // this.y(), Q.x());
    return new Vector3D(
        this.y() * Q.z() - this.z() * Q.y(),
        -(this.x() * Q.z() - this.z() * Q.x()),
        this.x() * Q.y() - this.y() * Q.x());
  }

  public double getForceFromMomentOfForceAboutAnAxis(Vector3D unitVector, Vector3D M, Vector3D r_F) {
    double x = -unitVector.scalarProduct(M);
    Vector3D u1 = unitVector.crossProduct(r_F);
    double y = u1.scalarProduct(this);
    return x / y;
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

  public boolean isYZAngleOpposedFromHComponent(boolean bool) {
    return bool;
  }

  public boolean isXZAngleOpposedFromXComponent(boolean bool) {
    return bool;
  }

  public double Fy(double angle, boolean checkIfYZAngleOpposedFromHComponent) {
    if (isYZAngleOpposedFromHComponent(checkIfYZAngleOpposedFromHComponent)) {
      return F * cos(angle);
    } else {
      return F * sin(angle);
    }
  }

  public double Fh(double angle, boolean checkIfYZAngleOpposedFromHComponent) {
    if (isYZAngleOpposedFromHComponent(checkIfYZAngleOpposedFromHComponent)) {
      return F * sin(angle);
    } else {
      return F * cos(angle);
    }
  }

  public double Fx(
      double angle1,
      double angle2,
      boolean checkIfYZAngleOpposedFromHComponent,
      boolean checkIfXZAngleOpposedFromXComponent) {
    if (isXZAngleOpposedFromXComponent(checkIfXZAngleOpposedFromXComponent)) {
      return Fh(angle1, checkIfYZAngleOpposedFromHComponent) * sin(angle2);
    } else {
      return Fh(angle1, checkIfYZAngleOpposedFromHComponent) * cos(angle2);
    }
  }

  public double Fz(
      double angle1,
      double angle2,
      boolean checkIfYZAngleOpposedFromHComponent,
      boolean checkIfXZAngleOpposedFromXComponent) {

    if (isXZAngleOpposedFromXComponent(checkIfXZAngleOpposedFromXComponent)) {
      return Fh(angle1, checkIfYZAngleOpposedFromHComponent) * cos(angle2);
    } else {
      return Fh(angle1, checkIfYZAngleOpposedFromHComponent) * sin(angle2);
    }
  }
}

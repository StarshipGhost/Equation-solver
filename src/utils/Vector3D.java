package utils;

import static utils.Geometry.*;

public class Vector3D {
    private double[] v;
    private double F;
    private String name;

    public Vector3D(double i, double j, double k) {
        this.v = new double[]{i, j, k};
    }

    public Vector3D(String name, double F, double YZPlanAngle, double XZPlanAngle) {
        this.name = name;
        this.F = F;
        this.v = new double[]{F_x(YZPlanAngle, XZPlanAngle), F_y(YZPlanAngle), F_z(YZPlanAngle, XZPlanAngle)};
    }

    public double norm() {
        return Math.sqrt(Math.pow(this.x(), 2) + Math.pow(this.y(), 2) + Math.pow(this.z(), 2));
    }

    public Vector3D unitVector() {
        return new Vector3D(this.x() / norm(), this.y() / norm(), this.z() / norm());
    }

    public Vector3D multiplyComponents(double n) {
        return new Vector3D(this.x() * n, this.y() * n, this.z() * n);
    }

    public double scalarProduct(Vector3D Q) {
        return this.x() * Q.x() + this.y() * Q.y() + this.z() * Q.z();
    }

    public Vector3D crossProduct(Vector3D Q) {
        return new Vector3D(this.y() * Q.z() - this.z() * Q.y(), this.z() * Q.x() - this.x() * Q.z(), this.x() * Q.y() - this.y() * Q.x());
    }

    public double angleBetween(Vector3D v) {
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

    public double F_y(double angleOpposedToBase) {
        return F * cos(angleOpposedToBase);
    }

    public double F_h(double angleOpposedToBase) {
        return F * sin(angleOpposedToBase);
    }

    public double F_x(double angleOpposedToBase, double angleOpposedToZAxis) {
        return F_h(angleOpposedToBase) * cos(angleOpposedToZAxis);
    }
    public double F_z(double angleOpposedToBase, double angleOpposedToZAxis) {
        return F_h(angleOpposedToBase) * sin(angleOpposedToZAxis);
    }
    public double XAngle(double F, double F_x) {
        return Math.toDegrees(Math.acos(F_x / F));
    }

    public double YAngle(double F, double F_y) {
        return Math.toDegrees(Math.acos(F_y / F));
    }

    public double ZAngle(double F, double F_z) {
        return Math.toDegrees(Math.acos(F_z / F));
    }

    public double getF() {
        return F;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)", x(), y(), z());
    }
}

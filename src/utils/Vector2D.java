package utils;

import static utils.Geometry.*;
public class Vector2D {

    private double[] v;
    private double F;

    public Vector2D(double i, double j) {
        this.v = new double[]{i, j};
    }

    public Vector2D(double F, int XYAngle) {
        this.F = F;
        this.v = new double[]{F_x(XYAngle), F_y(XYAngle)};
    }

    public double norm() {
        return Math.sqrt(Math.pow(this.x(), 2) + Math.pow(this.y(), 2));
    }

    public Vector2D unitVector() {
        return new Vector2D(this.x() / norm(), this.y() / norm());
    }

    public Vector2D multiplyComponents(double n) {
        return new Vector2D(this.x() * n, this.y() * n);
    }

    public double scalarProduct(Vector2D Q) { return this.x() * Q.x() + this.y() * Q.y();   }

    public double momentOfAForce(double r, double F, int angle) {
        return r * F * sin(angle);
    }

    public Vector3D crossProduct(Vector2D Q) {
        return new Vector3D(this.y() * 0 - 0 * Q.y(), 0 * Q.x() - this.x() * 0, this.x() * Q.y() - this.y() * Q.x());
    }
    public double angleBetween(Vector2D Q) {
        return Math.toDegrees(Math.acos(this.scalarProduct(Q) / this.norm() * Q.norm()));
    }

    public double x() {
        return this.v[0];
    }

    public double y() {
        return this.v[1];
    }

    public double F_x(int angle) {
        return this.F * cos(angle);
    }

    public double F_y(int angle) {
        return this.F * sin(angle);
    }


    public String toString() {
        return String.format("( %.2f, %.2f )", this.x(), this.y());
    }
}

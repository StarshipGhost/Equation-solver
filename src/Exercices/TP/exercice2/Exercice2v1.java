package Exercices.TP;

import utils.*;
import static utils.Geometry.*;

public class Exercice2 {

  private final double r = 30 * Math.pow(10, -2);
  private final double g = -9.81;
  private final double m = 300;
  private Coordinate A, B, C, D, O;
  private Vector3D AD, BD, CD, W;
  private Matrix T;

  public Exercice2() {

    double OA = r;
    double DA = 50 * Math.pow(10, -2);
    double Dy = Math.sqrt(Math.pow(DA, 2) - Math.pow(OA, 2));

    this.A = new Coordinate(r, 0, 0);
    this.B = new Coordinate(0, r, 0);
    this.C = new Coordinate( -r * cos(30), -r * sin(30), 0);
    this.D = new Coordinate(0, 0, Dy);
    this.O = new Coordinate(0, 0, 0);

    System.out.println("========== TP - Exercice 2 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("O = " + O);

    this.AD = D.subtract3DCoordinate(A);
    this.BD = D.subtract3DCoordinate(B);
    this.CD = D.subtract3DCoordinate(C);
    this.W = new Vector3D(0, 0, m * g);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AD = " + AD);
    System.out.println("BD = " + BD);
    System.out.println("CD = " + CD);
    System.out.println("W = " + W);

    AD.unitVector();
    BD.unitVector();
    CD.unitVector();

    System.out.println("========== Vecteurs Unitaire ==========");
    System.out.println("AD = " + AD);
    System.out.println("BD = " + BD);
    System.out.println("CD = " + CD);

    this.T =
        new Matrix(
            new double[][] {
              {AD.x(), BD.x(), CD.x(), -W.x()},
              {AD.y(), BD.y(), CD.y(), -W.y()},
              {AD.z(), BD.z(), CD.z(), -W.z()}
            });

    System.out.println("========== Système d'équation ==========");
    System.out.println(T.solve("T_AD", "T_BD", "T_CD"));

    AD.multiplyComponents(T.solve("T_AD", "T_BD", "T_CD").get("T_AD"));
    BD.multiplyComponents(T.solve("T_AD", "T_BD", "T_CD").get("T_BD"));
    CD.multiplyComponents(T.solve("T_AD", "T_BD", "T_CD").get("T_CD"));

    Vector3D R =
        new Vector3D(
            AD.x() + BD.x() + CD.x() + W.x(),
            AD.y() + BD.y() + CD.y() + W.y(),
            AD.z() + BD.z() + CD.z() + W.z());

    System.out.println("========== Vecteurs Tension ==========");
    System.out.println("AD = " + AD);
    System.out.println("BD = " + BD);
    System.out.println("CD = " + CD);
    System.out.println("W = " + W);
    /**
     * La résultante est égal à 0 donc nous avons trouvé les tensions pour lesquelles le système
     * reste à l'équilibre.
     */

    System.out.println("========== Vecteurs Résultant ==========");
    System.out.println("R = " + R);
  }
}

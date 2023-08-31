package Exercices.chapitre2;

import utils.*;

public class Exercice2125 {
  private final double P = 341;
  private final double h = 525 * Math.pow(10, -3);
  private final double y = 155 * Math.pow(10, -3);
  private final double x = 200 * Math.pow(10, -3);
  private Coordinate O, A, B;
  private Vector3D AB, T_AB;
  private Matrix T;

  public Exercice2125() {

    System.out.println("========== Exercice 2.125 ==========");
    double b = Math.sqrt(Math.pow(h, 2) - Math.pow(y, 2));
    double z = Math.sqrt(Math.pow(b, 2) - Math.pow(x, 2));

    this.O = new Coordinate(0, 0, 0);
    this.A = new Coordinate(0, y, 0);
    this.B = new Coordinate(x, 0, z);

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("O = " + O);

    this.AB = B.subtract3DCoordinate(A);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);

    AB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);

    this.T = new Matrix(new double[][] {{AB.y(), -P}});
    double T_AB = T.solve("T_AB").get("T_AB");

    System.out.println("========== Tension sur le fil ==========");
    System.out.println(T_AB + " N");

    System.out.println("========== Grandeur de la force Q ==========");
    System.out.println(T_AB * AB.z() + " N");
  }
}

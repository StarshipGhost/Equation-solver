package Exercices.chapitre2;
import utils.*;
public class Exercice2107 {

  private final double T_AD = 305;
  private Coordinate A, B, C, D;
  private Vector3D AB, AC, AD;
  private Matrix T;


  public Exercice2107() {

    this.A = new Coordinate(960, 240, 0);
    this.B = new Coordinate(0, 0, 380);
    this.C = new Coordinate(0, 0, -320);
    this.D = new Coordinate(0, 960, -220);
    this.AB = B.subtract3DCoordinate(A);
    this.AC = C.subtract3DCoordinate(A);
    this.AD = D.subtract3DCoordinate(A);

    System.out.println("========== Exercice 2.107 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);

    AB.unitVector();
    AC.unitVector();
    AD.unitVector();
    this.T = new Matrix(new double[][]{{AB.x(), AC.x(), 1, -(T_AD * AD.x())},
                                       {AB.y(), AC.y(), 0, -(T_AD * AD.y())},
                                       {AB.z(), AC.z(), 0, -(T_AD * AD.z())}});

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);
    System.out.println("AC = " + AC);
    System.out.println("AD = " + AD);

    System.out.println("========== Système d'équations ==========");
    T.solve("AB", "AC", "P");
  }
}

package Exercices.chapitre2;

import utils.*;

public class Exercice289 {

  private final double T = 385;
  private Coordinate B, D, E;
  private Vector3D DB, EB;

  public Exercice289() {


    this.B = new Coordinate(480, 0, 600);
    this.D = new Coordinate(0, 510, 280);
    this.E = new Coordinate(210, 400, 0);

    System.out.println("========== Exercice 2.89 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("B = " + B);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.DB = B.subtract3DCoordinate(D);
    this.EB = B.subtract3DCoordinate(E);
    System.out.println("========== Vecteurs ==========");
    System.out.println("DB = " + DB);
    System.out.println("EB = " + EB);

    DB.unitVector();
    EB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("DB = " + DB);
    System.out.println("EB = " + EB);

    DB.multiplyComponents(T);
    EB.multiplyComponents(T);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("T_DB = " + DB);
    System.out.println("T_BE = " + EB);
  }
}

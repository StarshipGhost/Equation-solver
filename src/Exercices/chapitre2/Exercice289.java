package Exercices.chapitre2;

import utils.*;

public class Exercice289 {

  private final double T = 385;
  private Coordinate B, D, E;
  private Vector3D DB, EB, unitVectorBD, unitVectorEB, forceVectorBD, forceVectorEB;

  public Exercice289() {

    this.B = new Coordinate(480, 0, 600);
    this.D = new Coordinate(0, 510, 280);
    this.E = new Coordinate(210, 400, 0);
    this.DB = B.subtract(D);
    this.EB = B.subtract(E);
    this.unitVectorBD = DB.unitVector();
    this.unitVectorEB = EB.unitVector();
    this.forceVectorBD = unitVectorBD.multiplyComponents(T);
    this.forceVectorEB = unitVectorEB.multiplyComponents(T);

    System.out.println("========== Coordonnées ==========");
    System.out.println("B = " + B);
    System.out.println("D = " + D);
    System.out.println("E = " + E);


    System.out.println("========== Vecteurs ==========");
    System.out.println("DB = " + DB);
    System.out.println("EB = " + EB);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("DB = " + unitVectorBD);
    System.out.println("EB = " + unitVectorEB);


    System.out.println("========== Vecteurs force ==========");
    System.out.println("T_DB = " + forceVectorBD);
    System.out.println("T_BE = " + forceVectorEB);
  }
}

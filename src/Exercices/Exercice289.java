package Exercices;

import utils.*;

public class Exercice289 {

  private Coordinate B;
  private Coordinate D;
  private Coordinate E;
  private Vector BD;
  private Vector BE;
  private Vector unitVectorBD;
  private Vector unitVectorBE;

  public Exercice289() {

    this.B = new Coordinate(480, 0, 600);
    this.D = new Coordinate(0, 510, 280);
    this.E = new Coordinate(210, 400, 0);
    this.BD = D.subtract(B);
    this.BE = E.subtract(B);
    this.unitVectorBD = BD.unitVector();
    this.unitVectorBE = BE.unitVector();

    System.out.println("========== Coordonnées ==========");
    System.out.println("B = "+ B);
    System.out.println("D = "+ D);
    System.out.println("E = "+ E);


    System.out.println("========== Vecteurs ==========");
    System.out.println("BD = "+ BD);
    System.out.println("BE = "+ BE);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BD = "+unitVectorBD);
    System.out.println("BE = "+unitVectorBE);
  }
}

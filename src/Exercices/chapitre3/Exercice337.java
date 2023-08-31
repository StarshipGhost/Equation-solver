package Exercices.chapitre3;

import utils.*;

public class Exercice337 {

  private Coordinate A, B, C, D;
  private Vector BA, CA, DA;

  public Exercice337() {

    this.A = new Coordinate(0, 2.4, 0);
    this.B = new Coordinate(-1.95, 0, 0.6);
    this.C = new Coordinate(0, 0, 1.8);
    this.D = new Coordinate(1.2, 0, 0.3);
    this.BA = A.subtract3DCoordinate(B);
    this.CA = A.subtract3DCoordinate(C);
    this.DA = A.subtract3DCoordinate(D);

    System.out.println("========== Exercice 3.37 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BA = " + BA);
    System.out.println("CA = " + CA);
    System.out.println("DA = " + DA);

    System.out.println("========== Produit scalaire BA et CA ==========");
    System.out.println("BA * CA = " + BA.scalarProduct(CA));

    System.out.println("========== Produit des normes BA et CA ==========");
    System.out.println("BA = " + BA.norm());
    System.out.println("CA = " + CA.norm());

    BA.unitVector();
    CA.unitVector();
    DA.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + BA);
    System.out.println("CA = " + CA);
    System.out.println("DA = " + DA);

    System.out.println("========== Angle entre les vecteurs BA et CA ==========");
    System.out.println(BA.angleBetween(CA));

    System.out.println("========== Angle entre les vecteurs CA et DA ==========");
    System.out.println(CA.angleBetween(DA));
  }
}

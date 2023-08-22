package Exercices.chapitre3;
import utils.*;

public class Exercice337 {

  private Coordinate A, B, C, D;
  private Vector3D BA, CA, DA, unitVectorBA, unitVectorCA, unitVectorDA;

  public Exercice337() {

    this.A = new Coordinate(0, 2.4, 0);
    this.B = new Coordinate(-1.95, 0, 0.6);
    this.C = new Coordinate(0, 0, 1.8);
    this.D = new Coordinate(1.2, 0, 0.3);
    this.BA = A.subtract(B);
    this.CA = A.subtract(C);
    this.DA = A.subtract(D);
    this.unitVectorBA = BA.unitVector();
    this.unitVectorCA = CA.unitVector();
    this.unitVectorDA = DA.unitVector();

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

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + unitVectorBA);
    System.out.println("CA = " + unitVectorCA);
    System.out.println("DA = " + unitVectorDA);

    System.out.println("========== Produit scalaire BA et CA ==========");
    System.out.println("BA * CA = " + unitVectorBA.scalarProduct(unitVectorCA));

    System.out.println("========== Produit des normes BA et CA ==========");
    System.out.println("BA = " + unitVectorBA.norm());
    System.out.println("CA = " + unitVectorCA.norm());

    System.out.println("========== Angle entre les vecteurs BA et CA ==========");
    System.out.println(unitVectorBA.angleBetween(unitVectorCA));

    System.out.println("========== Angle entre les vecteurs CA et DA ==========");
    System.out.println(unitVectorCA.angleBetween(unitVectorDA));
  }
}

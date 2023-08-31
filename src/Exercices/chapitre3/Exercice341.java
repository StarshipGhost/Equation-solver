package Exercices.chapitre3;

import utils.*;

public class Exercice341 {

  private Coordinate A, B, C, D;
  private Vector BA, BC, BD;
  private Vector unitVectorBA, unitVectorBC, unitVectorBD;
  private Vector forceVectorF_BA, forceVectorF_BD, forceVectorF_BC;
  private Matrix T, T1;

  public Exercice341() {

    this.A = new Coordinate(-3, 3, 0);
    this.B = new Coordinate(0, 0, 1.5);
    this.C = new Coordinate(1, 3, 0);
    this.D = new Coordinate(-0.08, 0.38, B.z() + 0.16);
    this.BA = A.subtract3DCoordinate(B);
    this.BC = C.subtract3DCoordinate(B);
    this.BD = D.subtract3DCoordinate(B);

//    this.forceVectorF_BC = unitVectorBC.multiplyComponents(T.solve().get("X2"));
//    this.forceVectorF_BD = unitVectorBD.multiplyComponents(T.solve().get("X1"));

    System.out.println("========== Exercice 3.41 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);

    System.out.println("========== Vecteurs ==========");
    System.out.println("BA = " + BA);
    System.out.println("BC = " + BC);
    System.out.println("BD = " + BD);

    System.out.println("========== Normes ==========");
    System.out.println("BA = " + BA.norm());
    System.out.println("BC = " + BC.norm());
    System.out.println("BD = " + BD.norm());

    BA.unitVector();
    BC.unitVector();
    BD.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + BA);
    System.out.println("BC = " + BC);
    System.out.println("BD = " + BD);

    System.out.println("========== Angle entre les vecteur AB et BD ==========");
    System.out.println(BA.angleBetween(BD));

    System.out.println("========== Angle entre les vecteur BC et BD ==========");
    System.out.println(BD.angleBetween(BC));

    BA.multiplyComponents(540);
    BC.multiplyComponents(490);

    System.out.println("========== Projection sur le piquet de AB à B ==========");
    System.out.println(BA.scalarProduct(BD));

    System.out.println("========== Projection sur le piquet de BC à B ==========");
    System.out.println(BC.scalarProduct(BD));

  }
}

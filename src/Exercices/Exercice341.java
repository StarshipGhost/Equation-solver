package Exercices;

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
    this.BA = A.subtract(B);
    this.BC = C.subtract(B);
    this.BD = D.subtract(B);
    this.unitVectorBA = BA.unitVector();
    this.unitVectorBC = BD.unitVector();
    this.unitVectorBD = BC.unitVector();
    this.forceVectorF_BA = unitVectorBA.multiplyComponents(540);
    this.T = new Matrix(new double[][]{{unitVectorBC.x(), unitVectorBD.x(), -forceVectorF_BA.x()},
                                       {unitVectorBC.y(), unitVectorBD.y(), -forceVectorF_BA.y()}});

    this.T1 = new Matrix(new double[][]{{unitVectorBC.y(), unitVectorBD.y(), -forceVectorF_BA.y()},
                                        {unitVectorBC.z(), unitVectorBD.z(), -forceVectorF_BA.z()}});

    this.forceVectorF_BC = new Vector(unitVectorBC.x() * T.solve().get("X2"), unitVectorBC.y() * T.solve().get("X2"), unitVectorBC.z() * T1.solve().get("X2"));
    this.forceVectorF_BD = new Vector(unitVectorBD.x() * T.solve().get("X1"), unitVectorBD.y() * T.solve().get("X1"), unitVectorBD.z() * T1.solve().get("X1"));

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

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BA = " + unitVectorBA);
    System.out.println("BC = " + unitVectorBC);
    System.out.println("BD = " + unitVectorBD);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("F_BA = " + forceVectorF_BA);
    System.out.println("F_BC = " + forceVectorF_BC);
    System.out.println("F_BD = " + forceVectorF_BD);
    System.out.println(forceVectorF_BA.scalarProduct(unitVectorBD));

    //T.solve();


    //   System.out.println("========== Système d'équations ==========");
    System.out.println(unitVectorBA.angleBetweenVectors(unitVectorBD));


  }
}

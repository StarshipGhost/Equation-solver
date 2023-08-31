package Exercices.chapitre3;

import utils.*;

public class Exercice351 {

  private Coordinate A, B;
  private Vector3D AB, unitVectorAB;

  public Exercice351() {

    System.out.println("========== Exercice 3.51 ==========");
    double z = 0;
    this.A = new Coordinate(2.2, 1.6, 0);
    this.B = new Coordinate(0, 4.8, 0);
    this.AB = B.subtract3DCoordinate(A);
    System.out.println("AB = " + AB);
    AB.unitVector();
    System.out.println("AB = " + AB);
  }
}

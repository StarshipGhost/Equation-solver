package Exercices.chapitre3;

import utils.*;

public class Exercice351 {

  private Coordinate A, B;
  private Vector3D AB, unitVectorAB;

  public Exercice351() {

    double z = 0;
    this.A = new Coordinate(2.2, 1.6, 0);
    this.B = new Coordinate(0, 4.8, 0);
    this.AB = B.subtract(A);
    this.unitVectorAB = AB.unitVector();
    System.out.println(unitVectorAB);
  }
}

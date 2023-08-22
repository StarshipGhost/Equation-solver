package Exercices.chapitre3;

import utils.*;

public class Exercice353 {

  private final double M_X = -77;
  private final double M_Z = -81;
  private Coordinate A, B;
  private Vector3D AB, unitVectorAB;
  private Matrix T;

  public Exercice353() {

    this.A = new Coordinate(-0.1, 0.275, -0.675);
    this.B = new Coordinate(0, 0.275, 0);
    this.AB = A.subtract(B);
    this.unitVectorAB = AB.unitVector();
    this.T = new Matrix(new double[][] {{-(unitVectorAB.z() * (M_Z + unitVectorAB.y())/ unitVectorAB.x()), unitVectorAB.y(), M_X},
                                        {-unitVectorAB.y(), unitVectorAB.x() * (M_X - (unitVectorAB.y()/ unitVectorAB.z())), M_Z}});

    System.out.println(unitVectorAB);
    System.out.println(unitVectorAB.z() * T.solve().get("X1") - unitVectorAB.x() * (T.solve().get("X2")));
  }
}

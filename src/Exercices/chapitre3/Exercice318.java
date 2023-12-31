package Exercices.chapitre3;

import utils.*;

public class Exercice318 {

  private Vector3D P1, Q1, P2, Q2, crossProductOfP1AndQ1, crossProductOfP2AndQ2;

  public Exercice318() {

    System.out.println("========== Exercice 3.18 ==========");
    this.P1 = new Vector3D(-7.0, 3.0, -3.0);
    this.Q1 = new Vector3D(2.0, 2.0, 5.0);
    this.P2 = new Vector3D(6.0, -5.0, -2.0);
    this.Q2 = new Vector3D(-2.0, 5.0, -1.0);

    this.crossProductOfP1AndQ1 = P1.crossProduct(Q1);
    this.crossProductOfP2AndQ2 = P2.crossProduct(Q2);

    System.out.println("========== Produit Vectoriel ==========");
    System.out.printf("P1 x Q1 = %.2f %n", crossProductOfP1AndQ1.norm());
    System.out.printf("P2 x Q2 = %.2f %n", crossProductOfP2AndQ2.norm());
  }
}

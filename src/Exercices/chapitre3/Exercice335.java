package Exercices.chapitre3;

import utils.*;

public class Exercice335 {

  private Vector3D P;
  private Vector Q;
  private Vector S;

  public Exercice335() {

    this.P = new Vector3D(4, 3, -2);
    this.Q = new Vector3D(-1, 4, -5);
    this.S = new Vector3D(1, 4, 3);

    System.out.println("========== Exercice 3.35 ==========");
    System.out.println("Produit scalaire de P et Q: " + P.scalarProduct(Q));
    System.out.println("Produit scalaire de P et S: " + P.scalarProduct(S));
    System.out.println("Produit scalaire de Q et S: " + Q.scalarProduct(S));
  }
}

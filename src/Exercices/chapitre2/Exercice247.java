package Exercices.chapitre2;

import utils.Vector2D;

import static utils.Geometry.cos;
import static utils.Geometry.sin;

public class Exercice247 {

  Vector2D AB, BC, CD;

  public Exercice247() {

    this.AB = new Vector2D(14.0, 8.25);
    this.BC = new Vector2D(24.0, 10.0);
    this.CD = new Vector2D(6.0, 1.10);

    double angleAB = AB.angle();
    double angleBC = BC.angle();
    double angleCD = CD.angle();

    System.out.println("AngleAB = " + angleAB);
    System.out.println("AngleBC = " + angleBC);
    System.out.println("AngleCD = " + angleCD);

    System.out.println(90 - 22.6);
    System.out.println(30.5 - 22.6);

    System.out.println("AB = " + AB.norm());
    System.out.println("CD = " + CD.norm());

    System.out.println("AB = " + AB);


  }
}

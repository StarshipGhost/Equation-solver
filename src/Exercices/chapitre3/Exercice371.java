package Exercices.chapitre3;

import static utils.Geometry.*;

import utils.*;

public class Exercice371 {
  private final double NORM_F = 40;
  private final int XY_Angle = 20;
  private final double r = 270 * Math.pow(10, -3);
  private final double r_AB = 390 * Math.pow(10, -3);
  private final double r_AC = (390 + 270) * Math.pow(10, -3);
  private Vector2D F1, F2;

  public Exercice371() {

    System.out.println("========== Exercice 3.71 ==========");
    this.F1 = new Vector2D(NORM_F, XY_Angle, false);
    this.F2 = new Vector2D(-NORM_F, XY_Angle, false);
    System.out.println("Composant F1 = " + F1);
    System.out.println("Composant F2  = " + F2);
    System.out.println("------------------------------------");
    double M1 = F1.momentOfAForce(r, F1.norm(), 55 - XY_Angle);
    System.out.printf("Moment de force de F1 = %.2f %n", M1);
    System.out.println("------------------------------------");
    System.out.printf(
        "Decomposition des vecteur x et y = %.2f %n",
        F1.momentOfAForce(r, F1.x(), 180 + 55) + F1.momentOfAForce(r, F1.y(), 35));
    System.out.println("------------------------------------");
    double d = lawOfSines(r, 90, 55 - XY_Angle, true);
    System.out.printf("Distance perpendiculaire = %.2f %n", NORM_F * d);
    System.out.println("------------------------------------");
    double M2 =
        F1.momentOfAForce(r_AC, F1.norm(), 55 - XY_Angle)
            + F2.momentOfAForce(r_AB, -F2.norm(), 55 - XY_Angle);
    System.out.printf("Sum of M1 and M2 from point A = %.2f %n", M2);
  }
}

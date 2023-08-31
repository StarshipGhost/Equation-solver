package Exercices.chapitre2;

import static utils.Geometry.*;

import utils.*;
import utils.Vector3D;import java.util.Arrays;

public class Exercice275 {
  private final double F_x = 110.3;
  private final double XZ_PLAN_ANGLE = 50;
  private final double YZ_PLAN_ANGLE = 30;
  private Vector3D T_AD;

  public Exercice275() {
    System.out.println("========== Exercice 2.75 ==========");
    double F_h = lawOfSines(F_x, XZ_PLAN_ANGLE, 90.0, true);
    double F = lawOfSines(F_h, YZ_PLAN_ANGLE, 90.0, true);
    double F_y = lawOfSines(F_h, YZ_PLAN_ANGLE, 180 - 90 - 30, true);
    double F_z = lawOfSines(F_x, XZ_PLAN_ANGLE, 180 - 90 - 50, true);
    this.T_AD = new Vector3D(F_x, F_y, -F_z);

    System.out.println("========== Grandeur et orientation de T_AD ==========");
    System.out.printf("%.0f N %n", T_AD.norm());
    Utils.printFormattedDoubleArray(T_AD.angles(), 1);
  }
}

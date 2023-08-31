package Exercices.chapitre2;

import static utils.Geometry.*;

import java.util.Arrays;
import utils.*;

public class Exercice2133 {

  private final double T = 3900;
  private final double y = 11.2;
  private final double NORM_AB = 13;
  private final double ANGLE_BOX = 20;
  private Coordinate A;
  private Vector3D AB, F_AB;

  public Exercice2133() {

    double angle_OBA = lawOfSines(NORM_AB, 90, y, false);
    double angle_OAB = 180 - 90 - angle_OBA;
    double OB = lawOfSines(NORM_AB, 90, angle_OAB, true);
    double OB_z = lawOfSines(OB, 90, ANGLE_BOX, true);
    double OB_x = lawOfSines(OB, 90, 180 - 90 - ANGLE_BOX, true);
    double AB_y = y;

    System.out.println("========== Exercice 2.133 ==========");
    this.A = new Coordinate(0, y, 0);

    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);

    this.AB = new Vector3D(-OB_x, AB_y, OB_z);

    System.out.println("========== Vecteurs ==========");
    System.out.println("AB = " + AB);

    AB.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("AB = " + AB);

    AB.multiplyComponents(T);
    this.F_AB = new Vector3D(T, angle_OAB, ANGLE_BOX, true, false);

    System.out.println("========== Vecteurs force ==========");
    System.out.println("T_AB = " + AB);
    System.out.printf("T_AB = (%.1f, %.1f, %.1f) %n", -F_AB.x(), F_AB.y(), F_AB.z());
    System.out.println("T_AB = " + F_AB);

    System.out.println("========== Direction AB ==========");
    Utils.printFormattedDoubleArray(F_AB.angles(), 1);
  }
}

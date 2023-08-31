package Exercices.chapitre2;

import java.util.Arrays;
import utils.*;

public class Exercice271 {

  private Vector3D F1, F2;
  private final double NORM_F1 = 600;
  private final double NORM_F2 = 450;
  private final int YZ_ANGLE_F1 = 25;
  private final int XZ_ANGLE_F1 = 30;
  private final int YZ_ANGLE_F2 = 35;
  private final int XZ_ANGLE_F2 = 40;

  public Exercice271() {

    System.out.println("========== Exercice 2.71 ==========");
    this.F1 = new Vector3D(NORM_F1, YZ_ANGLE_F1, XZ_ANGLE_F1, true, false);
    this.F1 = new Vector3D(F1.x(), F1.y(), F1.z());
    System.out.println("F1 = " + F1);
    Utils.printFormattedDoubleArray(F1.angles(), 1);
    System.out.println("------------------------------");
    this.F2 = new Vector3D(NORM_F2, YZ_ANGLE_F2, XZ_ANGLE_F2, false, true);
    this.F2 = new Vector3D(-F2.x(), F2.y(), F2.z());
    System.out.println("F2 = " + F2);
    Utils.printFormattedDoubleArray(F2.angles(), 1);
  }
}

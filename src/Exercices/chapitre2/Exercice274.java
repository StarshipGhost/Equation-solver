package Exercices.chapitre2;

import java.util.Arrays;
import utils.*;

public class Exercice274 {

  private final double NORM_AD = 85;
  private final double ANGLE_BAD = 36;
  private final double ANGLE_BDX = 48;
  private Vector3D T_AD;

  public Exercice274() {
    System.out.println("========== Exercice 2.74 ==========");
    this.T_AD = new Vector3D(NORM_AD, ANGLE_BAD, ANGLE_BDX, true, true);
    this.T_AD = new Vector3D(T_AD.x(), -T_AD.y(), T_AD.z());

    System.out.println("========== Composantes et orientation de T_AD ==========");
    System.out.println("T_AD = " + T_AD);
    Utils.printFormattedDoubleArray(T_AD.angles(), 1);
  }
}

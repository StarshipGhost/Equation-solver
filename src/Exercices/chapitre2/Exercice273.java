package Exercices.chapitre2;

import utils.*;

public class Exercice273 {
  private final double NORM_T_AC = 120;
  private final int ANGLE_BCA = 60;
  private final int ANGLE_CBX = 20;
  private Vector3D T_AC;

  public Exercice273() {
    System.out.println("========== Exercice 2.73 ==========");
    this.T_AC = new Vector3D(NORM_T_AC, ANGLE_BCA, ANGLE_CBX, false, false);
    this.T_AC = new Vector3D(T_AC.x(), -T_AC.y(), -T_AC.z());
    System.out.println("========== Composants et orientation de AC ==========");
    System.out.println(T_AC);
    Utils.printFormattedDoubleArray(T_AC.angles(), 1);
  }
}

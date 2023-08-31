package Exercices.chapitre2;

import static utils.Geometry.*;

import java.util.Arrays;
import utils.*;

public class Exercice296 {

  private final double NORM_T_CA = 1500;
  private final double ANGLE_ACB = 60;
  private final double ANGLE_CBX = 20;
  private final double ANGLE_DBZ = 48;
  private final double ANGLE_DAB = 36;
  private Vector3D T_CA, T_DA, R;

  public Exercice296() {
    System.out.println("========== Exercice 2.96 ==========");
    this.T_CA = new Vector3D(NORM_T_CA, ANGLE_ACB, ANGLE_CBX, false, false);
    this.T_CA = new Vector3D(T_CA.x(), -T_CA.y(), -T_CA.z());
    System.out.println("T_CA = " + T_CA);

    double T_DA_z = -T_CA.z();
    double T_DA_h = lawOfSines(Math.abs(T_DA_z), 180 - 90 - ANGLE_DBZ, 90, true);
    double T_DA_x = lawOfSines(Math.abs(T_DA_z), 180 - 90 - ANGLE_DBZ, ANGLE_DBZ, true);
    double T_DA_y = lawOfSines(T_DA_h, ANGLE_DAB, 180 - 90 - ANGLE_DAB, true);
    this.T_DA = new Vector3D(T_DA_x, -T_DA_y, T_DA_z);
    System.out.println("T_DA = " + T_DA);
    System.out.printf("Norme T_DA = %.2f N %n", T_DA.norm());

    this.R = new Vector3D(T_CA.x() + T_DA.x(), T_CA.y() + T_DA.y(), T_CA.z() + T_DA.z());
    System.out.println("R = " + R);
    System.out.printf("Norme de R = %.2f N %n", R.norm());
    System.out.println("========== Direction de R ==========");
    Utils.printFormattedDoubleArray(R.angles(), 1);
  }
}

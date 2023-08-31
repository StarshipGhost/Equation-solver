package Exercices.chapitre4;

import utils.*;
import static utils.Geometry.sin;

public class Exercice436 {

  private Coordinate A, B, C, D, E, F;
  private Vector2D r_AE, r_AF;
  private Vector2D BD, F1, F2, reaction_A, reaction_C;
  private Vector3D M_AE, M_AF, M_CE, M_CF, M_AB;

  public Exercice436() {

    this.A = new Coordinate(0, 0).convert(-3);
    this.B = new Coordinate(150, 75).convert(-3);
    this.C = new Coordinate(500, 250).convert(-3);
    this.D = new Coordinate(500, 0).convert(-3);
    this.E = new Coordinate(100, 50).convert(-3);
    this.F = new Coordinate(400, 200).convert(-3);

    System.out.println("========== Exercice 4.36 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("D = " + D);
    System.out.println("E = " + E);

    this.F1 = new Vector2D(0, -400);
    this.F2 = new Vector2D(0, -400);
    this.BD = D.subtract2DCoordinate(B);
    this.r_AE = E.subtract2DCoordinate(A);
    this.r_AF = F.subtract2DCoordinate(A);


    System.out.println("========== Vecteurs position ==========");
    System.out.println("BD = " + BD);
    System.out.println("r_AE = " + r_AE);
    System.out.println("r_AF = " + r_AF);

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BD = " + BD);

    this.M_AE = r_AE.crossProduct(F1);
    this.M_AF = r_AF.crossProduct(F2);
//    double m_ae = r_AE.x() * F1.y();
//    double m_af = r_AF.x() * F2.y();
    System.out.println("========== Moments des force au point A ==========");
    System.out.println("M_AE = " + M_AE);
    System.out.println("M_AF = " + M_AF);

    System.out.println("========== Moments des force au point C ==========");
    double M_A = M_AE.z() + M_AF.z() + (1432 * BD.y());
    double Ry = -400 + -400 + (1432 * BD.y()) + 1100;
    double Rx = (1432 * BD.x()) -1400;
    System.out.println(Ry);
  }
}

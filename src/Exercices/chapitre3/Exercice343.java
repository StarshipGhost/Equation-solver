package Exercices.chapitre3;
import utils.*;

public class Exercice343 {

  private final double NORM_OP = 0.12;
  private Coordinate A, B, C, P, O;
  private Vector3D BC, OA, OP, PC;
  private Vector3D unitVectorBC, unitVectorOA, unitVectorOP, unitVectorPC;

  public Exercice343() {

    this.A = new Coordinate(0.24, 0.24, -0.12);
    this.B = new Coordinate(0.18, 0, 0.24);
    this.C = new Coordinate(0.18, 0.3, 0.24);
    this.O = new Coordinate(0, 0, 0);

    this.BC = C.subtract3DCoordinate(B);
    this.OA = A.subtract3DCoordinate(O);

    this.OP = new Vector3D((OA.x() * NORM_OP) / OA.norm(), (OA.y() * NORM_OP) / OA.norm(), (OA.z() * NORM_OP) / OA.norm());
    this.P = new Coordinate(OP.x(), OP.y(), OP.z());
    this.PC = C.subtract3DCoordinate(P);

    System.out.println("========== Exercice 3.43 ==========");
    System.out.println("========== Coordonnées ==========");
    System.out.println("A = " + A);
    System.out.println("B = " + B);
    System.out.println("C = " + C);
    System.out.println("P = " + P);
    System.out.println("0 = " + O);


    System.out.println("========== Vecteurs ==========");
    System.out.println("BC = " + BC);
    System.out.println("OA = " + OA);
    System.out.println("OP = " + OP);
    System.out.println("CP = " + PC);

    System.out.println("========== Normes ==========");
    System.out.println("BC = " + BC.norm());
    System.out.println("OA = " + OA.norm());
    System.out.println("OP = " + OP.norm());
    System.out.println("CP = " + PC.norm());

    BC.unitVector();
    OA.unitVector();
    OP.unitVector();
    PC.unitVector();

    System.out.println("========== Vecteurs unitaire ==========");
    System.out.println("BC = " + BC);
    System.out.println("OA = " + OA);
    System.out.println("OP = " + OP);
    System.out.println("CP = " + PC);

    System.out.println("========== Angle entre les PC et OP ==========");
    System.out.println(PC.angleBetween(OP));

    PC.multiplyComponents(30);

    System.out.println("========== Projection du vecteur PC sur l'axe OA ==========");
    System.out.println(OA.scalarProduct(PC) + " N");
  }
}

import utils.Matrix;

import java.util.Random;

public class Test {
  private Random r;

  public Test() {
    this.r = new Random();
  }

  public Matrix t_GaussianElemination(int lines, int column) {
    double[][] a = new double[lines][column];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = r.nextInt(9);
      }
    }
    return new Matrix(a).gaussianElimination();
  }

  public Matrix t_CreateMatrix(int lines, int column) {
    double[][] a = new double[lines][column];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = r.nextInt(9);
      }
    }
    return new Matrix(a);
  }
}

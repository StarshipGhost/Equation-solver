package utils;

import java.util.*;

public class Matrix {

  private double[][] matrix;

  public Matrix(double[][] matrix) {
    int line = matrix.length;
    int column = matrix[0].length;
    this.matrix = new double[line][column];
    for (int i = 0; i < line; i++) {
      for (int j = 0; j < column; j++) {
        this.matrix[i][j] = matrix[i][j];
      }
    }
  }

  public int lines() {
    return matrix.length;
  }

  public int columns() {
    return matrix[0].length;
  }

  public double get(int i, int j) {
    return matrix[i][j];
  }

  public void set(int i, int j, double n) {
    matrix[i][j] = n;
  }

  public void permuteLines(int l1, int l2) {
    for (int j = 0; j < columns(); j++) {
      double n1 = matrix[l1][j];
      double n2 = matrix[l2][j];
      set(l1, j, n2);
      set(l2, j, n1);
    }
  }

  public void permuteColumns(int c1, int c2) {
    for (int i = 0; i < lines(); i++) {
      double n1 = matrix[i][c1];
      double n2 = matrix[i][c2];
      set(i, c1, n2);
      set(i, c2, n1);
    }
  }

  public Matrix copy() {
    double[][] a = new double[lines()][columns()];
    for (int i = 0; i < lines(); i++) {
      for (int j = 0; j < columns(); j++) {
        a[i][j] = this.matrix[i][j];
      }
    }
    Matrix matrixCopy = new Matrix(a);
    return matrixCopy;
  }

  public Matrix identite(int size) {
    double[][] a = new double[size][size];
    for (int i = 0; i < size; i++) {
      a[i][i] = 1;
    }
    return new Matrix(a);
  }

  public double determinant() {

//    if (!isSquare()) {
//      throw new IllegalArgumentException();
//    }
    Matrix T = this.gaussianElimination();
    double determinant = 1;

    for (int i = 0; i < this.matrix.length; i++) {
      determinant *= T.get(i, i);
    }
    return determinant;
  }

  public Matrix gaussianElimination() {

    int m = lines();
    int n = columns();

    Matrix L = identite(lines());
    Matrix U = copy();

    U.printMatrix();
    int bound;
    if (lines() > columns()) {
      bound = n;
    } else {
      bound = m;
    }
    for (int index_pivot = 0; index_pivot < bound; index_pivot++) {
      if (U.get(index_pivot, index_pivot) == 0) {
        int r;
        for (r = index_pivot + 1; r < U.lines() && U.get(index_pivot, index_pivot) == 0; r++) {
          U.permuteLines(index_pivot, r);
        }
      }
      for (int i = index_pivot + 1; i < m; i++) {
        double coefficient = U.get(i, index_pivot) / U.get(index_pivot, index_pivot);
        L.set(i, index_pivot, coefficient);
        for (int j = 0; j < n; j++) {
          U.set(i, j, (U.get(i, j) - (coefficient * U.get(index_pivot, j))));
          if (Math.abs(U.get(i, j)) < 2 * Math.ulp(1.0)) {
            U.set(i, j, 0);
          }
        }
      }
    }
    return U;
  }

  public Map<String, Double> solve() {
    if (!isSolvable()) {
      throw new IllegalArgumentException();
    }
    Matrix equationSystem = gaussianElimination();
    int n = columns();
    double[] equation = new double[n - 1];
    Map<String, Double> equations = new LinkedHashMap<>();

    double subtitutionResult = 0;
    for (int i = n - 2; i >= 0; i--) {
      equation[i] = equationSystem.get(i, n - 1);
      for (int j = n - 2; j > i; j--) {
        subtitutionResult += equation[j] * equationSystem.get(i, j);
      }
      equation[i] = (equation[i] - subtitutionResult) / equationSystem.get(i, i);
      equations.put("X" + (n - i - 1), equation[i]);
      subtitutionResult = 0;
    }
    System.out.println("------------------------------------------------------------------");
    System.out.println(equations);

    return equations;
  }

  public boolean isSolvable() {
    return columns() - lines() == 1;
  }

  public boolean isSquare() {
    return lines() == columns();
  }

  public void printMatrix() {
    for (double[] e : this.matrix) {
      System.out.println(Arrays.toString(e));
    }
  }
}

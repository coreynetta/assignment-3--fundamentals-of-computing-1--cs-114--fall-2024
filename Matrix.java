import java.util.Scanner;

public class Matrix {
  private int [][] assignmentMatrix;
  private int dimension;
  public Matrix(int dimension) {
    this.dimension = dimension;
    assignmentMatrix = new int[dimension][dimension];
    System.out.println("Dimensions of Matrix" + dimension + "*" + dimension + ":");
  }
}

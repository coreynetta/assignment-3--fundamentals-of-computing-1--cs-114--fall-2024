import java.util.Scanner;

public class Matrix {
    }
  }

  public void printMatrix() {
    for (int row = 0; row < dimension; row++) {
      for (int column = 0; column < dimension; column++) {
        if (row + column == dimension - 1) {
          System.out.print(assignmentMatrix[row][column] + "\t");
        }
      }
      System.out.println();
    }
  }

  public void printDefaultValues() (
    for (int row =0; row < dimension; row++) {
      for (int column = 0; column < dimension; column++) {
        if (row + column == dimension - 1) {
          System.out.print("*" + 0 + "*\t");
        } else {
          System.out.print(0 + "\t");
        }
      }
      System.out.println();
    }
  )

  public void flipMatrix() (
    int input = dimension * dimension;
    for (int row = 0; row < dimension; row++) {
      for (int column = 0; column < dimension; column++) {
        assignmentMatrix[row][column] = input--;
      }
    }
  )
}

import java.util.Scanner;

public class Matrix {
    }
  }

  public void printMatrix() {
    for (int row = 0; row < dimension; row++) {
      for (int column = 0; column < dimension; column++) {
        if (row + column == dimension - 1) {
          System.out.print(assignmentMatrix[row][column] + "\t");
                // Check if the current cell is part of the diagonal marked in printMatrix
                    continue; // Skip the diagonal cells
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
    }
  )
}

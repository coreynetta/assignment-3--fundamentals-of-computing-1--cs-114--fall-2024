import java.util.Scanner;

public class Matrix {
    private int[][] assignmentMatrix;
    private int dimension;

    public Matrix(int dimension) {
        this.dimension = dimension;
        assignmentMatrix = new int[dimension][dimension];
        System.out.println("Dimensions of Matrix " + dimension + "*" + dimension + ":");
    }

    public void populateMatrix() {
        int input = 1;
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                assignmentMatrix[row][column] = input++;
            }
        }
    }

    public void printMatrix() {
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                if (row + column == dimension - 1) {
                    System.out.print("*\033[34m" + assignmentMatrix[row][column] + "\033[0m*\t");
                } else {
                    System.out.print(assignmentMatrix[row][column] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void printDefaultValues() {
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                if (row + column == dimension - 1) {
                    System.out.print("*\033[34m0\033[0m*\t");
                } else {
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }

    public void flipMatrix() {
      int[][] tempMatrix = new int[dimension][dimension];
      int input = dimension * dimension;
      for (int row = 0; row < dimension; row++) {
          for (int column = 0; column < dimension; column++) {
              if (row + column == dimension - 1) {
                  tempMatrix[row][column] = assignmentMatrix[row][column];
              }
          }
      }

      for (int row = 0; row < dimension; row++) {
          for (int column = 0; column < dimension; column++) {
              if (row + column != dimension - 1) {
                  while (true) {
                      boolean isDiagonal = false;
                      for (int i = 0; i < dimension; i++) {
                          if (tempMatrix[i][dimension - 1 - i] == input) {
                              isDiagonal = true;
                              break;
                          }
                      }
                      if (!isDiagonal) {
                          tempMatrix[row][column] = input--;
                          break;
                      }
                      input--;
                  }
              }
          }
      }
      assignmentMatrix = tempMatrix;
  }


    public void printFlippedMatrix() {
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                if (row + column == dimension - 1) {
                    System.out.print("*\033[34m" + assignmentMatrix[row][column] + "\033[0m*\t");
                } else {
                    System.out.print(assignmentMatrix[row][column] + "\t");
                }
            }
            System.out.println();
        }
    }
  }

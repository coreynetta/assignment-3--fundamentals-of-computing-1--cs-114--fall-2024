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
        int input = dimension * dimension;
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                if (row + column == dimension - 1) {
                    continue;
                }
                assignmentMatrix[row][column] = input--;
            }
        }
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension: ");
        int dimension = scanner.nextInt();

        Matrix matrix = new Matrix(dimension);

        System.out.println("\nPopulated Matrix:");
        matrix.populateMatrix();
        matrix.printMatrix();

        System.out.println("\nDefault Values Matrix:");
        matrix.printDefaultValues();

        System.out.println("\nFlipped Matrix:");
        matrix.flipMatrix();
        matrix.printFlippedMatrix();
    }
}

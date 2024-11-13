import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Please enter a positive number:");
    int input = scanner.nextInt();

    Matrix assignmentMatrix = new Matrix(input);

    System.out.println("Default Matrix:");
    assignmentMatrix.printDefaultValues();
    assignmentMatrix.populateMatrix();
    System.out.println("Normal Matrix:");
    assignmentMatrix.printMatrix();
    assignmentMatrix.flipMatrix();
    System.out.println("Flipped Matrix:");
    assignmentMatrix.printMatrix();

  }
}

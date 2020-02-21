package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumOfGrades = 0;
        int numberOfGrades = 0;

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String problemName = command;
            double problemGrades = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                problemGrades += grade;
                sumOfGrades += grade;
                numberOfGrades++;
            }
            double averageProblemGrade = problemGrades / n;
            System.out.printf("%s - %.02f.%n", problemName, averageProblemGrade);


            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.02f.", sumOfGrades / numberOfGrades);
    }
}

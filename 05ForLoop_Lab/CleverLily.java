package ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double saveMoney = 0;
        double tempMoney = 0;
        int toyCount = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                tempMoney += 10;
                saveMoney += tempMoney;
                saveMoney--;
            } else {
                toyCount++;

            }
        }
        saveMoney += toyCount * toyPrice;
        if (saveMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", saveMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - saveMoney);
        }
    }
}

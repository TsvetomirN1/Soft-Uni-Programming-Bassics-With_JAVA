package ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i<=n*2; i++){
            int num = Integer.parseInt(scanner.nextLine());
            if (i<=n){
                leftSum+=num;
            }else {
                rightSum+=num;

            }
        }
        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d", leftSum);

        }else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));

        }

    }
}

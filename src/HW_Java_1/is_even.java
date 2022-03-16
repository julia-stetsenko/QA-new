package HW_Java_1;

import java.util.Scanner;

public class is_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        if (n%2 == 0) {
            System.out.println("Your number is even \n");
            in.close();
        } else {
            System.out.println("Your number is odd \n");
            in.close();
        }

    }
}

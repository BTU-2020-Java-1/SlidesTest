package ge.edu.btu.slide_2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 99 && x < 1000) {
            System.out.println("მოცემული რიცხვი სამნიშნაა");
        } else {
            System.out.println("მოცემული რიცხვი არ არის სამნიშნა");
        }
    }
}



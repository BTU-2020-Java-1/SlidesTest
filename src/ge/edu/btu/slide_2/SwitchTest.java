package ge.edu.btu.slide_2;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 0:
                System.out.println("ზამთარი");
                break;
            case 1:
                System.out.println("გაზაფხული");
                break;
            case 2:
                System.out.println("ზაფხული");
                break;
            case 3:
                System.out.println("შემოდგომა");
                break;
            default:
                System.out.println("არასწორი ინფორმაცია!");
        }
    }
}



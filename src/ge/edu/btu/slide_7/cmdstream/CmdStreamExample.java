package ge.edu.btu.slide_7.cmdstream;

import java.util.Scanner;

public class CmdStreamExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("სახელი:");
        String firstName = scanner.nextLine();
        System.out.println("გვარი:");
        String lastName = scanner.nextLine();
        System.out.printf("გამარჯობს %s %s", firstName, lastName);
    }
}


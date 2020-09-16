package ge.edu.btu.slide_2;

public class NestedLoopTest1 {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 5; i++) {
            j = 0;
            while (j < 3) {
                System.out.print("(" + i + "," + j + ") ");
                j++;
            }
            System.out.println();
        }
    }
}



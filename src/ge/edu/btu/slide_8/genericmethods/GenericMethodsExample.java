package ge.edu.btu.slide_8.genericmethods;

public class GenericMethodsExample {

    public static void main(String[] args) {
        Integer[] integerArray = new Integer[]{15, 4264, 94, 190};
        printArray(integerArray);
        String[] stringArray = new String[]{"abc", "def", "test"};
        printArray(stringArray);
    }

    private static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + ",");
        }
        System.out.println();
    }
}


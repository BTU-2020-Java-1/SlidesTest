package ge.edu.btu.slide_9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 18, 3, 27, 16);
        System.out.println("მინ: " + Collections.min(list));
        System.out.println("მაქს: " + Collections.max(list));
        Collections.sort(list);
        System.out.println("დალაგებული: " + list);
        Collections.reverse(list);
        System.out.println("შემობრუნებული: " + list);
    }
}


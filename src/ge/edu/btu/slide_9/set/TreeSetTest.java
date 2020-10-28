package ge.edu.btu.slide_9.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(17);
        set.add(12);
        set.add(19);

        System.out.println(set);
    }
}


package ge.edu.btu.slide_9.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Name 1");
        Student student2 = new Student(2, "Name 2");
        Student student3 = new Student(1, "Name 3");

        Set<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);

        System.out.println(set.size());
    }
}


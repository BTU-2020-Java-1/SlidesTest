package ge.edu.btu.slide_9.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(4, "Name 1"),
                new User(2, "Name 2"),
                new User(1, "Name 3"),
                new User(3, "Name 4")
        );

        Collections.sort(users);
        for (User user : users) {
            System.out.println(user);
        }
    }
}


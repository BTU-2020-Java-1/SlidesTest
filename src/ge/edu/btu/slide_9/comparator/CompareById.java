package ge.edu.btu.slide_9.comparator;

import java.util.Comparator;

public class CompareById implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}


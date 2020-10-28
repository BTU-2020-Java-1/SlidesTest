package ge.edu.btu.slide_9.comparable;

public class User implements Comparable<User> {

    private long id;
    private String name;
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public int compareTo(User u) {
        return Long.compare(this.id, u.id);
    }
}


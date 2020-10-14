package ge.edu.btu.slide_7.serialization;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 101L;

    private String username;
    private String password;

    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


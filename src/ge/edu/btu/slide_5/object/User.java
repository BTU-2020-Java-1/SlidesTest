package ge.edu.btu.slide_5.object;

import java.util.Objects;

public class User {

    private String username;
    private boolean active;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return active == user.active &&
                Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, active);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", active=" + active +
                '}';
    }
}

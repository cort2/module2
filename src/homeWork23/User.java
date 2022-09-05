package homeWork23;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User that = (User) o;
        return age == that.age && Objects.equals(getName(), that.getName());
    }
//    public boolean equals(Object object) {
//        if (object == this) {
//            return true;
//        }
//        if (object == null || object.getClass() != this.getClass()) {
//            return false;
//        }
//        User user = (User) object;
//        return age == user.age && (name == user.name || (name != null && name.equals(user.getName())));
//    }
    public int hashCode() {
        return Objects.hash(age, getName());
    }
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }
}

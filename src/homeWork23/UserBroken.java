package homeWork23;

import java.util.Objects;

public class UserBroken {
    private int age;
    private String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBroken)) return false;
        UserBroken that = (UserBroken) o;
        return age == that.age && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, getName());
    }
}

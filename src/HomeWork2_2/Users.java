package HomeWork2_2;

import java.util.List;

public class Users {
    private int id;
    private List<Integer> integers;

    public Users(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public Users setWithIntegers(List<Integer> integers) {
        this.integers = integers;
        return this;

    }
}

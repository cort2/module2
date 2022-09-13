package HomeWork24;

import java.util.Locale;

public class UserMeta {
    String name;
    Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @TimeToScale
    public static String GetSuperName(String prefix){
        return prefix.toUpperCase();
    }

    @Override
    public String toString() {
        return "UserMeta{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

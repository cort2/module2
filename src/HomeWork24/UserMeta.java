package HomeWork24;

import java.util.Locale;
@GetMetaData
public class UserMeta {
    private String name;
    private Integer count;

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
    @GetMetaData
    public void  GetSuperName(String prefix){
        name = prefix + " " + name;
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "UserMeta{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

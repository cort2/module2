package HomeWork2_1;

import java.util.Arrays;

public class MyList {
    private Integer[] integers = new Integer[3];
    int size;
    public MyList(){
    }

    @Override
    public String toString() {
        return "MyList{" + "integers" + Arrays.toString(integers) + '}';
    }

    public boolean add(Integer number){
        for (int i = 0; i < integers.length ; i++) {
            if(integers[i] == null){
                 integers[i] = number;
                 break;
            }
        }
        return true;
    }
}

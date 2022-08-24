package HomeWork2_1;

import java.util.Arrays;

public class MyList<T> {
    private T[] objects  =  (T[]) new Object[3];
    private int size;
    public MyList() {
    }
    @Override
    public String toString() {
        return "MyList {" + "objects = " + Arrays.toString(objects) + '}';
    }
    public boolean add(T number) {
        if (size == objects.length) {
            T[] newArray = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < objects.length; i++) {
                newArray[i] = objects[i];
            }
            this.objects = newArray;
        }
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    objects[i] = number;
                    break;
                }
            }
            size++;
            return true;
        }
    }
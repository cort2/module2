package HomeWork24;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class HomeWork24 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем

        UserMeta man = new UserMeta("Vasja", 22);

        getField(man);
        getFieldValue(man);
        getCurrentTime(man);
    }

    static void getField(UserMeta userMeta) {
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            for (Field declaredField : userMeta.getClass().getDeclaredFields()) {
                declaredField.setAccessible(true);
                System.out.println(declaredField.getName());
            }
        }
    }

    static void getFieldValue(UserMeta userMeta) throws IllegalAccessException {
        for (Field declaredField : userMeta.getClass().getDeclaredFields()) {
            if(userMeta.getClass().isAnnotationPresent(GetMetaData.class)){
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(userMeta));
            }

        }
    }

    static void getCurrentTime(UserMeta userMeta) throws InvocationTargetException, IllegalAccessException {

        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(GetMetaData.class)){
               long start = System.currentTimeMillis();
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(userMeta,"Mr");
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
    }
}

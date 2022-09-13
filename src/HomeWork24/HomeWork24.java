package HomeWork24;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork24 {
    public static void main(String[] args)  {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем
        UserMeta man = new UserMeta("Petr",2);
        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(TimeToScale.class)){
               long start = System.currentTimeMillis();
                try {
                    declaredMethod.invoke(man);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }

    }
}

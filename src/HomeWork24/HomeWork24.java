package HomeWork24;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class HomeWork24 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем
//        userMeta.getClass().isAnnotationPresent(GetMetaData.class)
        UserMeta man = new UserMeta("Vasja",22);
        for (Field field : man.getClass().getFields()) {
            System.out.println(field.getName());
            
        }


//        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
//            if (declaredMethod.isAnnotationPresent(GetMetaData.class)){
//               long start = System.currentTimeMillis();
//                    declaredMethod.setAccessible(true);
//                    declaredMethod.invoke(man);
//                long end = System.currentTimeMillis();
//                System.out.println(end - start);
//            }
//        }
    }
}

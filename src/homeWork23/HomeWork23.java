package homeWork23;

import javax.lang.model.element.Name;
import java.util.HashSet;

public class HomeWork23 {
    public static void main(String[] args) {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера
        HashSet<User> users = new HashSet<>();
        users.add(new User(31,"Petr"));
        users.add(new User(32,"Vasja"));
        users.add(new User(33,"Ivan"));
        users.add(new User(34,"Ivan"));
        System.out.println(users);

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер

        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
    }
}

package homeWork23;

import java.util.HashMap;
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
        System.out.println();

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер

        HashSet<UserBroken> userBrokens = new HashSet<>();

        userBrokens.add(new UserBroken(33,"Petr"));
        userBrokens.add(new UserBroken(33,"Stepan"));
        userBrokens.add(new UserBroken(33,"Sergey"));
        System.out.println(userBrokens);
        System.out.println();

        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap<CarBroken, Integer> hashMapCars = new HashMap<>();
        CarBroken car = new CarBroken();
        CarBroken car2 = new CarBroken();
        CarBroken car3 = new CarBroken();
        CarBroken car4 = new CarBroken();
        CarBroken car5 = new CarBroken();
        CarBroken car6 = new CarBroken();
        CarBroken car7 = new CarBroken();
        CarBroken car8 = new CarBroken();
        hashMapCars.put(car, 1);
        hashMapCars.put(car2, 2);
        hashMapCars.put(car3, 3);
        hashMapCars.put(car4, 4);
        hashMapCars.put(car5, 5);
        hashMapCars.put(car6, 6);
        hashMapCars.put(car7, 7);
        hashMapCars.put(car8, 8);
        System.out.println(hashMapCars);




    }
}

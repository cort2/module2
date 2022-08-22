package HomeWork2_1;

import HomeWork2_1.Animals.*;

public class HomeWork2_1 {
    public static void main(String[] args) {
        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.

        Lion lion = new Lion();
        Bat bat = new Bat();
        Fish fish = new Fish();
        Zoo < Lion, Bat, Fish > zoo1 = new Zoo<Lion, Bat, Fish>(lion, bat, fish);
        zoo1.feedBitable();
        zoo1.feedFlyable();
        zoo1.feedSwimable();

        System.out.println();

        Wolf wolf = new Wolf();
        Bird bird = new Bird();
        Turtle turtle = new Turtle();
        Zoo <Wolf, Bird, Turtle> zoo2 = new Zoo<Wolf, Bird, Turtle>(wolf, bird, turtle);
        zoo2.feedBitable();
        zoo2.feedFlyable();
        zoo2.feedSwimable();

        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.
    }
}

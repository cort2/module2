package HomeWork2_1;

public class Zoo<T extends Bitable, K extends Flyable, R extends Swimable> {
    private T animal;
    private K animal2;
    private R animal3;

    public Zoo(T animal, K animal2, R animal3) {
        this.animal = animal;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public K getAnimal2() {
        return animal2;
    }

    public void setAnimal2(K animal2) {
        this.animal2 = animal2;
    }

    public R getAnimal3() {
        return animal3;
    }

    public void setAnimal3(R animal3) {
        this.animal3 = animal3;
    }

    public void feedFlyable(){
        System.out.println("Летающее животное ест");
        animal2.fly();
    }
    public void feedSwimable(){
        System.out.println("Плавающее животное ест");
        animal3.swim();
    }
    public void feedBitable(){
        System.out.println("Кусающее животное ест");
        animal.bit();
    }
}

package Day09.quiz;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("samsik",4);
        Cat cat = new Cat("short",2);
        dog.animalCry();
        cat.animalCry();
        dog.fetch();
        cat.scratch();
    }
}

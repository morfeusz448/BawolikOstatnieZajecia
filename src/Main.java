public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> animal1 = new HomeAnimal<>(new Dog("Piesek"));
        HomeAnimal<Cat> animal2 = new HomeAnimal<>(new Cat("Kotek"));
        animal1.showType();
        animal2.showType();
        animal1.sleepOnCouch();
        animal2.sleepOnCouch();
    }
}

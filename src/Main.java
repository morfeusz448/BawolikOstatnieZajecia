public class Main {
    public static void main(String[] args) {
        // Utworzenie 2 objektów 2 klas
        HomeAnimal<Dog> animal1 = new HomeAnimal<>(new Dog("Piesek"));
        HomeAnimal<Cat> animal2 = new HomeAnimal<>(new Cat("Kotek"));
        //Wywołanie 2 metod pokazujących typ
        animal1.showType();
        animal2.showType();
        //Wywołanie 2 metod spania na kanapie
        animal1.sleepOnCouch();
        animal2.sleepOnCouch();
    }
}

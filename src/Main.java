public class Main {
    public static void main(String[] args) {

        AnimalPrinter animalPrinter = new AnimalPrinter();
        Dog dog = new Dog();
        dog.setName("Perro1");
        dog.setAge(5);
        animalPrinter.printAnimal(dog);
    }
}
public class AnimalPrinter {
    public void printAnimal(Animals animals){
        System.out.println("Animal: " + animals.getName() + " Edad:" + animals.getAge());
    }

    public void printDog(Dog dog){
        System.out.println("Animal: " + dog.getName() + " Edad:" + dog.getAge());
    }
}

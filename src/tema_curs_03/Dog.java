package tema_curs_03;

public class Dog implements IAnimal {
    private String animalName;

    public Dog(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    @Override
    public String makeSound() {
        return "Ham-Ham";
    }
}

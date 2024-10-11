package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal2", 0);
        Dog dog = new Dog("dog2", 100);
        Cat cat = new Cat("cat2", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

    }
}

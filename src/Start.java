import it.develhope.entities.Animal;
import it.develhope.entities.Lion;
import it.develhope.entities.Cow;

public class Start {

    public static void main(String[] args) {

        //objects for every class/subclass creation
        Animal genericAnimal = new Animal("Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        System.out.println("--GENERIC--");
        genericAnimal.animalSound();
        System.out.println("--LION--");
        lion.animalSound();
        System.out.println("--COW--");
        cow.animalSound();

    }
}

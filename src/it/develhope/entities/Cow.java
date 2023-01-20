package it.develhope.entities;

public class Cow extends Animal{

    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("Mess with the bull and you get the horns!");
    }
}

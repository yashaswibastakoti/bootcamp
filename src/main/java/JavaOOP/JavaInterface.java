package JavaOOP;

//create a virtual pet simulation where users can adopt and interact with different types of virtual pets.
//your task is to design and implement the necessary classes and interfaces to model the virtual pets and their behaviors.
/*
Requirements:
1) Interface: VirtualPet
    Define an interface named 'VirtualPet' with the following methods:
    -void feed(): this method should simulate feeding the virtual pet.
    -void play(): this method should simulate playing with the virtual pet.
    -void sleep(): this method should simulate the virtual pet sleeping.
*/
/*
public interface VirtualPet{
    void feed();
    void play();
    void sleep();
}

/*
2) Abstract Class: PetSpecies
    -Create abstract class named PetSpecies that implements the 'VirtualPet' interface.
    -Define common attributes such as 'name','hunger', 'happiness', and 'energy'.
    -Implement the 'feed()', 'play()', and 'sleep()' methods with default behaviors that affect the pet's attributes accordingly.
*/
/*
abstract class PetSpecies implements VirtualPet{
    String name;
    int hunger;
    int happiness;
    int energy;

    public PetSpecies(String name){
        this.name = name;
        this.hunger = 5;
        this.happiness = 5;
        this.energy = 5;
    }

    @Override
    public void feed(){
        //use hunger and energy
    }
    @Override
    public void play(){
        //use happiness and energy
    }
    @Override
    public void sleep(){
        //use energy
    }

    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getHappiness() {
        return happiness;
    }
    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString(){
        return ("Name: "+ name + " " + "Hunger: " + hunger + " " + "Happiness: " + happiness+ " " + "Energy: " + energy);
    }
}

/*
3) Concrete classes:
    -Create concrete classes for at least three different types of virtual pets (e.g., Dog, Cat, Bird).
    -Each concrete class should extend the 'PetSpecies' class and provide unique behaviors or characteristics for that type of pet.
*/
/*
public class Dog extends PetSpecies{
    public Dog(String name){
        super(name);
    }
}
public class Cat extends PetSpecies{
    public Cat(String name){
        super(name);
    }
}
public class Bird extends PetSpecies{
    public Bird(String name){
        super(name);
    }
}
*/
/*
4) PetShelter Class:
    -Create a 'PetShelter' class to manage the virtual pets.
    -Implement methods to add pets to the shelter, remove pets from the shelter,
    and display all parts in the shelter along with their details(name, species, hunger level, happiness level, energy level).
*/
/*
public class PetShelter{


    public void addPet(){


    }

    public void removePet(){


    }

    public void displayAllPets(){

    }
}

5) Main Application:
    -Write a main application to demonstrate the functionality of your virtual pet simulation.
    -Create an instance of the 'PetShelter' class and add several virtual pets od different species to the shelter.
    - Interact with the virtual pets by feeding them, playing with them, and putting them to sleep.
    -Display all pets in the shelter and their current status.

public static void main(String [] args){
    PetShelter petShelter = new PetShelter();

    //add pets
    petShelter.addPet(new Dog());
    petShelter.addPet(new Car());
    petShelter.addPet(new Bird());

    //Interact with pets
    //feed
    //play
    //sleep

    //Display pets
    petShelter.displayAllPets();
}

/*
Notes:
    -Utilize inheritance and polymorphism to maximize code reuse and flexibility.
    -Test your app thoroughly to ensure correctness and functionality.
 */


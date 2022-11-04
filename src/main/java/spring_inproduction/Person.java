package spring_inproduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet <3");
        pet.say();
    }
}

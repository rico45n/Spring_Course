package spring_inproduction;

public class Person {
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String surname;
    private int age;

    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");

    }




    public void setPet(Pet pet) {
        System.out.println("Class Person set Pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet <3");
        pet.say();
    }
}

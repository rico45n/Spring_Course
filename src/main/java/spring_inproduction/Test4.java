package spring_inproduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 = applicationContext.getBean("myPet" , Dog.class);
        dog1.setName("Belka");

        Dog dog2 = applicationContext.getBean("myPet" , Dog.class);
        dog2.setName("Strelka");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        System.out.println(dog1 == dog2);
        applicationContext.close();
    }
}

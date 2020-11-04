package tema_curs_03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03.xml");

        Dog dog = context.getBean("myDog", Dog.class);
        System.out.println(dog.makeSound());
        System.out.println("dogName: " + dog.getAnimalName());

        IAnimal cat = context.getBean("myCat", IAnimal.class);
        System.out.println(cat.makeSound());

        IAnimal mouse = context.getBean("myMouse", IAnimal.class);
        System.out.println(mouse.makeSound());

        context.close();
    }
}

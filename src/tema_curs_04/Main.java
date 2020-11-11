package tema_curs_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");

        Task myTask = context.getBean("myTaskSingleton", Task.class);

        System.out.println("Task name: " + myTask.getTaskName());
        System.out.println("no of tasks: " + Task.getNumberOfTasks());
        System.out.println("executionTime: " + myTask.getExecutionTime());
        myTask.run();
        System.out.println("----------------");

        Task anotherTask = context.getBean("myTaskPrototype", Task.class);
        System.out.println("Task name: " + anotherTask.getTaskName());
        System.out.println("no of tasks: " + Task.getNumberOfTasks());
        System.out.println("executionTime: " + anotherTask.getExecutionTime());
        anotherTask.run();
        System.out.println("----------------");
        context.close();

        System.out.println("----------------");
        System.out.println("Context closed. No of tasks: " + Task.getNumberOfTasks());
    }
}

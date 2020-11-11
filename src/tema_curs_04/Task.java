package tema_curs_04;

import java.util.concurrent.TimeUnit;

public class Task {

    private String taskName = "Task ";
    private Integer taskId;
    private Integer executionTime;
    private static Integer numberOfTasks = 0;

    public Task() {
        numberOfTasks++;
        System.out.println("inside constructor");
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public static Integer getNumberOfTasks() {
        return numberOfTasks;
    }

    public void run() throws InterruptedException {
        TimeUnit.SECONDS.sleep(this.executionTime);
    }

    public Integer generateId() {
        return numberOfTasks-1;
    }

    private void performInitialization() {
        this.taskId = this.generateId();
        this.taskName += this.taskId;
        this.executionTime = (int) Math.round((Math.random() * 20));
    }

    private void performDestruction() {
        numberOfTasks--;
        System.out.println("Task name on deletion: " + this.taskName);
    }
}

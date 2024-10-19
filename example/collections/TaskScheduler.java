package com.example.collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    String taskName;
    int priority;
    LocalDate deadline;

    public Task(String taskName, int priority, LocalDate deadline) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}

public class TaskScheduler {
    PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        // Create a priority queue with a custom comparator
        taskQueue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                // First compare by priority
                if (t1.priority != t2.priority) {
                    return Integer.compare(t1.priority, t2.priority);
                }
                // If priorities are the same, compare by deadline
                return t1.deadline.compareTo(t2.deadline);
            }
        });
    }

    public void addTaskToScheduler(Task task) {
        taskQueue.add(task);
    }

    public void displayTasks() {
        System.out.println("Tasks in order of priority and deadline:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll()); // Remove and print the highest priority task
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        Task task1 = new Task("Finish report", 3, LocalDate.of(2024, 10, 20));
        Task task2 = new Task("Prepare presentation", 5, LocalDate.of(2024, 10, 25));
        Task task3 = new Task("Update website", 2, LocalDate.of(2024, 11, 5));
        Task task4 = new Task("Client meeting", 4, LocalDate.of(2024, 10, 30));
        Task task11 = new Task("Client meeting", 4, LocalDate.of(2024, 10, 30));
        Task task5 = new Task("Code review", 1, LocalDate.of(2024, 10, 18));
        Task task6 = new Task("Write documentation", 4, LocalDate.of(2024, 11, 2));
        Task task7 = new Task("Fix bugs", 5, LocalDate.of(2024, 10, 22));
        Task task8 = new Task("Team meeting", 3, LocalDate.of(2024, 10, 19));
        Task task9 = new Task("Design new feature", 2, LocalDate.of(2024, 11, 8));
        Task task10 = new Task("Plan sprint", 1, LocalDate.of(2024, 10, 15));

        scheduler.addTaskToScheduler(task1);
        scheduler.addTaskToScheduler(task2);
        scheduler.addTaskToScheduler(task3);
        scheduler.addTaskToScheduler(task4);
        scheduler.addTaskToScheduler(task5);
        scheduler.addTaskToScheduler(task6);
        scheduler.addTaskToScheduler(task7);
        scheduler.addTaskToScheduler(task8);
        scheduler.addTaskToScheduler(task9);
        scheduler.addTaskToScheduler(task10);
        scheduler.addTaskToScheduler(task11);

        // Display the tasks
        scheduler.displayTasks();
    }
}

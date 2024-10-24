package com.example.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Task implements Comparable<Task> {
	String taskName;
	int priority;
	LocalDate deadline;

	public Task(String taskName, int priority, LocalDate deadline) {
		this.taskName = taskName;
		this.priority = priority;
		this.deadline = deadline;
	}

	@Override
	public int compareTo(Task o) {
		if (this.priority == o.priority) {
			return this.deadline.compareTo(o.deadline);
		} else {
			return this.priority-o.priority;
		}
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", priority=" + priority + ", deadline=" + deadline + "]";
	}

}

public class TaskScheduler {
	PriorityQueue<Task> tasks;

	public TaskScheduler() {
		tasks = new PriorityQueue<Task>();
	}

	public void addTaskToScheduler(Task task) {
		tasks.add(task);
	}
	
	public void schedule() {
		while(!tasks.isEmpty()) {
			System.out.println(tasks.poll());
		}
	}

	public static void main(String[] args) {

		TaskScheduler scheduler = new TaskScheduler();

		Task task1 = new Task("Finish report", 3, LocalDate.of(2024, 10, 20));
		Task task2 = new Task("Prepare presentation", 5, LocalDate.of(2024, 10, 25));
		Task task3 = new Task("Update website", 2, LocalDate.of(2024, 11, 5));
		Task task4 = new Task("Client meeting", 4, LocalDate.of(2024, 10, 30));
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
		
	    scheduler.schedule();

	}
}

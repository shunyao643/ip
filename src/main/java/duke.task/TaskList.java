package duke.task;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Manages an ArrayList of Tasks. Tasks can have an associated deadline, event or nothing at all.
 */
public class TaskList {

    private ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<Task>();
    }

    /**
     * Adds a new string as ToDo to the ArrayList and prints the Task added.
     *
     * @param taskName
     */
    public void addToDo(String taskName) {
        Task newTask = new ToDo(taskName);
        printAndAddTask(newTask);
    }

    /**
     * Adds a new string as Deadline to the ArrayList and prints the Task added.
     *
     * @param taskName
     * @param deadline
     */
    public void addDeadline(String taskName, String deadline) {
        Task newTask = new Deadline(taskName, deadline);
        printAndAddTask(newTask);
    }


    /**
     * Adds a new string as Event to the ArrayList and prints the Task added.
     *
     * @param taskName
     * @param eventTime
     */
    public void addEvent(String taskName, String eventTime) {
        Task newTask = new Event(taskName, eventTime);
        printAndAddTask(newTask);
    }

    /**
     * Adds a new string as ToDo to the ArrayList and prints the Task added.
     *
     * @param taskName
     * @param isDone
     */
    public void addToDo(String taskName, boolean isDone) {
        Task newTask = new ToDo(taskName, isDone);
        printAndAddTask(newTask);
    }

    /**
     * Adds a new string as Deadline to the ArrayList and prints the Task added.
     *
     * @param taskName
     * @param isDone
     * @param deadline
     */
    public void addDeadline(String taskName, boolean isDone, String deadline) {
        Task newTask = new Deadline(taskName, isDone, deadline);
        printAndAddTask(newTask);
    }


    /**
     * Adds a new string as Event to the ArrayList and prints the Task added.
     *
     * @param taskName
     * @param eventTime
     */
    public void addEvent(String taskName, boolean isDone, String eventTime) {
        Task newTask = new Event(taskName, isDone, eventTime);
        printAndAddTask(newTask);
    }

    /**
     * Helper function to print and add new task
     *
     * @param newTask
     */
    private void printAndAddTask(Task newTask) {
        taskList.add(newTask);
        System.out.println("Added: " + newTask);
    }

    /**
     * Removes a task from the TaskList. Note this is irreversible!
     *
     * @param index Index of task to be removed, as displayed to the user
     */
    public void deleteTask(int index) {
        System.out.println("Task removed: " + System.lineSeparator() + taskList.remove(index));
    }

    /**
     * Prints out the list of Tasks.
     */
    public void displayTasks() {
        if (taskList.size() == 0) {
            System.out.println("no tasks to be found!");
        }
        System.out.println("total " + taskList.size() + " tasks to be completed:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + ". " + taskList.get(i));
        }
    }

    /**
     * Sets the completion status of a Task using its index (as displayed to the user).
     *
     * @param index
     * @param status
     */
    public void setTaskStatus(int index, boolean status) {
        Task task = taskList.get(index);
        task.setDone(status);
        if (status) {
            System.out.println("Ok, task done!");
        } else {
            System.out.println("Ok, you didn't actually do the task!");
        }
        System.out.println("   " + task);
    }

    /**
     * Given a string, print all strings that are found in a particular task
     * @param keyword
     */
    public void showResults(String keyword){
        System.out.println("The matching tasks are as follows:");
        for (int i = 0; i < taskList.size(); i++){
            Task task = taskList.get(i);
            if (task.getTaskInfo().contains(keyword)) {
                System.out.println((i+1)+". "+task);
            }
        }
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }


}

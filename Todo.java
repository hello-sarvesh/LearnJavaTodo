import java.io.BufferedReader; // import BufferedReader class from Java Core Libraries
import java.io.IOException;
import java.io.InputStreamReader; // import InputStreamReader class from Java Core Libraries
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; // import Scanner class from Java Core Libraries

public class Todo {
    // global variable
    static Task firstTask = null;
    static Task currentTask = null;
    static Scanner s = new Scanner(System.in);

    // Java code start with main method
    public static void main(String[] args) {
        // printing hello to java
        System.out.println("Hello Java World !!");
        dashboard(); // calling method
    }

    // define funtion for using multiple set task
    public static void setTask(String taskName) {
        Task newTask = new Task(taskName, Priority.MEDIUM);
        if (firstTask == null) {
            firstTask = newTask;
            currentTask = firstTask;
        } else {
            currentTask.setNextTask(newTask);
            currentTask = newTask;
        }
    }

    // define funtion for show multiple current task
    public static void showTask() {
        // first task is exits ?
        if (firstTask != null) {
            Task task = firstTask;
            System.out.print("---Your Total " + task.getTaskCount() + " Task Is---\n");
            int i = 0;
            while (task != null) {// while last task is not null
                System.out.println("" + i + ". " + task.getTaskName());
                task = task.getNextTask();
                i++;
            }
            ;
        } else {
            System.out.println("---You Not Create Any Task---");
        }
        dashboard();
    }

    public static void addNewTask() {
        int taskNumber = 0;
        System.out.println("How many task you do ? ");
        try {
            taskNumber = s.nextInt();
            if (taskNumber < 0) {
                System.out.println("task value must be greater than 0.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid task numbers value.");
            s.nextLine();
        }

        // for loop for create multiple base on taskNumber
        for (int i = 0; i < taskNumber; i++) {
            System.out.println("What is your " + (i + 1) + " task ?");
            try {
                // user define task
                String taskName = s.next();
                setTask(taskName); // calling method with parameter
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid task.");
                s.nextLine();
            }
        }
        dashboard();
    }

    public static void dashboard() {
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        // while loop recursively display dashbord if any input error
        while (true) {
            System.out.println("_______________DashBoard Todo_______________");
            System.out.println("Date Time: " + timeStamp);
            System.out.println("1. Add New Task");
            System.out.println("2. Show All Task");
            System.out.println("0. exit");
            try {
                int option = s.nextInt();
                // switch case same as nested if else-if else
                switch (option) {
                    case 1:
                        addNewTask();
                        break;
                    case 2:
                        showTask();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("You enter wrong option .");
                        System.exit(0);
                        break;

                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                s.nextLine();
            }
        }
    }
}

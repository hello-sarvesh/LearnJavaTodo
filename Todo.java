import java.io.BufferedReader; // import BufferedReader class from Java Core Libraries
import java.io.IOException;
import java.io.InputStreamReader; // import InputStreamReader class from Java Core Libraries
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; // import Scanner class from Java Core Libraries

public class Todo {
    // global variable
    // static means that variable common value in all object
    static int currentTaskNumber = 1;
    static char[][] task = new char[5][];
    static Scanner s = new Scanner(System.in);

    // Java code start with main method
    public static void main(String[] args) {
        // printing hello to java
        System.out.println("Hello Java World !!");
        dashboard(); // calling method
    }

    // define funtion for using multiple set task
    public static void setTask(char[] taskGiven) {
        task[currentTaskNumber - 1] = taskGiven;
        currentTaskNumber++; // increamenting number by 1 for next task
    }

    // define funtion for show multiple current task
    public static void showTask() {
        System.out.print("---Your Task Is---\n");
        // for loop to display all task
        for (int i = 0; i < currentTaskNumber - 1; i++) {
            char dot = '.';
            
            System.out.print(i + 1);
            System.out.print(dot);
            System.out.print(' ');
            System.out.print(task[i]);
            System.out.print('\n'); // course move new line
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
                char[] task = s.next().toCharArray();
                setTask(task); // calling method with parameter
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

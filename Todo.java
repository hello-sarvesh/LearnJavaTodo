import java.io.BufferedReader; // import BufferedReader class from Java Core Libraries
import java.io.IOException;
import java.io.InputStreamReader; // import InputStreamReader class from Java Core Libraries
import java.util.Scanner; // import Scanner class from Java Core Libraries

public class Todo {
    // global variable
    // static means that variable common value in all object
    static int currentTaskNumber = 1;
    static char[][] task = new char[5][];

    // Java code start with main method
    public static void main(String[] args) {
        // printing hello to java
        System.out.println("Hello Java World !!");
        // we need user input so we use Scanner class for geting input from console.
        // Scanner is class pre define in Java Core Libraries for handles io operations
        Scanner s = new Scanner(System.in);

        System.out.println("How many task you do ? ");
        int taskNumber = s.nextInt();

        // for loop for create multiple base on taskNumber
        for (int i = 0; i < taskNumber; i++) {
            System.out.println("What is your "+(i+1)+" task ?");
            // user define task
            char[] task = s.next().toCharArray();
            setTask(task); // calling method with parameter
        }

        showTask(); // calling method
    }

    // define funtion for using multiple set task
    public static void setTask(char[] taskGiven) {
        task[currentTaskNumber - 1] = taskGiven;
        currentTaskNumber++; // increamenting number by 1 for next task
    }

    // define funtion for show multiple current task
    public static void showTask() {
        currentTaskNumber--; // decrementing by 1 for previous
        System.out.print("---Your Task Is---\n");
        // for loop to display all task
        for (int i = 0; i < currentTaskNumber; i++) {
            char dot = '.';

            System.out.print(i + 1);
            System.out.print(dot);
            System.out.print(' ');
            System.out.print(task[i]);
            System.out.print('\n'); // course move new line
        }
    }
}

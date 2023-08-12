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
        System.out.println("What is your first task ?");
        // user define task
        char[] task1 = s.next().toCharArray();
        setTask(task1); // calling method with parameter

        // another io reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your second task ?");
        char[] task2;
        // try block handle runtime throw error
        try {
            // in this block any runtime error occur then catch block is catched
            task2 = reader.readLine().toCharArray();
            setTask(task2);
            
        } catch (IOException e) {
            // catch block is catches that error.
            e.printStackTrace();
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

        // checking currentTaskNumber is greater than zero : if yes then go inside if ,
        // else go inside else
        if (currentTaskNumber > 0) {
            // if block
            char dot = '.';

            System.out.print(currentTaskNumber);
            System.out.print(dot);
            System.out.print(' ');
            System.out.print(task[currentTaskNumber - 1]);
            System.out.print('\n'); // course move new line
            // recursively calls show method for display all tasks
            showTask();
        } else {
            // else block
            // stop here calls
            System.exit(0);// Terminate JVM
        }
    }
}

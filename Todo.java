public class Todo {
    // global variable
    // static means that variable common value in all object
    static int currentTaskNumber = 1;
    static char[][] task = new char[5][];

    // Java code start with main method
    public static void main(String[] args) {
        // printing hello to java
        System.out.println("Hello Java World !!");

        // define task
        char[] task1 = { 'L', 'e', 'a', 'r', 'n', ' ', 'J', 'a', 'v', 'a' };
        setTask(task1); //calling method with parameter
        char[] task2 = { 'S', 't', 'a', 'r', 't', ' ', 'C', 'o', 'd', 'i', 'n', 'g' };
        setTask(task2); 
        showTask(); //calling method
    }

    // define funtion for using multiple set task
    public static void setTask(char[] taskGiven) {
        task[currentTaskNumber-1] = taskGiven;
        currentTaskNumber++; // increamenting number by 1 for next task
    }

    // define funtion for show multiple current task
    public static void showTask() {
        currentTaskNumber--; // decrementing by 1 for previous

        //checking currentTaskNumber is greater than zero : if yes then go inside if , else go inside else
        if (currentTaskNumber > 0) {
            //if block
            char dot = '.';

            System.out.print(currentTaskNumber);
            System.out.print(dot);
            System.out.print(' ');
            System.out.print(task[currentTaskNumber-1]);
            System.out.print('\n'); //course move new line
            //recursively calls show method for display all tasks
            showTask();
        } else {
            //else block
            // stop here calls
        }
    }
}

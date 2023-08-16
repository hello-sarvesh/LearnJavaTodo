public class Task {
    private static int taskCount = 0;
    private String taskName;
    private Priority priority;
    // reference of same class
    private Task nextTask; // logic behinde nextTask variable to store reference of next create object

    //no arg constructor
    Task(){
        taskCount++; // if class object is make then icrement
    }

    Task(String taskName,Priority priority){
        this.taskName = taskName;
        this.priority = priority;
        taskCount++; // if class object is make then icrement
    }

    Task(String taskName,Priority priority,Task nextTask){
        this.taskName = taskName;
        this.priority = priority;
        this.nextTask = nextTask;
        taskCount++; // if class object is make then icrement
    }

    // getter & setter for private fields
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public String getTaskName(){
        return this.taskName;
    }
    public void setPriority(Priority priority){
        this.priority = priority;
    }
    public Priority getPriority(){
        return this.priority;
    }
    public void setNextTask(Task nextTask){
        this.nextTask = nextTask;
    }
    public Task getNextTask(){
        return this.nextTask;
    }
    public int getTaskCount(){
        return taskCount;
    }

}

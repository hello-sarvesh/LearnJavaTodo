public class Task {
    private static int taskCount = 0;
    private String taskName;
    private Priority priority;

    //no arg constructor
    Task(){
        taskCount++; // if class object is make then icrement
    }

    Task(String taskName,Priority priority){
        this.taskName = taskName;
        this.priority = priority;
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
}

public class Task {
    private final String name;
    private final Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void display(){
        System.out.println("Task: Name: " + name + "Priority: " + priority.getDescription());
    }
}


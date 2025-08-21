public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count = 0;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
    }

    public void addTask(String description) {
         if (count < this.capacity) {
        Task task = new Task();
        task.setDescription(description);
        task.setStatus(TaskStatus.NEW);
        this.tasks[count++] = task;
         }

    }

    public void setStatus(int index, TaskStatus status) {
        if (index < this.capacity) {
            this.tasks[index].setStatus(status);
        }
    }

    public void setDescription(int index, String newDescription) {
        if (index < this.capacity) {
            this.tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < this.capacity; i++) {
            if (tasks[i] != null) {
        String spaces = addSpace(34 - tasks[i].getDescription().length());
        System.out.println(String.format("%s%s| %s", tasks[i].getDescription(), spaces, tasks[i].getStatus()));
            }

        }
    }

    private String addSpace(int n) {
        String res = ""; 
        for(int i = 0; i < n; i++) {
            res += " ";
        }
        return res;
    }
}
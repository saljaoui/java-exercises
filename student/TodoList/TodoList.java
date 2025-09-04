enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList(int capacity) {
        this.tasks = new Task[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    public void addTask(String description) {
        if (count >= capacity) {  // ✅ fix > to >=
            return;
        }

        Task task = new Task();
        task.setDescription(description);
        task.setStatus(TaskStatus.NEW);
        this.tasks[count] = task;
        count++;
    }

    public void setStatus(int index, TaskStatus status) {
        if (index < 0 || index >= count) {  // ✅ fix > capacity
            return;
        }
        this.tasks[index].setStatus(status);
    }

    public void setDescription(int index, String newDescription) {
        if (index < 0 || index >= count) {
            return;
        }
        this.tasks[index].setDescription(newDescription);
    }

    public void displayTasks() {
        System.out.println("Tasks:");  // ✅ print once
        for (int i = 0; i < count; i++) {
            String description = tasks[i].getDescription();
            String status = tasks[i].getStatus().toString();
            System.out.printf("%-33s | %s%n", description, status); // ✅ align with padding
        }
    }
}

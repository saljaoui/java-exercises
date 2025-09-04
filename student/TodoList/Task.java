public class Task {
    private String description;
    private TaskStatus status;

    public Task(String description) {
        this.description = description;
        this.status = TaskStatus.NEW;
    }

    public Task() {
        this.description = "";
        status = TaskStatus.NEW;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }
    public TaskStatus getStatus() {
        return status;
    }
}

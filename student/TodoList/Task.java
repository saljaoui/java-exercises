public class Task {
    private String description;
    private TaskStatus status;
    public Task() { this.description = ""; }
    public Task(String description) { this.description = description; this.status = TaskStatus.NEW; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(TaskStatus taskStatus) { this.status = taskStatus; }
    public String getDescription() { return this.description; }
    public TaskStatus getStatus() { return this.status; }
    public Task getTask() { return this; }
}
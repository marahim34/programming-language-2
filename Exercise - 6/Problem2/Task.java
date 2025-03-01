public class Task implements Priority{
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task: " + description + " (Priority: " + priority + ")";
    }
}

public class Task implements Priority, Complexity{
    private String description;
    private int priority;
    private int complexity;


    public Task(String description, int priority, int complexity) {
        this.description = description;
        this.priority = priority;
        this.complexity = complexity;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task: " + description
                + " (Priority: " + priority
                + ", Complexity: " + complexity + ")";
    }
}

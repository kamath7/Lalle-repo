public class TodoClass {
    private String taskName;
    private String shortDescription;
    private long duration;
    private String priority;

    public TodoClass(String taskName, String shortDescription, long duration, String priority) {
        this.taskName = taskName;
        this.shortDescription = shortDescription;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task -> {" +
                "taskName='" + taskName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", duration=" + duration +
                ", priority='" + priority + '\'' +
                '}';
    }
}

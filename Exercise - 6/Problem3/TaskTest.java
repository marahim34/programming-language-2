public class TaskTest {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Java Assignment", 5, 3);
        Task task2 = new Task("Buy Groceries", 2, 1);
        Task task3 = new Task("Pay Bills", 3, 2);

        System.out.println("Initial Tasks:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        System.out.println("\nUpdating priorities and complexities...");
        task1.setPriority(1);
        task1.setComplexity(4);
        task2.setPriority(4);
        task2.setComplexity(2);
        task3.setPriority(3);
        task3.setComplexity(5);

        System.out.println("\nUpdated Tasks:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        System.out.println("\nReading individual priorities and complexities:");
        System.out.println("Task1 => Priority: " + task1.getPriority()
                + ", Complexity: " + task1.getComplexity());
        System.out.println("Task2 => Priority: " + task2.getPriority()
                + ", Complexity: " + task2.getComplexity());
        System.out.println("Task3 => Priority: " + task3.getPriority()
                + ", Complexity: " + task3.getComplexity());

    }


}

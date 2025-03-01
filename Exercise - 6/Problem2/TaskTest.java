public class TaskTest {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Java Assignment", 5);
        Task task2 = new Task("Buy Groceries", 2);
        Task task3 = new Task("Pay Bills", 3);

        System.out.println("Initial Tasks:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        System.out.println("\nUpdating priorities...");
        task1.setPriority(1);  // High priority
        task2.setPriority(4);
        task3.setPriority(3);

        System.out.println("\nUpdated Tasks:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        System.out.println("\nReading individual priorities:");
        System.out.println("Task 1 priority: " + task1.getPriority());
        System.out.println("Task 2 priority: " + task2.getPriority());
        System.out.println("Task 3 priority: " + task3.getPriority());

    }
}

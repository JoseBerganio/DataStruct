import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initialize data structures
        SubmissionQueue queue = new SubmissionQueue(100); // adjust capacity
        BinarySearchTree bst = new BinarySearchTree();
        HashMap studentMap = new HashMap(100); // adjust capacity

        boolean running = true;

        while (running) {
            System.out.println("\nHomework Submission System");
            System.out.println("--------------------------");
            System.out.println("1. Submit Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Lookup Submissions by Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch(choice) {

                case 1: // Submit Assignment
                    System.out.print("Enter Student ID: ");
                    String studentID = scanner.nextLine();

                    System.out.print("Enter Assignment ID: ");
                    String assignmentID = scanner.nextLine();

                    System.out.print("Enter Due Date (as integer days): ");
                    int dueDate = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    // Create submission node
                    Node submissionNode = new Node(dueDate);

                    // Queue: enqueue submission
                    queue.enqueue(studentID, assignmentID, String.valueOf(dueDate));

                    // BST: insert submission by due date
                    bst.insert(submissionNode);

                    // HashMap: store submission by student ID
                    String existing = studentMap.get(studentID);
                    if(existing == null) existing = "";
                    String newEntry = existing + assignmentID + " (Due in " + dueDate + " days); ";
                    studentMap.put(studentID, newEntry);

                    System.out.println("Submission added successfully!");
                    break;

                case 2: // View Assignments
                    System.out.println("\nAssignments in the system (sorted by due date):");
                    bst.display();
                    break;

                case 3: // Lookup by Student
                    System.out.print("Enter Student ID to lookup: ");
                    String lookupID = scanner.nextLine();
                    String submissions = studentMap.get(lookupID);
                    if(submissions != null) {
                        System.out.println("Submissions for " + lookupID + ": " + submissions);
                    } else {
                        System.out.println("No submissions found for " + lookupID);
                    }
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

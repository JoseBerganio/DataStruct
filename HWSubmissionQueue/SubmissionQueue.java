// Queue implementation using ARRAY
class SubmissionQueue {
    private SubmissionForQueue[] queue;
    private int size;

    public SubmissionQueue(int capacity) {
        queue = new SubmissionForQueue[capacity];
        size = 0;
    }

    // ENQUEUE: Add at the end of the queue
    public void enqueue(String studentID, String assignmentID, String dueDate) {
        if (size == queue.length) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        queue[size] = new SubmissionForQueue(studentID, assignmentID, dueDate);
        System.out.println("Enqueued: " + queue[size]);
        size++;
    }

    // DEQUEUE: Remove the first element
    public SubmissionForQueue dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        SubmissionForQueue removed = queue[0];
        System.out.println("Dequeued: " + removed);

        moveForward(); // shift elements left
        size--;

        return removed;
    }

    // moveForward: Shift all elements after dequeue
    public void moveForward() {
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[size - 1] = null; // clear last position
    }

    // Display queue
    public void showQueue() {
        System.out.println("Current Queue:");
        if (size == 0) {
            System.out.println("(empty)");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(" -> " + queue[i]);
        }
    }
}

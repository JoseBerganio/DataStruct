
// Class for each homework submission
class SubmissionForQueue {
    String studentID;
    String assignmentID;
    String dueDate;

    public SubmissionForQueue(String studentID, String assignmentID, String dueDate ) {
        this.studentID = studentID;
        this.assignmentID = assignmentID;
        this.dueDate = dueDate;
    }

    public String toString() {
        return "Student ID:"+ this.studentID + " | Assignment: " + this.assignmentID + " | Due:" + this.dueDate;
    }
}

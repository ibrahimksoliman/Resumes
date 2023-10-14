// Enumeration for Feedback Statuses
enum FeedbackStatus {
    SHORTLISTED,
    REJECTED,
    PENDING
}


public class Feedback {

    // Instance variables for feedback status and comments.
    private FeedbackStatus status;
    private String feedbackComment;

    // Constructor using 'this' keyword to initialize the instance variables.
    public Feedback(FeedbackStatus status, String feedbackComment) {
        this.status = status;
        this.feedbackComment = feedbackComment;
    }

    // Setter method for feedback status.
    public void setStatus(FeedbackStatus status) {
        if (status != null) {
            this.status = status;
        } else {
            System.out.println("Error: Invalid feedback status.");
        }
    }

    // Setter method for feedback comments.
    public void setFeedbackComment(String feedbackComment) {
        if (feedbackComment != null && !feedbackComment.trim().isEmpty()) {
            this.feedbackComment = feedbackComment;
        } else {
            System.out.println("Error: Invalid feedback comment.");
        }
    }

    // Getter method for feedback status.
    public FeedbackStatus getStatus() {
        return status;
    }

    // Getter method for feedback comments.
    public String getFeedbackComment() {
        return feedbackComment;
    }

    // Method to display feedback details.
    public void displayFeedbackDetails() {
        System.out.printf("Feedback Status: %s\nFeedback Comment: %s\n", status, feedbackComment);
    }

    // Main method for demonstration purposes.
    public static void main(String[] args) {
        Feedback initialFeedback = new Feedback(FeedbackStatus.PENDING, "Yet to review.");
        initialFeedback.displayFeedbackDetails();
        initialFeedback.setStatus(FeedbackStatus.REJECTED);
        initialFeedback.setFeedbackComment("Lacking relevant experience.");
        initialFeedback.displayFeedbackDetails();
    }
}

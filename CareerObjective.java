public class CareerObjective {

    // Instance variable to store the objective statement.
    private String objectiveStatement;

    // Constructor using 'this' keyword to initialize the instance variable.
    public CareerObjective(String objectiveStatement) {
        this.objectiveStatement = objectiveStatement;
    }

    // Setter method for objectiveStatement.
    public void setObjectiveStatement(String objectiveStatement) {
        // Basic validation before setting the objective statement.
        if (objectiveStatement != null && !objectiveStatement.trim().isEmpty()) {
            this.objectiveStatement = objectiveStatement;
        } else {
            System.out.println("Error: Invalid objective statement.");
        }
    }

    // Getter method for objectiveStatement.
    public String getObjectiveStatement() {
        return objectiveStatement;
    }

    // Method to display the objective statement.
    public void displayObjective() {
        System.out.printf("Career Objective: %s\n", objectiveStatement);
    }

    // A main method for demonstration purposes.
    public static void main(String[] args) {
        CareerObjective johnsObjective = new CareerObjective("To become a leading software engineer in AI-driven applications.");
        johnsObjective.displayObjective();
        johnsObjective.setObjectiveStatement("To lead in the field of AI and cloud computing.");
        johnsObjective.displayObjective();
    }
}

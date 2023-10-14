public class Project {

    // Instance variables to store project details.
    private String name;
    private String description;
    private String duration;
    private String achievement;

    // Constructor using 'this' keyword to initialize the instance variables.
    public Project(String name, String description, String duration, String achievement) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.achievement = achievement;
    }

    // Setter method for name.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid project name.");
        }
    }

    // Setter method for description.
    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        } else {
            System.out.println("Error: Invalid project description.");
        }
    }

    // Setter method for duration.
    public void setDuration(String duration) {
        if (duration != null && !duration.trim().isEmpty()) {
            this.duration = duration;
        } else {
            System.out.println("Error: Invalid project duration.");
        }
    }

    // Setter method for achievement.
    public void setAchievement(String achievement) {
        if (achievement != null && !achievement.trim().isEmpty()) {
            this.achievement = achievement;
        } else {
            System.out.println("Error: Invalid achievement.");
        }
    }

    // Getter method for name.
    public String getName() {
        return name;
    }

    // Getter method for description.
    public String getDescription() {
        return description;
    }

    // Getter method for duration.
    public String getDuration() {
        return duration;
    }

    // Getter method for achievement.
    public String getAchievement() {
        return achievement;
    }

    // Method to display project details.
    public void displayProjectDetails() {
        System.out.printf("Project Name: %s\nDescription: %s\nDuration: %s\nAchievement: %s\n",
                name, description, duration, achievement);
    }

    // Main method for demonstration purposes.
    public static void main(String[] args) {
        Project sampleProject = new Project("AI Assistant", "Developed a voice-based AI assistant", "Jan 2022 - Dec 2022", "Achieved 99% accuracy in voice recognition.");
        sampleProject.displayProjectDetails();
        sampleProject.setName("Super AI Assistant");
        sampleProject.displayProjectDetails();
    }
}

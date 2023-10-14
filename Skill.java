// Enumeration for Proficiency Levels
enum ProficiencyLevel {
    BEGINNER,
    INTERMEDIATE,
    EXPERT
}

public class Skill {

    // Instance variables to store skill details.
    private String name;
    private ProficiencyLevel proficiencyLevel;

    // Constructor using 'this' keyword to initialize the instance variables.
    public Skill(String name, ProficiencyLevel proficiencyLevel) {
        this.name = name;
        this.proficiencyLevel = proficiencyLevel;
    }

    // Setter method for skill name.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid skill name.");
        }
    }

    // Setter method for proficiency level.
    public void setProficiencyLevel(ProficiencyLevel proficiencyLevel) {
        if (proficiencyLevel != null) {
            this.proficiencyLevel = proficiencyLevel;
        } else {
            System.out.println("Error: Invalid proficiency level.");
        }
    }

    // Getter method for skill name.
    public String getName() {
        return name;
    }

    // Getter method for proficiency level.
    public ProficiencyLevel getProficiencyLevel() {
        return proficiencyLevel;
    }

    // Method to display skill details.
    public void displaySkillDetails() {
        System.out.printf("Skill Name: %s\nProficiency Level: %s\n", name, proficiencyLevel);
    }

    // Main method for demonstration purposes.
    public static void main(String[] args) {
        Skill javaSkill = new Skill("Java Programming", ProficiencyLevel.EXPERT);
        javaSkill.displaySkillDetails();
        javaSkill.setName("Advanced Java Programming");
        javaSkill.displaySkillDetails();
    }
}

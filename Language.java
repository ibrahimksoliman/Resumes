enum LangProficiencyLevel {
    BEGINNER, INTERMEDIATE, EXPERT
}
public class Language {

    private String languageName;
    private LangProficiencyLevel proficiencyLevel;

    // Enum ProficiencyLevel for clarity

    // Constructor
    public Language(String languageName, LangProficiencyLevel proficiencyLevel) {
        this.languageName = languageName;
        this.proficiencyLevel = proficiencyLevel;
    }

    // Setter for languageName
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    // Getter for languageName
    public String getLanguageName() {
        return this.languageName;
    }

    // Getter for proficiencyLevel (this might be useful later even if not in the initial requirement)
    public LangProficiencyLevel getProficiencyLevel() {
        return this.proficiencyLevel;
    }

    // Setter for proficiencyLevel (this might be useful later even if not in the initial requirement)
    public void setProficiencyLevel(LangProficiencyLevel proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    // Display details of the language
    public void displayLanguageDetails() {
        System.out.println("Language: " + this.languageName);
        System.out.println("Proficiency Level: " + this.proficiencyLevel);
    }
}

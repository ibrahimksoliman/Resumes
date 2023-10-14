import java.util.ArrayList;

public class Resume {

    private PersonalInfo personalInfo;
    private CareerObjective objective;
    private Feedback feedback;
    private ArrayList<Education> educationList = new ArrayList<>();
    private ArrayList<WorkExperience> workExperienceList = new ArrayList<>();
    private ArrayList<Skill> skillsList = new ArrayList<>();
    private ArrayList<Project> projectsList = new ArrayList<>();
    private ArrayList<Reference> referencesList = new ArrayList<>();
    private String summary;
    private ArrayList<Language> languagesList = new ArrayList<>();

    // Constructor to initialize an empty resume.
    public Resume() {
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getSummary() {
        return summary;
    }
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
    public Feedback getFeedback() {
        return this.feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    public void setObjective(CareerObjective newObjective) {
        this.objective = newObjective;
    }

    public CareerObjective getObjective() {
        return objective;
    }

    public void addEducation(Education education) {
        if (education != null) {
            educationList.add(education);
        } else {
            throw new IllegalArgumentException("Invalid education provided.");
        }
    }

    public void removeEducation(Education education) {
        educationList.remove(education);
    }
    public void addLanguageProficiency(Language language) {
        if (language != null) {
        this.languagesList.add(language);
        } else {
            throw new IllegalArgumentException("Invalid language provided.");
        }
    }
    public void removeLanguageProficiency(Language language) {
        this.languagesList.remove(language);
    }

    public void addWorkExperience(WorkExperience workExperience) {
        if (workExperience != null) {
        workExperienceList.add(workExperience);
        } else {
            throw new IllegalArgumentException("Invalid work experience provided.");
        }
    }

    public void removeWorkExperience(WorkExperience workExperience) {
        workExperienceList.remove(workExperience);
    }

    public void addSkill(Skill skill) {
        if (skill != null) {
        skillsList.add(skill);
        } else {
            throw new IllegalArgumentException("Invalid skill provided.");
        }
    }

    public void removeSkill(Skill skill) {
        skillsList.remove(skill);
    }

    public void addProject(Project project) {
        if (project != null) {
        projectsList.add(project);
        } else {
            throw new IllegalArgumentException("Invalid project provided.");
        }
    }

    public void removeProject(Project project) {
        projectsList.remove(project);
    }

    public void addReference(Reference reference) {
        if (reference != null) {
        referencesList.add(reference);
        } else {
            throw new IllegalArgumentException("Invalid reference provided.");
        }
    }

    public void removeReference(Reference reference) {
        referencesList.remove(reference);
    }

    public boolean hasSkill(String skillName) {
        for (Skill skill : skillsList) {  // Assuming skillsList is the name of the ArrayList holding skills.
            if (skill.getName().equalsIgnoreCase(skillName)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWorkExperienceAtCompany(String companyName) {
        for (WorkExperience experience : workExperienceList) {
            if (experience.getCompanyName().equalsIgnoreCase(companyName)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasEducationAtInstitution(String institutionName) {
        for (Education education : educationList) { // Assuming educationList holds the educations.
            if (education.getInstitutionName().equalsIgnoreCase(institutionName)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSkillOrCertification(String qualification) {
        // Assuming skills might also contain certifications.
        return hasSkill(qualification) || hasEducationDegree(qualification);
    }

    public boolean hasEducationDegree(String degreeName) {
        for (Education education : educationList) {
            if (education.getDegree().equalsIgnoreCase(degreeName)) {
                return true;
            }
        }
        return false;
    }

    public int getLatestEducationYear() {
        int latestYear = 0; // Default value.
        for (Education education : educationList) {
            if (education.getGraduationYear() > latestYear) {
                latestYear = education.getGraduationYear();
            }
        }
        return latestYear;
    }

    public ArrayList<Language> getLanguagesList() {
        return languagesList;
    }
    public ArrayList<Education> getEducationList() {
        return educationList;
    }

    public ArrayList<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public ArrayList<Skill> getSkillsList() {
        return skillsList;
    }

    public ArrayList<Project> getProjectsList() {
        return projectsList;
    }

    public ArrayList<Reference> getReferencesList() {
        return referencesList;
    }

    public void displayEducations() {
        System.out.println("=== Education ===");
        for (Education edu : educationList) {
            edu.displayEducationDetails();
        }
    }

    public void displayWorkExperiences() {
        System.out.println("=== Work Experience ===");
        for (WorkExperience we : workExperienceList) {
            we.displayWorkExperienceDetails();
        }
    }

    public void displaySkills() {
        System.out.println("=== Skills ===");
        for (Skill skill : skillsList) {
            skill.displaySkillDetails();
        }
    }

    public void displayProjects() {
        System.out.println("=== Projects ===");
        for (Project project : projectsList) {
            project.displayProjectDetails();
        }
    }

    public void displayReferences() {
        System.out.println("=== References ===");
        for (Reference reference : referencesList) {
            reference.displayReferenceDetails();
        }
    }

    public void displayLanguageProficiencies() {
        System.out.println("=== Languages ===");
        for(Language lang : this.languagesList) {
            lang.displayLanguageDetails();
        }
    }

    public void displayFeedback() {
        if (feedback != null) {
            feedback.displayFeedbackDetails();
        }
    }

    public int getTotalExperience() {
        int totalExperience = 0;
        for(WorkExperience we : workExperienceList) {
            totalExperience += we.getYearsOfExperience(); // Using 'getYearsOfExperience' from WorkExperience
        }
        return totalExperience;
    }
    public void displayResume() {
        if (personalInfo != null) {
            personalInfo.displayInfo();
        }

        if (objective != null) {
            objective.displayObjective();
        }

        displayEducations();
        displayWorkExperiences();
        displaySkills();
        displayProjects();
        displayReferences();
        displayLanguageProficiencies();
        displayFeedback();
    }
    public void delete() {
        personalInfo = null;
        objective = null;
        feedback = null;

        if (educationList != null) {
            educationList.clear();
            educationList = null;
        }

        if (workExperienceList != null) {
            workExperienceList.clear();
            workExperienceList = null;
        }

        if (skillsList != null) {
            skillsList.clear();
            skillsList = null;
        }

        if (projectsList != null) {
            projectsList.clear();
            projectsList = null;
        }

        if (referencesList != null) {
            referencesList.clear();
            referencesList = null;
        }

        if (languagesList != null) {
            languagesList.clear();
            languagesList = null;
        }

        summary = null;

        System.out.println("Resume deleted successfully.");
    }


}

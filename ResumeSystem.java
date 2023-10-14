import java.util.ArrayList;
import java.util.Comparator;

public class ResumeSystem {

    // Collection to store all resumes.
    private ArrayList<Resume> resumeCollection;

    // Constructor to initialize the resume collection.
    public ResumeSystem() {
        this.resumeCollection = new ArrayList<>();
    }

    // Method to add a new resume.
    public void addResume(Resume resume) {
        if (resume != null) {
            resumeCollection.add(resume);
        } else {
            throw new IllegalArgumentException("Invalid resume provided.");
        }
    }

    // Method to delete a specific resume.
    public void deleteResume(Resume resume) {
        if (resumeCollection.contains(resume)) {
                resumeCollection.remove(resume);
        } else {
            throw new IllegalArgumentException("No Resume to be deleted.");
        }
    }

    // Method to search resumes based on criteria.
    // Advanced search across multiple resume attributes.
    public ArrayList<Resume> searchResumes(String criteria) {
        ArrayList<Resume> matchingResumes = new ArrayList<>();
        for (Resume resume : resumeCollection) {
            if (resume.getObjective().getObjectiveStatement().toLowerCase().contains(criteria.toLowerCase())
                    || resume.getPersonalInfo().getFullName().toLowerCase().contains(criteria.toLowerCase())
                    || resume.hasSkill(criteria)
                    || resume.hasWorkExperienceAtCompany(criteria)
                    || resume.hasEducationAtInstitution(criteria)) {
                matchingResumes.add(resume);
            }
        }
        return matchingResumes;
    }

    // Advanced filtering by looking into skills as well as education.
    public ArrayList<Resume> filterResumesByQualification(String qualification) {
        ArrayList<Resume> matchingResumes = new ArrayList<>();
        for (Resume resume : resumeCollection) {
            if (resume.hasSkillOrCertification(qualification) || resume.hasEducationDegree(qualification)) {
                matchingResumes.add(resume);
            }
        }
        return matchingResumes;
    }

    // Advanced sorting with more criteria.
    public ArrayList<Resume> sortResumes(String criteria) {
        ArrayList<Resume> sortedResumes = new ArrayList<>(resumeCollection); // Duplicate the original list.
        switch(criteria.toLowerCase()) {
            case "experience":
                sortedResumes.sort(Comparator.comparingInt(Resume::getTotalExperience));
                break;
            case "education":
                sortedResumes.sort((r1, r2) -> Integer.compare(
                        r2.getLatestEducationYear(), r1.getLatestEducationYear()));
                break;
            default:
                System.out.println("Invalid sorting criteria.");
                break;
        }
        return sortedResumes;
    }


    // Method to view a list of all resumes.
    public void viewListOfResumes() {
        for (Resume resume : resumeCollection) {
            System.out.printf("Name: %s | Career Objective: %s\n",
                    resume.getPersonalInfo().getFullName(),
                    resume.getObjective().getObjectiveStatement());
        }
    }

    // Method to provide feedback on a specific resume.
    public void provideFeedback(Resume resume, Feedback feedback) {
        if (resumeCollection.contains(resume)) {
            resume.setFeedback(feedback); // Assuming a setter exists in the Resume class.
        } else {
            throw new IllegalArgumentException("Resume not found in the system.");
        }
    }

    public Resume getResumeByName(String resumeName) {
        for (Resume resume : resumeCollection) {
            if (resume.getPersonalInfo().getFullName().equalsIgnoreCase(resumeName)) {
                return resume;
            }
        }
        return null; // Return null if no matching resume is found
    }

    public ArrayList<Resume> getAllResumes() {
        return resumeCollection;
    }
}

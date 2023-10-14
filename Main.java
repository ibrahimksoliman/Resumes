import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // Other class variables and initialization code

    private Scanner scanner = new Scanner(System.in);
    private ResumeSystem resumeSystem = new ResumeSystem();

    public static void main(String[] args) {
        Main resumeApp = new Main();
        Resume resume1 = createDummyResume1();
        Resume resume2 = createDummyResume2();
        Resume resume3 = createDummyResume3();
        Resume resume4 = createDummyResume4();
        // Add the resumes to the resume system
        resumeApp.resumeSystem.addResume(resume1);
        resumeApp.resumeSystem.addResume(resume2);
        resumeApp.resumeSystem.addResume(resume3);
        resumeApp.resumeSystem.addResume(resume4);
        resumeApp.start();

    }
    private static Resume createDummyResume1() {
        Resume resume = new Resume();

        // Create and set personal info
        PersonalInfo personalInfo = new PersonalInfo("John Doe", "123 Main St", "johndoe@example.com", "123-456-7890", ContactMethod.PHONE);
        resume.setPersonalInfo(personalInfo);

        // Set career objective
        CareerObjective objective = new CareerObjective("Software Developer");
        resume.setObjective(objective);

        // Add education
        Education education = new Education("University A", "Bachelor's in Computer Science", 2020);
        resume.addEducation(education);

        // Add work experience
        WorkExperience workExperience = new WorkExperience("Company X", "Software Engineer", "2020-2022", "Worked on software development projects.");
        resume.addWorkExperience(workExperience);

        // Add skills
        Skill skill1 = new Skill("Java", ProficiencyLevel.EXPERT);
        Skill skill2 = new Skill("Python", ProficiencyLevel.EXPERT);
        resume.addSkill(skill1);
        resume.addSkill(skill2);

        // Add a project
        Project project = new Project("Project A", "Developed a web application", "6 months", "Achieved 20% increase in user engagement.");
        resume.addProject(project);

        // Add a reference
        Reference reference = new Reference("Jane Smith", "janesmith@example.com");
        resume.addReference(reference);

        // Add language proficiency
        Language language = new Language("Spanish", LangProficiencyLevel.EXPERT);
        resume.addLanguageProficiency(language);

        // Set summary
        resume.setSummary("Experienced software developer with a passion for coding.");

        return resume;
    }
    // Helper method to create another dummy resume
    private static Resume createDummyResume2() {
        Resume resume = new Resume();

        // Create and set personal info
        PersonalInfo personalInfo = new PersonalInfo("Alice Johnson", "456 Elm St", "alice@example.com", "987-654-3210", ContactMethod.EMAIL);
        resume.setPersonalInfo(personalInfo);

        // Set career objective
        CareerObjective objective = new CareerObjective("Data Scientist");
        resume.setObjective(objective);

        // Add education
        Education education = new Education("University B", "Master's in Data Science", 2021);
        resume.addEducation(education);

        // Add work experience
        WorkExperience workExperience = new WorkExperience("Company Y", "Data Analyst", "2019-2021", "Performed data analysis and visualization.");
        resume.addWorkExperience(workExperience);

        // Add skills
        Skill skill1 = new Skill("Python", ProficiencyLevel.EXPERT);
        Skill skill2 = new Skill("Machine Learning", ProficiencyLevel.EXPERT);
        resume.addSkill(skill1);
        resume.addSkill(skill2);

        // Add a project
        Project project = new Project("Data Analysis Project", "Analyzed customer behavior data", "1 year", "Identified key trends and insights.");
        resume.addProject(project);

        // Add a reference
        Reference reference = new Reference("Bob Johnson", "bob@example.com");
        resume.addReference(reference);

        // Add language proficiency
        Language language = new Language("French", LangProficiencyLevel.INTERMEDIATE);
        resume.addLanguageProficiency(language);

        // Set summary
        resume.setSummary("Data scientist with strong analytical and programming skills.");

        return resume;
    }

    // Helper method to create another dummy resume
    private static Resume createDummyResume3() {
        Resume resume = new Resume();

        // Create and set personal info
        PersonalInfo personalInfo = new PersonalInfo("Sarah Smith", "789 Oak St", "sarah@example.com", "555-123-4567", ContactMethod.PHONE);
        resume.setPersonalInfo(personalInfo);

        // Set career objective
        CareerObjective objective = new CareerObjective("Marketing Manager");
        resume.setObjective(objective);

        // Add education
        Education education = new Education("University C", "Bachelor's in Marketing", 2018);
        resume.addEducation(education);

        // Add work experience
        WorkExperience workExperience = new WorkExperience("Company Z", "Marketing Specialist", "2018-2022", "Led marketing campaigns and strategy.");
        resume.addWorkExperience(workExperience);

        // Add skills
        Skill skill1 = new Skill("Digital Marketing", ProficiencyLevel.EXPERT);
        Skill skill2 = new Skill("Market Research", ProficiencyLevel.BEGINNER);
        resume.addSkill(skill1);
        resume.addSkill(skill2);

        // Add a project
        Project project = new Project("Product Launch Campaign", "Managed a successful product launch", "2 years", "Increased sales by 30%.");
        resume.addProject(project);

        // Add a reference
        Reference reference = new Reference("Emily Davis", "emily@example.com");
        resume.addReference(reference);

        // Add language proficiency
        Language language = new Language("German", LangProficiencyLevel.BEGINNER);
        resume.addLanguageProficiency(language);

        // Set summary
        resume.setSummary("Marketing manager with a track record of driving successful campaigns.");

        return resume;
    }
    // Helper method to create another dummy resume
    private static Resume createDummyResume4() {
        Resume resume = new Resume();

        // Create and set personal info
        PersonalInfo personalInfo = new PersonalInfo("David Brains", "123 Maple St", "dave@example.com", "555-987-6543", ContactMethod.PHONE);
        resume.setPersonalInfo(personalInfo);

        // Set career objective
        CareerObjective objective = new CareerObjective("Software Engineer");
        resume.setObjective(objective);

        // Add education
        Education education = new Education("University D", "Bachelor's in Computer Science", 2020);
        resume.addEducation(education);

        // Add work experience
        WorkExperience workExperience = new WorkExperience("Company X", "Software Developer", "2020-Present", "Developing web applications.");
        resume.addWorkExperience(workExperience);

        // Add skills
        Skill skill1 = new Skill("Java", ProficiencyLevel.EXPERT);
        Skill skill2 = new Skill("JavaScript", ProficiencyLevel.EXPERT);
        resume.addSkill(skill1);
        resume.addSkill(skill2);

        // Add a project
        Project project = new Project("E-commerce Website", "Built a fully functional e-commerce site", "2 years", "Increased online sales.");
        resume.addProject(project);

        // Add a reference
        Reference reference = new Reference("Jane Smith", "jane@example.com");
        resume.addReference(reference);

        // Add language proficiency
        Language language = new Language("Spanish", LangProficiencyLevel.INTERMEDIATE);
        resume.addLanguageProficiency(language);

        // Set summary
        resume.setSummary("Software engineer with expertise in web development.");

        return resume;
    }

    // Helper method to create another dummy resume
    private static Resume createDummyResume5() {
        Resume resume = new Resume();

        // Create and set personal info
        PersonalInfo personalInfo = new PersonalInfo("Mary Brown", "789 Pine St", "mary@example.com", "555-555-5555", ContactMethod.EMAIL);
        resume.setPersonalInfo(personalInfo);

        // Set career objective
        CareerObjective objective = new CareerObjective("Graphic Designer");
        resume.setObjective(objective);

        // Add education
        Education education = new Education("University E", "Bachelor's in Graphic Design", 2019);
        resume.addEducation(education);

        // Add work experience
        WorkExperience workExperience = new WorkExperience("Design Studio Y", "Graphic Designer", "2019-Present", "Creating visual content for clients.");
        resume.addWorkExperience(workExperience);

        // Add skills
        Skill skill1 = new Skill("Adobe Photoshop", ProficiencyLevel.EXPERT);
        Skill skill2 = new Skill("Illustrator", ProficiencyLevel.EXPERT);
        resume.addSkill(skill1);
        resume.addSkill(skill2);

        // Add a project
        Project project = new Project("Logo Redesign Project", "Redesigned company logos", "3 years", "Improved brand identity.");
        resume.addProject(project);

        // Add a reference
        Reference reference = new Reference("David Johnson", "david@example.com");
        resume.addReference(reference);

        // Add language proficiency
        Language language = new Language("French", LangProficiencyLevel.BEGINNER);
        resume.addLanguageProficiency(language);

        // Set summary
        resume.setSummary("Graphic designer specializing in branding and visual communication.");

        return resume;
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Resume Management System!");
            System.out.println("1. Job Applicant");
            System.out.println("2. Recruiter");
            System.out.println("3. Exit");
            System.out.print("Select your role: ");

            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (roleChoice) {
                case 1:
                    jobApplicantMenu();
                    break;
                case 2:
                    recruiterMenu();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private void jobApplicantMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nJob Applicant Menu:");
            System.out.println("1. Create a new resume");
            System.out.println("2. View list of resumes");
            System.out.println("3. Exit to main menu");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createNewResume(scanner);
                    break;
                case 2:
                    viewListOfResumes(scanner);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void recruiterMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nRecruiter Menu:");
            System.out.println("1. View list of resumes");
            System.out.println("2. Search resumes");
            System.out.println("3. Filter resumes by qualification");
            System.out.println("4. Sort resumes");
            System.out.println("5. Provide feedback on a resume");
            System.out.println("6. Exit to main menu");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewResumesForRecruiter(scanner);
                    //viewListOfResumesRecruiter(scanner);
                    break;
                case 2:
                    searchResumes(scanner);
                    break;
                case 3:
                    filterResumesByQualification(scanner);
                    break;
                case 4:
                    sortResumes(scanner);
                    break;
                case 5:
                    provideFeedbackForRecruiter(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }


    // User Story: Job Applicant - Create a new resume
    private void createNewResume(Scanner scanner) {
        // Create a new Resume object
        Resume newResume = new Resume();

        // Step 1: Enter Personal Information
        System.out.println("\nEnter Personal Information:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        // Create a PersonalInfo object and set the values
        PersonalInfo personalInfo = new PersonalInfo(fullName, address, email, phone, ContactMethod.EMAIL); // You can change the ContactMethod as needed
        newResume.setPersonalInfo(personalInfo);

        // Step 2: Set Career Objective
        System.out.print("\nEnter Career Objective: ");
        String objectiveStatement = scanner.nextLine();
        CareerObjective careerObjective = new CareerObjective(objectiveStatement);
        newResume.setObjective(careerObjective);

        // Step 3: Input Education Details
        boolean addMoreEducation = true;
        while (addMoreEducation) {
            System.out.println("\nEnter Education Details:");
            System.out.print("Institution Name: ");
            String institutionName = scanner.nextLine();
            System.out.print("Degree: ");
            String degree = scanner.nextLine();
            System.out.print("Graduation Year: ");
            int graduationYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Education education = new Education(institutionName, degree, graduationYear);
            newResume.addEducation(education);

            System.out.print("Do you want to add another education entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreEducation = addMore.equalsIgnoreCase("yes");
        }

        // Step 4: Input Work Experience
        boolean addMoreExperience = true;
        while (addMoreExperience) {
            System.out.println("\nEnter Work Experience Details:");
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Position: ");
            String position = scanner.nextLine();
            System.out.print("Duration: ");
            String duration = scanner.nextLine();
            System.out.print("Description: ");
            String description = scanner.nextLine();

            WorkExperience workExperience = new WorkExperience(companyName, position, duration, description);
            newResume.addWorkExperience(workExperience);

            System.out.print("Do you want to add another work experience entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreExperience = addMore.equalsIgnoreCase("yes");
        }

        // Step 5: Input Skills
        boolean addMoreSkills = true;
        while (addMoreSkills) {
            System.out.println("\nEnter Skill Details:");
            System.out.print("Skill Name: ");
            String skillName = scanner.nextLine();

            // Prompt for proficiency level
            System.out.println("Proficiency Levels:");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Advanced");
            System.out.print("Select Proficiency Level (1/2/3): ");
            int proficiencyChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            ProficiencyLevel proficiencyLevel;
            switch (proficiencyChoice) {
                case 1:
                    proficiencyLevel = ProficiencyLevel.BEGINNER;
                    break;
                case 2:
                    proficiencyLevel = ProficiencyLevel.INTERMEDIATE;
                    break;
                case 3:
                    proficiencyLevel = ProficiencyLevel.EXPERT;
                    break;
                default:
                    proficiencyLevel = ProficiencyLevel.INTERMEDIATE; // Default to intermediate
                    break;
            }

            Skill skill = new Skill(skillName, proficiencyLevel);
            newResume.addSkill(skill);

            System.out.print("Do you want to add another skill entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreSkills = addMore.equalsIgnoreCase("yes");
        }


        // Step 6: Input Projects
        boolean addMoreProjects = true;
        while (addMoreProjects) {
            System.out.println("\nEnter Project Details:");
            System.out.print("Project Name: ");
            String projectName = scanner.nextLine();
            System.out.print("Description: ");
            String projectDescription = scanner.nextLine();
            System.out.print("Duration: ");
            String projectDuration = scanner.nextLine();
            System.out.print("Achievement: ");
            String projectAchievement = scanner.nextLine();

            Project project = new Project(projectName, projectDescription, projectDuration, projectAchievement);
            newResume.addProject(project);

            System.out.print("Do you want to add another project entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreProjects = addMore.equalsIgnoreCase("yes");
        }

        // Step 7: Input Language Proficiency
        boolean addMoreLanguages = true;
        while (addMoreLanguages) {
            System.out.println("\nEnter Language Proficiency Details:");
            System.out.print("Language Name: ");
            String languageName = scanner.nextLine();

            // Prompt for proficiency level
            System.out.println("Proficiency Levels:");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Advanced");
            System.out.print("Select Proficiency Level (1/2/3): ");
            int proficiencyChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            LangProficiencyLevel proficiencyLevel;
            switch (proficiencyChoice) {
                case 1:
                    proficiencyLevel = LangProficiencyLevel.BEGINNER;
                    break;
                case 2:
                    proficiencyLevel = LangProficiencyLevel.INTERMEDIATE;
                    break;
                case 3:
                    proficiencyLevel = LangProficiencyLevel.EXPERT;
                    break;
                default:
                    proficiencyLevel = LangProficiencyLevel.INTERMEDIATE; // Default to intermediate
                    break;
            }

            Language language = new Language(languageName,proficiencyLevel);
            newResume.addLanguageProficiency(language);

            System.out.print("Do you want to add another language proficiency entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreLanguages = addMore.equalsIgnoreCase("yes");
        }


        // Step 8: Input References
        boolean addMoreReferences = true;
        while (addMoreReferences) {
            System.out.println("\nEnter Reference Details:");
            System.out.print("Name: ");
            String referenceName = scanner.nextLine();
            System.out.print("Contact Information: ");
            String contactInformation = scanner.nextLine();

            Reference reference = new Reference(referenceName, contactInformation);
            newResume.addReference(reference);

            System.out.print("Do you want to add another reference entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreReferences = addMore.equalsIgnoreCase("yes");
        }

        // Step 9: Input Summary or Cover Letter
        System.out.print("\nEnter Summary or Cover Letter: ");
        String summary = scanner.nextLine();
        newResume.setSummary(summary);

        // Step 10: Set Contact Preferences
        System.out.println("\nSet Contact Preferences:");
        System.out.println("1. Email");
        System.out.println("2. Phone");
        System.out.print("Select Contact Method: ");
        int contactChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ContactMethod contactMethod;
        switch (contactChoice) {
            case 1:
                contactMethod = ContactMethod.EMAIL;
                break;
            case 2:
                contactMethod = ContactMethod.PHONE;
                break;
            default:
                contactMethod = ContactMethod.EMAIL; // Default to email
                break;
        }
        personalInfo.setContactMethod(contactMethod);

        // Step 11: Save the Resume
        resumeSystem.addResume(newResume);
        System.out.println("\nYour resume has been created and saved successfully!");

        // You can display the created resume if needed
        newResume.displayResume();
    }


    // User Story: Job Applicant - View list of resumes
    private void viewListOfResumes(Scanner scanner) {
        ArrayList<Resume> resumes = resumeSystem.getAllResumes();

        if (resumes.isEmpty()) {
            System.out.println("You have no resumes to view.");
        } else {
            System.out.println("\nList of Your Resumes:");
            int index = 1;
            for (Resume resume : resumes) {
                System.out.println(index + ". " + resume.getPersonalInfo().getFullName());
                index++;
            }

            // Prompt to view, edit, delete, or go back
            System.out.println("\nOptions:");
            System.out.println("1. View a Resume");
            System.out.println("2. Edit a Resume");
            System.out.println("3. Delete a Resume");
            System.out.println("0. Go back to the previous menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    return; // Go back to the previous menu
                case 1:
                    System.out.print("Enter the number of the resume you want to view: ");
                    int viewChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (viewChoice >= 1 && viewChoice <= resumes.size()) {
                        Resume selectedResume = resumes.get(viewChoice - 1);
                        selectedResume.displayResume();

                        // Prompt to edit or go back
                        System.out.println("\nOptions:");
                        System.out.println("1. Edit this Resume");
                        System.out.println("0. Go back to the previous menu");
                        System.out.print("Enter your choice: ");

                        int editChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        switch (editChoice) {
                            case 0:
                                // Go back to the previous menu
                                break;
                            case 1:
                                // Allow editing after viewing
                                editResume(scanner, selectedResume);
                                break;
                            default:
                                System.out.println("Invalid choice. Returning to the previous menu.");
                                break;
                        }
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the number of the resume you want to edit: ");
                    int editChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (editChoice >= 1 && editChoice <= resumes.size()) {
                        Resume selectedResume = resumes.get(editChoice - 1);
                        editResume(scanner, selectedResume);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the number of the resume you want to delete: ");
                    int deleteChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (deleteChoice >= 1 && deleteChoice <= resumes.size()) {
                        Resume selectedResume = resumes.get(deleteChoice - 1);
                        deleteResume(scanner, selectedResume);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }



    // User Story: Job Applicant - Edit a resume


    // User Story: Job Applicant - Delete a resume
    private void deleteResume(Scanner scanner, Resume resume) {
        System.out.println("\nAre you sure you want to delete this resume? (yes/no): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            resumeSystem.deleteResume(resume);
            System.out.println("Resume deleted successfully.");
        } else {
            System.out.println("Resume not deleted.");
        }
    }

    // User Story: Job Applicant - Edit a resume
    private void editResume(Scanner scanner, Resume resume) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEdit Resume Menu:");
            System.out.println("1. Replace Personal Information");
            System.out.println("2. Replace Career Objective");
            System.out.println("3. Replace Education");
            System.out.println("4. Replace Work Experience");
            System.out.println("5. Replace Skills");
            System.out.println("6. Replace Projects");
            System.out.println("7. Replace Language Proficiency");
            System.out.println("8. Replace References");
            System.out.println("9. Replace Summary");
            System.out.println("10. Replace Contact Preferences");
            System.out.println("11. Go back to previous menu");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Edit Personal Information
                    editPersonalInformation(scanner, resume);
                    break;
                case 2:
                    // Edit Career Objective
                    editCareerObjective(scanner, resume);
                    break;
                case 3:
                    // Edit Education
                    editEducation(scanner, resume);
                    break;
                case 4:
                    // Edit Work Experience
                    editWorkExperience(scanner, resume);
                    break;
                case 5:
                    // Edit Skills
                    editSkills(scanner, resume);
                    break;
                case 6:
                    // Edit Projects
                    editProjects(scanner, resume);
                    break;
                case 7:
                    // Edit Language Proficiency
                    editLanguageProficiency(scanner, resume);
                    break;
                case 8:
                    // Edit References
                    editReferences(scanner, resume);
                    break;
                case 9:
                    // Edit Summary or Cover Letter
                    editSummary(scanner, resume);
                    break;
                case 10:
                    // Edit Contact Preferences
                    editContactPreferences(scanner, resume);
                    break;
                case 11:
                    exit = true; // Go back to the previous menu
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Implement methods to edit specific resume sections
    private void editPersonalInformation(Scanner scanner, Resume resume) {
        System.out.println("\nEdit Personal Information:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        // Create a new PersonalInfo object and set the values
        PersonalInfo personalInfo = new PersonalInfo(fullName, address, email, phone, ContactMethod.EMAIL);
        resume.setPersonalInfo(personalInfo);
        System.out.println("Personal Information updated successfully.");
    }

    private void editCareerObjective(Scanner scanner, Resume resume) {
        System.out.println("\nEdit Career Objective:");
        System.out.print("Enter new Career Objective: ");
        String objectiveStatement = scanner.nextLine();
        CareerObjective careerObjective = new CareerObjective(objectiveStatement);
        resume.setObjective(careerObjective);
        System.out.println("Career Objective updated successfully.");
    }

    private void editEducation(Scanner scanner, Resume resume) {
        // Create a new list of education items
        ArrayList<Education> newEducationList = new ArrayList<>();

        boolean addMoreEducation = true;
        while (addMoreEducation) {
            System.out.println("\nEnter Education Details:");
            System.out.print("Institution Name: ");
            String institutionName = scanner.nextLine();
            System.out.print("Degree: ");
            String degree = scanner.nextLine();
            System.out.print("Graduation Year: ");
            int graduationYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Education education = new Education(institutionName, degree, graduationYear);
            newEducationList.add(education);

            System.out.print("Do you want to add another education entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreEducation = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old education list with the new one
        resume.getEducationList().clear();
        resume.getEducationList().addAll(newEducationList);

        System.out.println("Education details updated successfully.");
    }


    private void editWorkExperience(Scanner scanner, Resume resume) {
        // Create a new list of work experience items
        ArrayList<WorkExperience> newWorkExperienceList = new ArrayList<>();

        boolean addMoreExperience = true;
        while (addMoreExperience) {
            System.out.println("\nEnter Work Experience Details:");
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Position: ");
            String position = scanner.nextLine();
            System.out.print("Duration: ");
            String duration = scanner.nextLine();
            System.out.print("Description: ");
            String description = scanner.nextLine();

            WorkExperience workExperience = new WorkExperience(companyName, position, duration, description);
            newWorkExperienceList.add(workExperience);

            System.out.print("Do you want to add another work experience entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreExperience = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old work experience list with the new one
        resume.getWorkExperienceList().clear();
        resume.getWorkExperienceList().addAll(newWorkExperienceList);

        System.out.println("Work experience details updated successfully.");
    }

    private void editSkills(Scanner scanner, Resume resume) {
        // Create a new list of skills
        ArrayList<Skill> newSkillsList = new ArrayList<>();

        boolean addMoreSkills = true;
        while (addMoreSkills) {
            System.out.println("\nEnter Skill Details:");
            System.out.print("Skill Name: ");
            String skillName = scanner.nextLine();

            // Prompt for proficiency level
            System.out.println("Proficiency Levels:");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Advanced");
            System.out.print("Select Proficiency Level (1/2/3): ");
            int proficiencyChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            ProficiencyLevel proficiencyLevel;
            switch (proficiencyChoice) {
                case 1:
                    proficiencyLevel = ProficiencyLevel.BEGINNER;
                    break;
                case 2:
                    proficiencyLevel = ProficiencyLevel.INTERMEDIATE;
                    break;
                case 3:
                    proficiencyLevel = ProficiencyLevel.EXPERT;
                    break;
                default:
                    proficiencyLevel = ProficiencyLevel.BEGINNER; // Default to Beginner
                    break;
            }

            Skill skill = new Skill(skillName, proficiencyLevel);
            newSkillsList.add(skill);

            System.out.print("Do you want to add another skill entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreSkills = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old skills list with the new one
        resume.getSkillsList().clear();
        resume.getSkillsList().addAll(newSkillsList);

        System.out.println("Skills updated successfully.");
    }
    private void editProjects(Scanner scanner, Resume resume) {
        // Create a new list of projects
        ArrayList<Project> newProjectsList = new ArrayList<>();

        boolean addMoreProjects = true;
        while (addMoreProjects) {
            System.out.println("\nEnter Project Details:");
            System.out.print("Project Name: ");
            String projectName = scanner.nextLine();
            System.out.print("Description: ");
            String projectDescription = scanner.nextLine();
            System.out.print("Duration: ");
            String projectDuration = scanner.nextLine();
            System.out.print("Achievement: ");
            String projectAchievement = scanner.nextLine();

            Project project = new Project(projectName, projectDescription, projectDuration, projectAchievement);
            newProjectsList.add(project);

            System.out.print("Do you want to add another project entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreProjects = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old projects list with the new one
        resume.getProjectsList().clear();
        resume.getProjectsList().addAll(newProjectsList);

        System.out.println("Projects updated successfully.");
    }

    private void editLanguageProficiency(Scanner scanner, Resume resume) {
        // Create a new list of language proficiencies
        ArrayList<Language> newLanguagesList = new ArrayList<>();

        boolean addMoreLanguages = true;
        while (addMoreLanguages) {
            System.out.println("\nEnter Language Proficiency Details:");
            System.out.print("Language Name: ");
            String languageName = scanner.nextLine();

            // Prompt for proficiency level
            System.out.println("Proficiency Levels:");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Advanced");
            System.out.print("Select Proficiency Level (1/2/3): ");
            int proficiencyChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            LangProficiencyLevel proficiencyLevel;
            switch (proficiencyChoice) {
                case 1:
                    proficiencyLevel = LangProficiencyLevel.BEGINNER;
                    break;
                case 2:
                    proficiencyLevel = LangProficiencyLevel.INTERMEDIATE;
                    break;
                case 3:
                    proficiencyLevel = LangProficiencyLevel.EXPERT;
                    break;
                default:
                    proficiencyLevel = LangProficiencyLevel.INTERMEDIATE; // Default to intermediate
                    break;
            }

            Language language = new Language(languageName,proficiencyLevel);
            newLanguagesList.add(language);

            System.out.print("Do you want to add another language proficiency entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreLanguages = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old language proficiencies list with the new one
        resume.getLanguagesList().clear();
        resume.getLanguagesList().addAll(newLanguagesList);

        System.out.println("Language proficiencies updated successfully.");
    }

    private void editReferences(Scanner scanner, Resume resume) {
        // Create a new list of references
        ArrayList<Reference> newReferencesList = new ArrayList<>();

        boolean addMoreReferences = true;
        while (addMoreReferences) {
            System.out.println("\nEnter Reference Details:");
            System.out.print("Reference Name: ");
            String referenceName = scanner.nextLine();
            System.out.print("Reference Contact: ");
            String referenceContact = scanner.nextLine();

            Reference reference = new Reference(referenceName, referenceContact);
            newReferencesList.add(reference);

            System.out.print("Do you want to add another reference entry? (yes/no): ");
            String addMore = scanner.nextLine();
            addMoreReferences = addMore.equalsIgnoreCase("yes");
        }

        // Replace the old references list with the new one
        resume.getReferencesList().clear();
        resume.getReferencesList().addAll(newReferencesList);

        System.out.println("References updated successfully.");
    }

    private void editSummary(Scanner scanner, Resume resume) {
        // Implement logic to edit the summary or cover letter
        System.out.println("\nEdit Summary or Cover Letter:");
        System.out.print("Enter new Summary or Cover Letter: ");
        String summary = scanner.nextLine();
        resume.setSummary(summary);
        System.out.println("Summary or Cover Letter updated successfully.");
    }

    private void editContactPreferences(Scanner scanner, Resume resume) {
        System.out.println("\nEdit Contact Preferences:");
        System.out.println("1. Email");
        System.out.println("2. Phone");
        System.out.print("Select Contact Method (1/2): ");
        int contactChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ContactMethod contactMethod;
        switch (contactChoice) {
            case 1:
                contactMethod = ContactMethod.EMAIL;
                break;
            case 2:
                contactMethod = ContactMethod.PHONE;
                break;
            default:
                contactMethod = ContactMethod.EMAIL; // Default to email
                break;
        }
        resume.getPersonalInfo().setContactMethod(contactMethod);
        System.out.println("Contact Preferences updated successfully.");
    }

    // User Story: Recruiter - View list of resumes

    private void viewResumesForRecruiter(Scanner scanner) {
        ArrayList<Resume> resumes = resumeSystem.getAllResumes();

        if (resumes.isEmpty()) {
            System.out.println("No resumes found.");
        } else {
            // Display a list of available resumes
            System.out.println("List of Resumes:");
            int index = 1;
            for (Resume resume : resumes) {
                System.out.println(index + ". " + resume.getPersonalInfo().getFullName());
                index++;
            }

            // Prompt the recruiter to choose a resume to view
            System.out.print("Enter the number of the resume to view (0 to go back): ");
            int resumeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (resumeChoice == 0) {
                return; // Go back to the previous menu
            } else if (resumeChoice >= 1 && resumeChoice <= resumes.size()) {
                Resume selectedResume = resumes.get(resumeChoice - 1);
                selectedResume.displayResume();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void provideFeedbackForRecruiter(Scanner scanner) {
        ArrayList<Resume> resumes = resumeSystem.getAllResumes();

        if (resumes.isEmpty()) {
            System.out.println("No resumes found.");
        } else {
            // Display a list of available resumes
            System.out.println("List of Resumes:");
            int index = 1;
            for (Resume resume : resumes) {
                System.out.println(index + ". " + resume.getPersonalInfo().getFullName());
                index++;
            }

            // Prompt the recruiter to choose a resume to provide feedback on
            System.out.print("Enter the number of the resume to provide feedback (0 to go back): ");
            int resumeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (resumeChoice == 0) {
                return; // Go back to the previous menu
            } else if (resumeChoice >= 1 && resumeChoice <= resumes.size()) {
                Resume selectedResume = resumes.get(resumeChoice - 1);
                provideFeedback(scanner, selectedResume);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void provideFeedback(Scanner scanner, Resume resume) {
        System.out.println("Provide feedback for the selected resume:");

        // Get feedback status from the user
        FeedbackStatus feedbackStatus = getFeedbackStatusFromUser(scanner);

        // Get feedback comment from the user
        System.out.print("Enter feedback comment: ");
        String feedbackComment = scanner.nextLine();

        // Create a new Feedback object
        Feedback feedback = new Feedback(feedbackStatus, feedbackComment);

        // Set the feedback for the resume
        resume.setFeedback(feedback);

        // Display the feedback details
        System.out.println("Feedback provided successfully:");
        feedback.displayFeedbackDetails();
    }

    private FeedbackStatus getFeedbackStatusFromUser(Scanner scanner) {
        FeedbackStatus feedbackStatus = null;
        while (feedbackStatus == null) {
            System.out.println("Select feedback status:");
            System.out.println("1. Shortlisted");
            System.out.println("2. Rejected");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    feedbackStatus = FeedbackStatus.SHORTLISTED;
                    break;
                case 2:
                    feedbackStatus = FeedbackStatus.REJECTED;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        return feedbackStatus;
    }

    // User Story: Recruiter - Search for resumes
    private void searchResumes(Scanner scanner) {
        System.out.print("Enter criteria for searching resumes: ");
        String searchCriteria = scanner.nextLine();

        ArrayList<Resume> matchingResumes = resumeSystem.searchResumes(searchCriteria);

        if (matchingResumes.isEmpty()) {
            System.out.println("No matching resumes found.");
        } else {
            System.out.println("Matching Resumes:");
            for (int i = 0; i < matchingResumes.size(); i++) {
                System.out.println((i + 1) + ". " + matchingResumes.get(i).getPersonalInfo().getFullName());
            }
        }
    }

    private void filterResumesByQualification(Scanner scanner) {
        System.out.print("Enter qualification to filter resumes: ");
        String qualification = scanner.nextLine();

        ArrayList<Resume> filteredResumes = resumeSystem.filterResumesByQualification(qualification);

        if (filteredResumes.isEmpty()) {
            System.out.println("No resumes with the specified qualification found.");
        } else {
            System.out.println("Resumes with the specified qualification:");
            for (int i = 0; i < filteredResumes.size(); i++) {
                System.out.println((i + 1) + ". " + filteredResumes.get(i).getPersonalInfo().getFullName());
            }
        }
    }

    private void sortResumes(Scanner scanner) {
        // Display sorting criteria options
        System.out.println("Sort Resumes by:");
        System.out.println("1. Years of Experience");
        System.out.println("2. Education Level");
        System.out.print("Enter your choice: ");

        int sortChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<Resume> sortedResumes = new ArrayList<>();

        switch (sortChoice) {
            case 1:
                sortedResumes = resumeSystem.sortResumes("Years of Experience");
                break;
            case 2:
                sortedResumes = resumeSystem.sortResumes("Education Level");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        if (sortedResumes.isEmpty()) {
            System.out.println("No resumes to display.");
        } else {
            System.out.println("Sorted Resumes:");
            for (int i = 0; i < sortedResumes.size(); i++) {
                System.out.println((i + 1) + ". " + sortedResumes.get(i).getPersonalInfo().getFullName());
            }
        }
    }


    // User Story: Recruiter - Provide feedback on a resume
    // Assuming you have a Resume class with a Feedback property and associated methods




    // Utility methods for input validation, error handling, and user prompts
}

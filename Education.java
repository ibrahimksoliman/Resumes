public class Education {

    // Instance variables to store the education details.
    private String institutionName;
    private String degree;
    private int graduationYear;

    // Constructor using 'this' keyword to initialize the instance variables.
    public Education(String institutionName, String degree, int graduationYear) {
        this.institutionName = institutionName;
        this.degree = degree;
        this.graduationYear = graduationYear;
    }

    // Setter method for institutionName.
    public void setInstitutionName(String institutionName) {
        if (institutionName != null && !institutionName.trim().isEmpty()) {
            this.institutionName = institutionName;
        } else {
            System.out.println("Error: Invalid institution name.");
        }
    }

    // Setter method for degree.
    public void setDegree(String degree) {
        if (degree != null && !degree.trim().isEmpty()) {
            this.degree = degree;
        } else {
            System.out.println("Error: Invalid degree.");
        }
    }

    // Setter method for graduationYear.
    public void setGraduationYear(int graduationYear) {
        if (graduationYear > 1900 && graduationYear <= java.time.Year.now().getValue() + 6) { // Assuming an upper limit for expected graduation.
            this.graduationYear = graduationYear;
        } else {
            System.out.println("Error: Invalid graduation year.");
        }
    }

    // Getter method for institutionName.
    public String getInstitutionName() {
        return institutionName;
    }

    // Getter method for degree.
    public String getDegree() {
        return degree;
    }

    // Getter method for graduationYear.
    public int getGraduationYear() {
        return graduationYear;
    }

    // Method to display the education details.
    public void displayEducationDetails() {
        System.out.printf("Institution: %s\nDegree: %s\nGraduation Year: %d\n", institutionName, degree, graduationYear);
    }
}

public class WorkExperience {

    // Instance variables to store work experience details.
    private String companyName;
    private String position;
    private String duration;
    private String description;
    // Inside the WorkExperience class



    // Constructor using 'this' keyword to initialize the instance variables.
    public WorkExperience(String companyName, String position, String duration, String description) {
        this.companyName = companyName;
        this.position = position;
        this.duration = duration;
        this.description = description;
    }

    // Setter method for companyName.
    public void setCompanyName(String companyName) {
        if (companyName != null && !companyName.trim().isEmpty()) {
            this.companyName = companyName;
        } else {
            System.out.println("Error: Invalid company name.");
        }
    }

    // Setter method for position.
    public void setPosition(String position) {
        if (position != null && !position.trim().isEmpty()) {
            this.position = position;
        } else {
            System.out.println("Error: Invalid position.");
        }
    }

    // Setter method for duration.
    public void setDuration(String duration) {
        if (duration != null && !duration.trim().isEmpty()) {
            this.duration = duration;
        } else {
            System.out.println("Error: Invalid duration.");
        }
    }

    // Setter method for description.
    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        } else {
            System.out.println("Error: Invalid description.");
        }
    }

    // Getter method for companyName.
    public String getCompanyName() {
        return companyName;
    }

    // Getter method for position.
    public String getPosition() {
        return position;
    }

    // Getter method for duration.
    public String getDuration() {
        return duration;
    }

    // Getter method for description.
    public String getDescription() {
        return description;
    }

    public int getYearsOfExperience() {
        try {
            String[] years = duration.split("-"); // Split the duration string at the hyphen
            int startYear = Integer.parseInt(years[0].trim());
            int endYear = Integer.parseInt(years[1].trim());
            return endYear - startYear + 1; // Adding 1 to include both the start and end years
        } catch (Exception e) {
            System.out.println("Error parsing duration: " + duration);
            return 0; // Default to 0 if there's an error parsing the duration string
        }
    }
    //    Returns the number of years of the work experience.
    //    Assumes duration is in the format "YYYY-YYYY".

    // Method to display work experience details.
    public void displayWorkExperienceDetails() {
        System.out.printf("Company: %s\nPosition: %s\nDuration: %s\nDescription: %s\n",
                companyName, position, duration, description);
    }
}

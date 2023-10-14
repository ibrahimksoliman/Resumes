public class Reference {

    // Instance variables to store reference details.
    private String name;
    private String contactInformation;
        // Constructor using 'this' keyword to initialize the instance variables.
    public Reference(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }

    // Setter method for the name of the reference person.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid reference name.");
        }
    }

    // Setter method for the contact information of the reference person.
    public void setContactInformation(String contactInformation) {
        if (contactInformation != null && !contactInformation.trim().isEmpty()) {
            this.contactInformation = contactInformation;
        } else {
            System.out.println("Error: Invalid contact information.");
        }
    }

    // Getter method for the name of the reference person.
    public String getName() {
        return name;
    }

    // Getter method for the contact information of the reference person.
    public String getContactInformation() {
        return contactInformation;
    }

    // Method to display reference details.
    public void displayReferenceDetails() {
        System.out.printf("Reference Name: %s\nContact Information: %s\n", name, contactInformation);
    }
}

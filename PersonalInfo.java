enum ContactMethod {
    EMAIL, PHONE
}

public class PersonalInfo {
    // Instance variables for storing personal information.
    private String name;
    private String email;
    private String phone;
    private String address;
    private ContactMethod contactMethod;

    // Constructor using 'this' keyword to initialize instance variables.
    public PersonalInfo(String name, String address, String email, String phone, ContactMethod contactMethod) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.contactMethod = contactMethod;
    }

    // Getter and Setter methods for each instance variable.

    public String getFullName() {
        return name;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // Basic validation before setting the address.
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Error: Invalid address.");
        }
    }

    public ContactMethod getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(ContactMethod contactMethod) {
        // Ensure the contact method provided is valid.
        if (contactMethod != null) {
            this.contactMethod = contactMethod;
        } else {
            System.out.println("Error: Invalid contact method.");
        }
    }

    // Method to display the personal information.
    public void displayInfo() {
        System.out.printf("Name: %s\nEmail: %s\nPhone: %s\nAddress: %s\nPreferred Contact Method: %s\n",
                name, email, phone, address, contactMethod);
    }
}

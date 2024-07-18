package avivItzhaki.model;

public class UserRegistration {

    private String fullName;
    private String email;
    private Long phoneNumber;
    private String subject;

    public UserRegistration() {
    }

    public UserRegistration(String fullName, String email, Long phoneNumber, String subject) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

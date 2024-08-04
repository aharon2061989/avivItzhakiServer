package avivItzhaki.model;

public class TaxRefundCheckForm {
    private String salary;
    private String partnerSalary;
    private String cashWithdrawal;
    private String jobChange;
    private String babyBirth;
    private String capitalMarketLose;
    private String unemployed;
    private String divorceAndPayFoods;
    private String taxPaid;
    private String fullName;
    private Long phoneNumber;
    private String email;
    private boolean agreeToContact;

    public TaxRefundCheckForm() {
    }

    public TaxRefundCheckForm(String salary, String partnerSalary, String cashWithdrawal, String jobChange, String babyBirth, String capitalMarketLose, String unemployed, String divorceAndPayFoods, String taxPaid, String fullName, Long phoneNumber, String email, boolean agreeToContact) {
        this.salary = salary;
        this.partnerSalary = partnerSalary;
        this.cashWithdrawal = cashWithdrawal;
        this.jobChange = jobChange;
        this.babyBirth = babyBirth;
        this.capitalMarketLose = capitalMarketLose;
        this.unemployed = unemployed;
        this.divorceAndPayFoods = divorceAndPayFoods;
        this.taxPaid = taxPaid;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.agreeToContact = agreeToContact;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPartnerSalary() {
        return partnerSalary;
    }

    public void setPartnerSalary(String partnerSalary) {
        this.partnerSalary = partnerSalary;
    }

    public String getCashWithdrawal() {
        return cashWithdrawal;
    }

    public void setCashWithdrawal(String cashWithdrawal) {
        this.cashWithdrawal = cashWithdrawal;
    }

    public String getJobChange() {
        return jobChange;
    }

    public void setJobChange(String jobChange) {
        this.jobChange = jobChange;
    }

    public String getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(String babyBirth) {
        this.babyBirth = babyBirth;
    }

    public String getCapitalMarketLose() {
        return capitalMarketLose;
    }

    public void setCapitalMarketLose(String capitalMarketLose) {
        this.capitalMarketLose = capitalMarketLose;
    }

    public String getUnemployed() {
        return unemployed;
    }

    public void setUnemployed(String unemployed) {
        this.unemployed = unemployed;
    }

    public String getDivorceAndPayFoods() {
        return divorceAndPayFoods;
    }

    public void setDivorceAndPayFoods(String divorceAndPayFoods) {
        this.divorceAndPayFoods = divorceAndPayFoods;
    }

    public String getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(String taxPaid) {
        this.taxPaid = taxPaid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreeToContact() {
        return agreeToContact;
    }

    public void setAgreeToContact(boolean agreeToContact) {
        this.agreeToContact = agreeToContact;
    }
}

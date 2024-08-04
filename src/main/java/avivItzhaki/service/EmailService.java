package avivItzhaki.service;

import jakarta.mail.MessagingException;

public interface EmailService {

    void sendEmail(String to, String subject, String text);

    void sendTaxCheckFormEmail(String salary, String partnerSalary, String cashWithdrawal, String jobChange,
                               String babyBirth, String capitalMarketLose, String unemployed, String divorceAndPayFoods,
                               String taxPaid, String fullName, Long phoneNumber, String email, boolean agreeToContact) throws MessagingException;
}


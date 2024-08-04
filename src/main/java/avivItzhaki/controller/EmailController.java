package avivItzhaki.controller;

import avivItzhaki.model.TaxRefundCheckForm;
import avivItzhaki.model.UserRegistration;
import avivItzhaki.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;
    @CrossOrigin()
    @PostMapping("/register")
    public void registerUser(@RequestBody UserRegistration userRegistration) {
        String emailBody = String.format("Name: %s\nEmail: %s\nPhone: %s\nSubject: %s",
                userRegistration.getFullName(),
                userRegistration.getEmail(),
                userRegistration.getPhoneNumber(),
                userRegistration.getSubject());
        emailService.sendEmail("avivtaxes@gmail.com", "משתמש חדש נרשם אשר זקוק לשיחה חזרה לבירור פרטים נוספים", emailBody);
    }

    @CrossOrigin()
    @PostMapping("/taxCheckForm")
    public void sendTaxCheckFormEmail(@RequestBody TaxRefundCheckForm taxRefundCheckForm) throws MessagingException {
        emailService.sendTaxCheckFormEmail(
                taxRefundCheckForm.getSalary(),
                taxRefundCheckForm.getPartnerSalary(),
                taxRefundCheckForm.getCashWithdrawal(),
                taxRefundCheckForm.getJobChange(),
                taxRefundCheckForm.getBabyBirth(),
                taxRefundCheckForm.getCapitalMarketLose(),
                taxRefundCheckForm.getUnemployed(),
                taxRefundCheckForm.getDivorceAndPayFoods(),
                taxRefundCheckForm.getTaxPaid(),
                taxRefundCheckForm.getFullName(),
                taxRefundCheckForm.getPhoneNumber(),
                taxRefundCheckForm.getEmail(),
                taxRefundCheckForm.isAgreeToContact()
        );
    }
}

package avivItzhaki.controller;

import avivItzhaki.model.UserRegistration;
import avivItzhaki.service.EmailService;
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
        emailService.sendEmail("avivtaxes@gmail.com", "משתמש חדש נרשם", emailBody);
    }
}

package avivItzhaki.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    JavaMailSender mailSender;
    @Override
    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    @Override
    public void sendTaxCheckFormEmail(
            String salary,
            String partnerSalary,
            String cashWithdrawal,
            String jobChange,
            String babyBirth,
            String capitalMarketLose,
            String unemployed,
            String divorceAndPayFoods,
            String taxPaid,
            String fullName,
            Long phoneNumber,
            String email,
            boolean agreeToContact) throws MessagingException {

        String messageText = String.format(
                "שכר חודשי: %s\n" +
                        "שכר בן/בת הזוג: %s\n" +
                        "משיכת כספים: %s\n" +
                        "החלפת עבודות: %s\n" +
                        "לידת ילד/ילדה: %s\n" +
                        "הפסדים בשוק ההון: %s\n" +
                        "תקופה ללא תעסוקה: %s\n" +
                        "גירושין ותשלום מזונות: %s\n" +
                        "שולם מס הכנסה: %s\n" +
                        "שם מלא: %s\n" +
                        "טלפון: %d\n" +
                        "אימייל: %s\n" +
                        "הסכים ליצירת קשר: %b\n",
                salary, partnerSalary, cashWithdrawal, jobChange, babyBirth, capitalMarketLose,
                unemployed, divorceAndPayFoods, taxPaid, fullName, phoneNumber, email, agreeToContact
        );

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo("ahron2061989@gmail.com");
        helper.setSubject("בקשה חדשה לבדיקת זכאות להחזר מס");
        helper.setText(messageText, true); // אם אתה שולח HTML, שנה ל-true את הפרמטר השני
        mailSender.send(message);
    }


}

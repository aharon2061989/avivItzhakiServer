package avivItzhaki.service;

import avivItzhaki.model.TaxRefundCheckForm;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);


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
    public void sendTaxCheckFormEmail(TaxRefundCheckForm taxRefundCheckForm) throws MessagingException {

        System.out.println(taxRefundCheckForm);

        StringBuilder emailContent = new StringBuilder();
        emailContent.append("<html><body>");
        emailContent.append("<h2>בקשה חדשה לבדיקת זכאות להחזר מס</h2>");
        emailContent.append("<table style='border-collapse: collapse; width: 100%;' border='1'>");
        emailContent.append("<tr><th style='padding: 8px; text-align: right;'>שדה</th><th style='padding: 8px; text-align: right;'>פרטים</th></tr>");
        emailContent.append("<tr><td>שכר חודשי</td><td>").append(taxRefundCheckForm.getSalary()).append("</td></tr>");
        emailContent.append("<tr><td>שכר בן/בת הזוג</td><td>").append(taxRefundCheckForm.getPartnerSalary()).append("</td></tr>");
        emailContent.append("<tr><td>משיכת כספים</td><td>").append(taxRefundCheckForm.getCashWithdrawal()).append("</td></tr>");
        emailContent.append("<tr><td>החלפת עבודות</td><td>").append(taxRefundCheckForm.getJobChange()).append("</td></tr>");
        emailContent.append("<tr><td>לידת ילד/ילדה</td><td>").append(taxRefundCheckForm.getBabyBirth()).append("</td></tr>");
        emailContent.append("<tr><td>הפסדים בשוק ההון</td><td>").append(taxRefundCheckForm.getCapitalMarketLose()).append("</td></tr>");
        emailContent.append("<tr><td>תקופה ללא תעסוקה</td><td>").append(taxRefundCheckForm.getUnemployed()).append("</td></tr>");
        emailContent.append("<tr><td>גירושין ותשלום מזונות</td><td>").append(taxRefundCheckForm.getDivorceAndPayFoods()).append("</td></tr>");
        emailContent.append("<tr><td>שולם מס הכנסה</td><td>").append(taxRefundCheckForm.getTaxPaid()).append("</td></tr>");
        emailContent.append("<tr><td>שם מלא</td><td>").append(taxRefundCheckForm.getFullName()).append("</td></tr>");
        emailContent.append("<tr><td>טלפון</td><td>").append(taxRefundCheckForm.getPhoneNumber()).append("</td></tr>");
        emailContent.append("<tr><td>אימייל</td><td>").append(taxRefundCheckForm.getEmail()).append("</td></tr>");
        emailContent.append("<tr><td>הסכים ליצירת קשר</td><td>").append(taxRefundCheckForm.isAgreeToContact() ? "כן" : "לא").append("</td></tr>");
        emailContent.append("</table>");
        emailContent.append("</body></html>");

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo("avivtaxes@gmail.com");
        helper.setSubject("בקשה חדשה לבדיקת זכאות להחזר מס");
        helper.setText(emailContent.toString(), true);

        System.out.println(message);
        System.out.println(taxRefundCheckForm);
        logger.info("taxRefundCheckForm: {}", taxRefundCheckForm);

        mailSender.send(message);
    }



}

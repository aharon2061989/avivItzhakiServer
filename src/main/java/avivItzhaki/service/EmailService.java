package avivItzhaki.service;

import avivItzhaki.model.TaxRefundCheckForm;
import jakarta.mail.MessagingException;

public interface EmailService {

    void sendEmail(String to, String subject, String text);


    void sendTaxCheckFormEmail(TaxRefundCheckForm taxRefundCheckForm) throws MessagingException;
}


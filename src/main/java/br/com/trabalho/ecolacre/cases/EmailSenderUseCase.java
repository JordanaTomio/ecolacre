package br.com.trabalho.ecolacre.cases;

public interface EmailSenderUseCase {
    void sendEmail(String toEmail, String subject, String body);
}

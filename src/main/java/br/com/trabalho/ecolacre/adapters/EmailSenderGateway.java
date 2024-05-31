package br.com.trabalho.ecolacre.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author tadorno
 */
public class SendEmailUtil {

    private SendEmailUtil() {
    }

    private static final String TO = PropertySingleton.getProperty("mail-to");
    private static final String FROM = PropertySingleton.getProperty("mail-from");
    private static final String USERNAME = PropertySingleton.getProperty("mail-username");
    private static final String PASSWORD = PropertySingleton.getProperty("mail-password");
    private static final String HOST = PropertySingleton.getProperty("mail-host");
    private static final String PORT = PropertySingleton.getProperty("mail-port");

    public static void enviar(String subject, String html) {
        Properties props = getProperties();

        Session session = getSession(props);

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(FROM));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(TO));

            // Set Subject: header field
            message.setSubject(subject);

            // Send the actual HTML message, as big as you like
            message.setContent(html, "text/html");

            // Send message
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);

        return props;
    }

    private static Session getSession(Properties props) {

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        return session;
    }
}

package com.groupware.erp.mail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class NoticeMailService {
    @Autowired
    JavaMailSender mailSender; // 등록했던 Bean

    // 메일 내용 작성
    public MimeMessage createMessage(String to) throws MessagingException, UnsupportedEncodingException {
//		System.out.println("보내는 대상 : " + to);
//		System.out.println("인증 번호 : " + ePw);

        MimeMessage message = mailSender.createMimeMessage();

        message.addRecipients(MimeMessage.RecipientType.TO, to);// 보내는 대상
        message.setSubject("GoodJob 회원가입 이메일 인증");// 제목

        String msg = "";
        msg += "<div style='margin:100px;'>";
        msg += "<h1> 안녕하세요 </h1>";
        msg += "<h1> 그룹웨어 프로젝트 입니다 </h1>";
        msg += "</div>";
        message.setText(msg, "utf-8", "html");// 내용, charset 타입, subtype
        // 보내는 사람의 이메일 주소, 보내는 사람 이름
        message.setFrom(new InternetAddress("klarnuri@naver.com", "그룹웨어 담당자"));// 보내는 사람

        return message;
    }

    // 메일 발송
    // sendSimpleMessage 의 매개변수로 들어온 to 는 곧 이메일 주소가 되고,
    // MimeMessage 객체 안에 내가 전송할 메일의 내용을 담는다.

    public String sendSimpleMessage(String to) throws Exception {

        MimeMessage message = createMessage(to); // 메일 발송
        try {// 예외처리
            mailSender.send(message);
        } catch (MailException es) {
            es.printStackTrace();
            throw new IllegalArgumentException();
        }
        return to;
    }
}

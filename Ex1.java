package com.exam;

import javax.mail.SendFailedException;

import org.apache.commons.mail.SimpleEmail;

public class Ex1 {

	public static void main(String[] args) {
		//메일 전송기능 라이브러리 준비
		
		//SMTP(Send mail transfer protocol)
		
		//Javamail
		//-> mail-1.4.7.jar
		
		//commonsEmail
		//->commons-email-1.5.jar

		//JAF(Java Activation Framework)
		//-> activation-1.1.1.jar
		
		//SimpleEmail class : sending text
		
		//multiparts email class : text + add file
		// EmailAttachment class
		
		//HtmlEmail class : html form
		
		//이메일 전송용 protocol SMTP 사용
		//smtp.naver.com
		//smtp.google.com
		
		//SMTP 서버포트 : 기본퐅 465(SSL)또는 587(TLS)
		
		//SMTP 서버 계정정보 : 로그인 할 아이디, 패스워드
		
		//
		SimpleEmail email = new SimpleEmail();
		//SMTP 서버 연결 설정
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthentication("leahchoi33", "Password33@");
		
		
		//SMTP SSL, TLS  TJFWJD
		email.setSSLOnConnect(true);
		email.setStartTLSEnabled(true);
		
		String result="fail";
		try {
			//보내는사람 설정
			email.setFrom("leahchoi33@gmail.com" , "admin", "utf-8");
			//받는사람
			email.addTo("leahyseol@gmail.com", "Leah", "utf-8");
			email.addTo("leahchoi33@gmail.com", "Leah", "utf-8");
			//받는사람(참조인) 설정

			
			//제목 설정
			email.setSubject("subject");
			//본문 설정
			email.setMsg("msg.\n msg2\n");
			
			email.send();
			
			//메일 전송
			result  = email.send();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("result: " + result);
		
		
	}//main

}

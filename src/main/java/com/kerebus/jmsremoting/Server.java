package com.kerebus.jmsremoting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(new String[]{"serverContext.xml", "sharedContext.xml"});
	}
}

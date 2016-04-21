package me.t.stydy.junit.demo1;

import java.util.Date;

import org.apache.log4j.Logger;


public class LogTest {
	private static Logger log=Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		log.info("LogTest main"+new Date());
	}

}

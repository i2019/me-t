package me.t.stydy.spring.demo1.impl;

import java.util.Date;

import me.t.stydy.spring.demo1.Hello;

public class HelloImpl implements Hello {
	private String msg;
	public HelloImpl() {
	
	}
	public HelloImpl(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String sayHi() {
		
		return "当前时间:"+new Date()+" , msg:"+msg;
	}

}

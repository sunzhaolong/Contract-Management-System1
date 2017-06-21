package com.ruanko.model;

import java.util.Date;


public class Log {
	
	private int id;			    //ID
	private int userId;			//���� id
	private String content;		//��־��Ϣ
	private Date time;			//����ʱ��
	private int del;			//ɾ��״̬
	

	public Log(){
		this.id = 0;
		this.userId = 0;
		this.content = "";
		this.time = new Date();
		this.del = 0;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
	
}
package com.ruanko.model;

import java.util.Date;

public class Contract {
	private int id; 			//ID
	private int userId; 		// �û� id
	private String customer; 	// �ͻ�r
	private String num; 		// ��ͬ��
	private String name; 		// ��ͬ����
	private Date beginTime; 	// ��ʼʱ��
	private Date endTime; 		// ����ʱ��
	private String content; 	// ��ͬ����
	private int del; 			// ɾ��״̬

	
	public Contract() {
		this.id = 0;
		this.userId = 0;
		this.customer = "";
		this.num = "";
		this.name = "";
		this.beginTime = new Date();
		this.endTime = new Date();
		this.content = "";
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

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
}

package com.ruanko.model;

import java.util.Date;


public class ConState {
	
	private int id;			    //ID 
	private int conId;			// ��ͬ id
	private int type;			//��������
	private Date time;			// ����ʱ��
	private int del;			//ɾ��״̬
	
	
	public ConState(){
		this.id = 0;
		this.conId = 0;
		this.type = 0;
		this.time = new Date();
		this.del = 0;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

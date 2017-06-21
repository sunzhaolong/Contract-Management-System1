package com.ruanko.model;

import java.util.Date;


public class ConProcess {

	private int id;			    //ID
	private int conId;			// 合同id
	private int userId;			// 用户 id
	private int type;			//操作类型
	private int state;			// 状态
	private String content;		// 操作内容
	private Date time;			// 操作时间
	private int del;			// 删除状态
	
	
	public ConProcess(){
		this.id = 0;
		this.conId = 0;
		this.userId = 0;
		this.type = 0;
		this.state = 0;
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

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
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

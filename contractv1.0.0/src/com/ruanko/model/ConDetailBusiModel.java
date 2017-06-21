package com.ruanko.model;

import java.util.Date;


public class ConDetailBusiModel {
	private int id; 			//ID
	private String draftsman; 	//��ǩ��Ա
	private String customer; 	//�ͻ�
	private String num; 		//��ͬ��
	private String name; 		//��ͬ����
	private Date beginTime; 	//��ʼʱ��
	private Date endTime; 		//����ʱ��
	private String content; 	//��ͬ����
	private int del; 			//״̬

	
	public ConDetailBusiModel() {
		this.id = 0;
		this.draftsman = "";
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

	public String getDraftsman() {
		return draftsman;
	}

	public void setDraftsman(String draftsman) {
		this.draftsman = draftsman;
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

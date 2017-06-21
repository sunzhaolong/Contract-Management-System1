package com.ruanko.model;


public class Function {
	
	private int id;			    //ID
	private String num;			//�������
	private String name;		//��������
	private String url;			//·��
	private String description;	//����
	private int del;			//ɾ��״̬

	public Function(){
		this.id = 0;
		this.num = "";
		this.name = "";
		this.url = "";
		this.description = "";
		this.del = 0;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
}

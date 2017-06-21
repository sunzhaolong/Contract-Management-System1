package com.ruanko.model;


public class Role {
	
	private int id;			    //ID
	private String name;		//��ɫ��
	private String description;	//����
	private String funcIds;		//�������
	private int del;			//ɾ��״̬
	

	public Role() {
		this.id = 0;
		this.name = "";
		this.description = "";
		this.funcIds = "";
		this.del = 0;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFuncIds() {
		return funcIds;
	}

	public void setFuncIds(String funcIds) {
		this.funcIds = funcIds;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
	
}

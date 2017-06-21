package com.ruanko.model;


public class Right {
	
	private int id;			    //ID
	private int userId;			//�û� id
	private int roleId;			//��ɫ id
	private String description; //����
	private int del;			//ɾ��״̬
	
	
	public Right() {
		this.id = 0;
		this.userId = 0;
		this.roleId = 0;
		this.description = "";
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

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

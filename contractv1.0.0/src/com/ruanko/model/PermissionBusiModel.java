package com.ruanko.model;


public class PermissionBusiModel {

	private int userId;			//用户 id
	private int roleId;			//角色 id
	private String userName;	//用户名
	private String roleName;	//角色名 
	
	
	public PermissionBusiModel(){
		this.userId = 0;
		this.roleId = 0;
		this.userName = "";
		this.roleName = "";
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}

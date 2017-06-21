package com.ruanko.model;


public class User {

	private int id;			    //ID
	private String name;		//ÓÃ»§Ãû
	private String password;	//ÃÜÂë
	private int del;			//É¾³ý×´Ì¬

	public User(){
		this.id = 0;
		this.name = "";
		this.password = "";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

}

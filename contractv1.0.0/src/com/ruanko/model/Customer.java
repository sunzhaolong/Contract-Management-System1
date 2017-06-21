package com.ruanko.model;


public class Customer {

	private int id;			    //ID
	private String num;			//�ͻ����
	private String name;		//�ͻ���
	private String address;		//�ͻ���ַ
	private String tel;			//�ͻ�����
	private String fax;			//�ͻ�����
	private String code;		//�ͻ��ʱ�
	private String bank;		//�˻�����
	private String accout;		//�˻����
	private int del;			//ɾ��״̬
	
	
	public Customer(){
		this.id = 0;
		this.num = "";
		this.name = "";
		this.address = "";
		this.tel = "";
		this.fax = "";
		this.code = "";
		this.bank = "";
		this.accout = "";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccout() {
		return accout;
	}

	public void setAccout(String accout) {
		this.accout = accout;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
}

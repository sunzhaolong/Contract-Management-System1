package com.ruanko.model;

/**
 * Countersign opinion entity class
 */
public class CSignatureOpinion {

	private int conId; 			// 合同 id
	private String csOperator; 	// 会签操作人员
	private String opinion;		// 会签内容

	public CSignatureOpinion() {
		this.conId = 0;
		this.csOperator = "";
		this.opinion = "";
	}


	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public String getCsOperator() {
		return csOperator;
	}

	public void setCsOperator(String csOperator) {
		this.csOperator = csOperator;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
}

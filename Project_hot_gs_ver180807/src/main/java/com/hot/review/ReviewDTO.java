package com.hot.review;

import java.sql.Date;

public class ReviewDTO {

	private Integer r_num;
	private Integer g_num;
	private String email;
	private String contents;
	private Date reg_date;
	private Integer ref;
	private Integer step;
	private Integer depth;
	
	private String nickname;
	private String fname;

	public Integer getR_num() {
		return r_num;
	}

	public void setR_num(Integer r_num) {
		this.r_num = r_num;
	}

	public Integer getG_num() {
		return g_num;
	}

	public void setG_num(Integer g_num) {
		this.g_num = g_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public Integer getRef() {
		return ref;
	}

	public void setRef(Integer ref) {
		this.ref = ref;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	

}

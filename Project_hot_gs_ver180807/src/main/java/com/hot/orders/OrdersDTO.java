package com.hot.orders;

import java.sql.Date;

public class OrdersDTO {

	private Integer o_num;
	private String email;
	private Integer g_num;
	private Date o_date;
	private Integer status;

	public Integer getO_num() {
		return o_num;
	}

	public void setO_num(Integer o_num) {
		this.o_num = o_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getG_num() {
		return g_num;
	}

	public void setG_num(Integer g_num) {
		this.g_num = g_num;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}

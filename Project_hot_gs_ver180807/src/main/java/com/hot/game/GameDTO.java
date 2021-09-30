package com.hot.game;

import java.sql.Date;
import java.sql.Timestamp;

public class GameDTO {

	private Integer g_num;
	private String g_name;
	private Double price;
	private String g_info;
	private String developer;
	private String publisher;
	private String genre;
	private Date g_date;
	private Integer grade;
	private Integer downcnt;
	private Integer sale;
	private Timestamp saleStartDate;
	private Timestamp saleEndDate;
	private String saleStatus;
	private String recommend;
	private String steamAppId;

	private String fname;
	private Integer o_num;
	private Date o_date;

	public Integer getG_num() {
		return g_num;
	}

	public void setG_num(Integer g_num) {
		this.g_num = g_num;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getG_info() {
		if (g_info == null) {
			g_info = "";
		}
		return g_info;
	}

	public void setG_info(String g_info) {
		this.g_info = g_info;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getG_date() {
		return g_date;
	}

	public void setG_date(Date g_date) {
		this.g_date = g_date;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getDowncnt() {
		return downcnt;
	}

	public void setDowncnt(Integer downcnt) {
		this.downcnt = downcnt;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}

	public Timestamp getSaleStartDate() {
		return saleStartDate;
	}

	public void setSaleStartDate(Timestamp saleStartDate) {
		this.saleStartDate = saleStartDate;
	}

	public Timestamp getSaleEndDate() {
		return saleEndDate;
	}

	public void setSaleEndDate(Timestamp saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public String getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getSteamAppId() {
		return steamAppId;
	}

	public void setSteamAppId(String steamAppId) {
		this.steamAppId = steamAppId;
	}

	public Integer getO_num() {
		return o_num;
	}

	public void setO_num(Integer o_num) {
		this.o_num = o_num;
	}

}

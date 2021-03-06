package com.teamrun.runbike.ownbadge.domain;

public class MyBadge {

	private int b_num; //뱃지 고유 번호
	private String b_name; //뱃지명
	private String b_photo; //뱃지사진
	private String cb_photo; //뱃지흑백사진
	private int serial;
	
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_photo() {
		return b_photo;
	}
	public void setB_photo(String b_photo) {
		this.b_photo = b_photo;
	}
	public String getCb_photo() {
		return cb_photo;
	}
	public void setCb_photo(String cb_photo) {
		this.cb_photo = cb_photo;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	@Override
	public String toString() {
		return "MyBadge [b_num=" + b_num + ", b_name=" + b_name + ", b_photo=" + b_photo + ", cb_photo=" + cb_photo
				+ ", serial=" + serial + "]";
	}
	
	
}

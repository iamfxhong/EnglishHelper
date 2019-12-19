package com.eh.entity;

import java.io.Serializable;

public class User  implements Serializable{
	private static final long serialVersionUID = 1L;
	private int uid;
	private String createTime;
	private String password;
	private String nickname;
	private String truename;
	private String headImgUrl;
	private int age;
	private int status;
	private String mobile;
	private String email;
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", createTime=" + createTime + ", password=" + password + ", nickname=" + nickname
				+ ", truename=" + truename + ", headImgUrl=" + headImgUrl + ", age=" + age + ", status=" + status
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	public User() {
		super();
	}
	public User(int uid, String createTime, String password, String nickname, String truename, String headImgUrl,
			int age, int status, String mobile, String email) {
		super();
		this.uid = uid;
		this.createTime = createTime;
		this.password = password;
		this.nickname = nickname;
		this.truename = truename;
		this.headImgUrl = headImgUrl;
		this.age = age;
		this.status = status;
		this.mobile = mobile;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}



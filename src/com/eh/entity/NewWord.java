package com.eh.entity;

import java.io.Serializable;

public class NewWord implements Serializable{
	
	private Integer uid;//用户id
	private Integer id;//单词id
	
	private String englishWord;//英语单词
	private String pa;//英标
	private String chineseWord;//中文释义
	private String englishInstance1;//英文例句
	private String chineseInstance1;//中文例句翻译
	private String englishInstance2;
	private String chineseInstance2;
	private Integer collect;
	private String pron;//发音
	
	
	public NewWord() {
		super();
	}
	public NewWord(Integer uid, Integer id, String englishWord, String pa, String chineseWord, String englishInstance1,
			String chineseInstance1, String englishInstance2, String chineseInstance2, Integer collect, String pron) {
		super();
		this.uid = uid;
		this.id = id;
		this.englishWord = englishWord;
		this.pa = pa;
		this.chineseWord = chineseWord;
		this.englishInstance1 = englishInstance1;
		this.chineseInstance1 = chineseInstance1;
		this.englishInstance2 = englishInstance2;
		this.chineseInstance2 = chineseInstance2;
		this.collect = collect;
		this.pron = pron;
	}
	@Override
	public String toString() {
		return "NewWord [uid=" + uid + ", id=" + id + ", englishWord=" + englishWord + ", pa=" + pa + ", chineseWord="
				+ chineseWord + ", englishInstance1=" + englishInstance1 + ", chineseInstance1=" + chineseInstance1
				+ ", englishInstance2=" + englishInstance2 + ", chineseInstance2=" + chineseInstance2 + ", collect="
				+ collect + ", pron=" + pron + "]";
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEnglishWord() {
		return englishWord;
	}
	public void setEnglishWord(String englishWord) {
		this.englishWord = englishWord;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	public String getChineseWord() {
		return chineseWord;
	}
	public void setChineseWord(String chineseWord) {
		this.chineseWord = chineseWord;
	}
	public String getEnglishInstance1() {
		return englishInstance1;
	}
	public void setEnglishInstance1(String englishInstance1) {
		this.englishInstance1 = englishInstance1;
	}
	public String getChineseInstance1() {
		return chineseInstance1;
	}
	public void setChineseInstance1(String chineseInstance1) {
		this.chineseInstance1 = chineseInstance1;
	}
	public String getEnglishInstance2() {
		return englishInstance2;
	}
	public void setEnglishInstance2(String englishInstance2) {
		this.englishInstance2 = englishInstance2;
	}
	public String getChineseInstance2() {
		return chineseInstance2;
	}
	public void setChineseInstance2(String chineseInstance2) {
		this.chineseInstance2 = chineseInstance2;
	}
	public Integer getCollect() {
		return collect;
	}
	public void setCollect(Integer collect) {
		this.collect = collect;
	}
	public String getPron() {
		return pron;
	}
	public void setPron(String pron) {
		this.pron = pron;
	}
	
	
}



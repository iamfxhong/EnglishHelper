package com.eh.entity;

import java.io.Serializable;
/**
 * 基本类，单词
 * @author fxh
 */
public class Word implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String englishWord;//英语单词
	private String pa;//英标
	private String chineseWord;//中文释义
	private String englishInstance1;//英文例句
	private String chineseInstance1;//中文例句翻译
	private String englishInstance2;
	private String chineseInstance2;
	private int collect;
	private String pron;//发音
	
	
	@Override
	public String toString() {
		return englishWord + ", " + pa + "," + chineseWord
				+ "," + englishInstance1 + ", " + chineseInstance1
				+ ", " + englishInstance2 + "," + chineseInstance2 + ","
				+ collect + "," + pron;
	}
	
	
	public Word(int id, String englishWord, String pa, String chineseWord, String englishInstance1, String chineseInstance1,
			String englishInstance2, String chineseInstance2, int collect, String pron) {
		super();
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

	
	public Word() {
		super();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
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
	public int getCollect() {
		return collect;
	}
	public void setCollect(int collect) {
		this.collect = collect;
	}
	public String getPron() {
		return pron;
	}
	public void setPron(String pron) {
		this.pron = pron;
	}
	
	
}



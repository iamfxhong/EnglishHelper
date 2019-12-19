package com.eh.service;

import java.util.List;

import com.eh.dao.WordDao;
import com.eh.entity.NewWord;
import com.eh.entity.PageBean;
import com.eh.entity.User;
import com.eh.entity.Word;

public interface WordService {
	
	public PageBean<Word> findByPage(Integer currPage);

	public void save(NewWord newWord);
	
	public PageBean<NewWord> findByPageAndName(Integer currPage,Integer id);

	public Word findWordById(int id);

	public void deleteWordByID(NewWord newWord);

	public NewWord findNewWordById(int id);
	
}



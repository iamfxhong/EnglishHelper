package com.eh.dao;

import java.util.List;

import com.eh.entity.NewWord;
import com.eh.entity.Word;

public interface WordDao {
	
	int findCount() ;
	
	int findCountOfNewWord(int id);
	
	List<Word> findByPage(int begin, int pageSize);

	void save(NewWord newWord);

	List findByPageAndName(int begin, int pageSize,Integer id);

	Word findWordById(int id);

	void deleteWordById(NewWord newWord);

	NewWord findNewWordById(int id);

}



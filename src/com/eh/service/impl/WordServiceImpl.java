package com.eh.service.impl;

import java.util.List;

import com.eh.dao.WordDao;
import com.eh.entity.NewWord;
import com.eh.entity.PageBean;
import com.eh.entity.Word;
import com.eh.service.WordService;

public class WordServiceImpl  implements WordService {
	private WordDao wordDao;

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

	public PageBean<Word> findByPage(Integer currPage) {
		
		// TODO Auto-generated method stub
		  PageBean<Word> pageBean = new PageBean<Word>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 20;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = wordDao.findCount();
	        pageBean.setTotalCount(totalCount);
	        // 封装页数
	        int totalPage;
	        if(totalCount%pageSize==0){
	        	totalPage = totalCount/pageSize;
	        }else{
	        	totalPage = totalCount/pageSize + 1; 
	        }
	        pageBean.setTotalPage(totalPage);
	        // 封装当前页记录
	        int begin= (currPage - 1)*pageSize;
	        List<Word> list = wordDao.findByPage(begin, pageSize);
	        
	        pageBean.setList(list);
			return pageBean;
	}

	@Override
	public void save(NewWord newWord) {
		// TODO Auto-generated method stub
		wordDao.save(newWord);
	}

	@Override
	public PageBean<NewWord> findByPageAndName(Integer currPage,Integer id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  PageBean<NewWord> pageBean = new PageBean<NewWord>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 20;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = wordDao.findCountOfNewWord(id);
	        pageBean.setTotalCount(totalCount);
	        // 封装页数
	        int totalPage;
	        if(totalCount%pageSize==0){
	        	totalPage = totalCount/pageSize;
	        }else{
	        	totalPage = totalCount/pageSize + 1; 
	        }
	        pageBean.setTotalPage(totalPage);
	        // 封装当前页记录
	        int begin= (currPage - 1)*pageSize;
	        List list = wordDao.findByPageAndName(begin, pageSize,id);
	        
	        pageBean.setList(list);
			return pageBean;
	}

	@Override
	public Word findWordById(int id) {
		// TODO Auto-generated method stub
		return wordDao.findWordById(id);
	}

	@Override
	public void deleteWordByID(NewWord newWord) {
		// TODO Auto-generated method stub
		wordDao.deleteWordById(newWord);
	}

	@Override
	public NewWord findNewWordById(int id) {
		// TODO Auto-generated method stub
		return wordDao.findNewWordById(id);
	}
	
}



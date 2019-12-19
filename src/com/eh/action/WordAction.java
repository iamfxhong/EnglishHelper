package com.eh.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.bind.annotation.PathVariable;

import com.eh.entity.NewWord;
import com.eh.entity.PageBean;
import com.eh.entity.User;
import com.eh.entity.Word;
import com.eh.service.WordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class WordAction extends ActionSupport implements ModelDriven<Word>{

	private Word word = new Word();
	private NewWord newWord = new NewWord();
	private List<Integer> list = new ArrayList();
	private WordService wordService;

	
	public List<Integer> getList() {
		return list;
	}

	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	// 当前页数
		private Integer currPage = 1;
		public void setCurrPage(Integer currPage) {
			this.currPage = currPage;
		}
		
		/**
		 * 分页查询单词
		 * @return
		 */
		public String findAll(){
			PageBean<Word> pageBean = wordService.findByPage(currPage);
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "findAll";
		}
		


		/**
		 * 加入生词
		 * 
		 */
		public String save() {
			
			User user = (User) ActionContext.getContext().getSession().get("existUser");
			if(user==null) {
				list.add(0);
				return "ajax";
			}
			NewWord newword = wordService.findNewWordById(word.getId());
			if(newword!=null) {
				list.add(2);
				return "ajax";
			}
			Word wordInfo = wordService.findWordById(word.getId());
			newWord.setId(word.getId());
			newWord.setUid(user.getUid());
			newWord.setChineseInstance1(wordInfo.getChineseInstance1());
			newWord.setChineseInstance2(wordInfo.getChineseInstance2());
			newWord.setChineseWord(wordInfo.getChineseWord());
			newWord.setCollect(wordInfo.getCollect());
			newWord.setEnglishInstance1(wordInfo.getEnglishInstance1());
			newWord.setEnglishInstance2(wordInfo.getEnglishInstance2());
			newWord.setEnglishWord(wordInfo.getEnglishWord());
			newWord.setPa(wordInfo.getPa());
			newWord.setPron(wordInfo.getPron());
			wordService.save(newWord);
			list.add(1);
			return "ajax";
		}
		/**
		 * 遍历某人的生词
		 */
		public String getNewWord() {
			User user = (User) ActionContext.getContext().getSession().get("existUser");
			if(user==null) {
				return "loginPage";
			}
			PageBean<NewWord> pageBean = wordService.findByPageAndName(currPage,user.getUid());
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "findAllNew";
		}
		/**
		 * 删除生词表中的单词
		 *并刷新
		 */
		public String delete() {
			NewWord deNewWord = new NewWord();
			User user = (User) ActionContext.getContext().getSession().get("existUser");
			Word deword = wordService.findWordById(word.getId());
			deNewWord.setId(word.getId());
			deNewWord.setUid(user.getUid());
			deNewWord.setChineseInstance1(deword.getChineseInstance1());
			deNewWord.setChineseInstance2(deword.getChineseInstance2());
			deNewWord.setChineseWord(deword.getChineseWord());
			deNewWord.setCollect(deword.getCollect());
			deNewWord.setEnglishInstance1(deword.getEnglishInstance1());
			deNewWord.setEnglishInstance2(deword.getEnglishInstance2());
			deNewWord.setEnglishWord(deword.getEnglishWord());
			deNewWord.setPa(deword.getPa());
			deNewWord.setPron(deword.getPron());
			wordService.deleteWordByID(deNewWord);
			return "ajax";
		}
	@Override
	public Word getModel() {
		// TODO Auto-generated method stub
		return word;
	}
	
}



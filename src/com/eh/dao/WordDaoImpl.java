package com.eh.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.eh.entity.NewWord;
import com.eh.entity.Word;



public class WordDaoImpl extends HibernateDaoSupport implements WordDao {
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from Word";
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		System.out.println(list);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public int findCountOfNewWord(int id) {
		// TODO Auto-generated method stub
		String hql="select count(*) from NewWord where uid="+id;
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		System.out.println(list);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}
	public List<Word> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Word.class);
		List<Word> list = (List<Word>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public void save(NewWord newWord) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().save(newWord);
	}

	@Override
	public List findByPageAndName(int begin, int pageSize,Integer id) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(NewWord.class);
		criteria.add(Restrictions.eq("uid", id));
		List list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	public Word findWordById(int id) {
		String hql="from Word where id="+id;
		List list = this.getHibernateTemplate().find(hql);
		System.out.println(list);
		if(list.size()>0){
			return (Word) list.get(0);
		}
		return null;
	}

	@Override
	public void deleteWordById(NewWord newWord) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(newWord);
	}

	@Override
	public NewWord findNewWordById(int id) {
		// TODO Auto-generated method stub
		String hql="from NewWord where id="+id;
		List list = this.getHibernateTemplate().find(hql);
		System.out.println(list);
		if(list.size()>0){
			return (NewWord) list.get(0);
		}
		return null;
	}
}



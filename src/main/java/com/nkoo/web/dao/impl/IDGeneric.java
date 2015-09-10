package com.nkoo.web.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nkoo.web.dao.DGeneric;

public class IDGeneric<Model, PK extends Serializable> implements DGeneric<Model,PK>{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<Model> clazz = null;//This is a Problem
	
	@SuppressWarnings("unchecked")
	public IDGeneric(){
	    ParameterizedType pt = 	(ParameterizedType) this.getClass().getGenericSuperclass();//获取当前new 的对象的泛型的父类
	    this.clazz=(Class<Model>) pt.getActualTypeArguments()[0];  //获取第一个类型参数的真实类型
	}
	
	protected Session getSession(){
		Session session  = sessionFactory.getCurrentSession();
		if(session==null){
			session = sessionFactory.openSession();
		}
		return session;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public Model merge(Model model) {
		return (Model)getSession().merge(model);
	}

	@Override
	public Long save(Model model) {
		return (Long)getSession().save(model);
	}

	@Override
	public void update(Model model) {
		getSession().update(model);
	}

	@Override
	public void delete(PK id) {
		Model entity = find(id);
		if(entity!=null){
			getSession().delete(entity);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Model find(PK id) {
		if(id==null){
			return null;
		}else{
			return (Model) getSession().get(clazz,id);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Model> findByIds(PK[] ids) {
		if(ids==null||ids.length<1){
			return Collections.EMPTY_LIST;
		}else{
			return getSession().createQuery(
					"FROM "+clazz.getSimpleName()+" Where id IN (:ids)")
					.setParameterList("ids", ids)
					.list();
		}
	}

	@Override
	public Query getQuery(StringBuffer hql) {
		return getSession().createQuery(hql.toString());
	}



}

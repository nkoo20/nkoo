package com.nkoo.web.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

public interface DGeneric<Model, PK extends Serializable> {

	Model merge(Model model);
	
    Long save(Model model);

    void update(Model model);
    
    void delete(PK id);
    
    Model find(PK id);
    
    List<Model> findByIds(PK[] ids);
    
    Query getQuery(StringBuffer hql);

}

package com.nkoo.core.generic;

import java.io.Serializable;
import java.util.List;

import com.nkoo.web.dao.DGeneric;


public abstract class ISGeneric<Model, PK extends Serializable> implements SGeneric<Model, PK> {
	
	
	public abstract DGeneric<Model, PK> getDao();
	
	@Override
	public void save(Model model) {
		getDao().save(model);
	}

	@Override
	public void update(Model model) {
		getDao().update(model);
	}

	@Override
	public void delete(PK id) {
		getDao().delete(id);
	}

	@Override
	public Model find(PK id) {
		return getDao().find(id);
	}

	@Override
	public List<Model> findByIds(PK[] ids) {
		return getDao().findByIds(ids);
	}

	
}

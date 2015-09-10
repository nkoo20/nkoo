package com.nkoo.web.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.nkoo.web.dao.DRole;
import com.nkoo.web.model.NRole;

@Repository("iDRole")
public class IDRole extends IDGeneric<NRole, Long> implements DRole{

	@Override
	public List<NRole> findByUserId(Long userId) {
		return null;
	}
}
package com.nkoo.web.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.nkoo.web.dao.DPermission;
import com.nkoo.web.model.NPermission;

@Repository("iDPermission")
public class IDPermission extends IDGeneric<NPermission, Long> implements DPermission{

	@Override
	public List<NPermission> findByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}


}
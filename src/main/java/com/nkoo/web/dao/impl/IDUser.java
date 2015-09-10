package com.nkoo.web.dao.impl;


import org.springframework.stereotype.Repository;

import com.nkoo.web.dao.DUser;
import com.nkoo.web.model.NUser;

@Repository("iDUser")
public class IDUser extends IDGeneric<NUser, Long> implements DUser{
	
	@Override
	public NUser findUserByStrPhoneOrEmailOrUsername(String str) {
		StringBuffer hql = new StringBuffer();
		hql.append(" from NUser");
		hql.append(" where username = :str or phone = :str or email = :str");
		return (NUser)getQuery(hql).setString("str", str).uniqueResult();
	}



}
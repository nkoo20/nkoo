package com.nkoo.web.dao;


import com.nkoo.web.model.NUser;

public interface DUser extends DGeneric<NUser, Long> {
	
	//根据手机号或邮箱或帐号查询
	NUser findUserByStrPhoneOrEmailOrUsername(String str);
}
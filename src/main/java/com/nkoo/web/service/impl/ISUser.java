package com.nkoo.web.service.impl;


import org.springframework.stereotype.Service;

import com.nkoo.core.entity.UserException;
import com.nkoo.core.util.MD5Utils;
import com.nkoo.web.model.NUser;
import com.nkoo.web.service.SUser;

@Service("iSUser")
public class ISUser extends ISCommon implements SUser {

	@Override
	public NUser login(String str) {
		NUser user = dUser.findUserByStrPhoneOrEmailOrUsername(str);
		if(user == null){
			throw new UserException("用户不存在");
		}
		return null;
	}

	@Override
	public NUser adminLogin(String str,String password) {
		if(str == null || str.trim().length() == 0){
			throw new UserException("用户名不能为空");
		}else if(password == null || password.trim().length() == 0){
			throw new UserException("密码不能为空");
		}
		NUser user = dUser.findUserByStrPhoneOrEmailOrUsername(str);
		if(user == null){
			throw new UserException("用户不存在");
		}
		if(!user.getPassword().equals(MD5Utils.encodeThreeMD5(password))){
			throw new UserException("用户名或密码不正确");
		}
		return new NUser(user.getId());
	}
	
	
}

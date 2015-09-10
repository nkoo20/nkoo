package com.nkoo.web.service;

import com.nkoo.web.model.NUser;


public interface SUser{
	NUser login(String str);
	
	NUser adminLogin(String str,String password);
}

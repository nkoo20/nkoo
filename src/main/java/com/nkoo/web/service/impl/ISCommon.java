package com.nkoo.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.nkoo.web.dao.DPermission;
import com.nkoo.web.dao.DRole;
import com.nkoo.web.dao.DUser;

public class ISCommon {
	@Autowired
	protected DUser dUser;
	@Autowired
	protected DRole dRole;
	@Autowired
	protected DPermission dPermission;
}

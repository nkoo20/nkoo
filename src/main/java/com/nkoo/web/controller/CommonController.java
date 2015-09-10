package com.nkoo.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nkoo.web.service.SUser;

/**
 * 公共视图控制器
 **/
@Controller
public class CommonController {
	
	 @Autowired
	 protected SUser sUser;
}
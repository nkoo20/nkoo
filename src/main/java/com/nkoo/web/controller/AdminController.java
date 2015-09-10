package com.nkoo.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nkoo.core.entity.Result;
import com.nkoo.core.entity.UserException;




@Controller
@RequestMapping("admin")
public class AdminController extends CommonController{
	private final transient Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(){
		log.info("进入管理员登录页面");
		return new ModelAndView("admin/adminLogin");
	}
	@RequestMapping("adminIndex")
	public ModelAndView adminIndex(){
		log.info("进入管理员界面");
		return new ModelAndView("admin/index");
	}
	@RequestMapping("adminRole")
	public ModelAndView adminRole(){
		log.info("进入管理员角色权限管理");
		return new ModelAndView("admin/role");
	}
	
	@RequestMapping(value="adminLogin",method=RequestMethod.POST)
	public @ResponseBody Object adminLogin(@RequestParam String username,@RequestParam String password,HttpServletResponse response){
		Result result = new Result();
		try {
//			sUser.adminLogin(username, password);
		} catch (UserException e) {
			result.setMessage(e.getMessage());
			result.setSuccess(false);
		} catch (Exception e) {
			result.setMessage("系统异常");
			result.setSuccess(false);
			e.printStackTrace();
		}
		return result;
	}
}

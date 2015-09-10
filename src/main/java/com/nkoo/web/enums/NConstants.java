package com.nkoo.web.enums;

import com.nkoo.core.generic.EGeneric;


public class NConstants {
	//数据状态
	public enum Status implements EGeneric {
		valid{
			public String getValue(){return "1";}
			public String getText() {return "正常";}
		},
		delete{
			public String getValue(){return "D";}
			public String getText() {return "删除";}
		};
    }
	//平台角色
	public enum Role implements EGeneric {
		admin{
			public String getValue(){return "admin";}
			public String getText() {return "管理员";}
		},
		user{
			public String getValue(){return "user";}
			public String getText() {return "用户";}
		};
    }
	
}

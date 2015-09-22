/**   
* @Title: UserAction.java 
* @Package com.awei.eshop.modules.user.web.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author awei  
* @date Sep 21, 2015 12:22:32 AM 
* @version V1.0   
*/
package com.awei.eshop.modules.user.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.awei.eshop.common.base.BaseAction;
import com.awei.eshop.modules.user.service.UserService;

/** 
 * @ClassName: UserAction 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 21, 2015 12:22:32 AM 
 */
@Controller
@Namespace("/user")
@ParentPackage(value = "ssh2-default")
public class UserAction extends BaseAction {
	
	@Autowired
	private UserService userService;
	
	private String usermsg;

	/**
	 * @param usermsg the usermsg to set
	 */
	public void setUsermsg(String usermsg) {
		this.usermsg = usermsg;
	}

	/**
	 * @return the usermsg
	 */
	public String getUsermsg() {
		return usermsg;
	}
	
	@Action("list")
	public String find() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>    ??????   >>>>>>>>>>>>>>>>>>>>>>>>>>");
		usermsg = userService.find();
		System.out.println("??????????????????????????    ??????   >>>>>>>>>>>>>>>>>>>>>>>>>>");
		return SUCCESS;
	}
	
	@Action("add")
	public String add() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>    ??????   >>>>>>>>>>>>>>>>>>>>>>>>>>");
		usermsg = userService.find();
		System.out.println("??????????????????????????    ??????   >>>>>>>>>>>>>>>>>>>>>>>>>>");
		return SUCCESS;
	}
}

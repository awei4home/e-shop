/**   
* @Title: HelloAction.java 
* @Package com.awei.eshop.modules.hello.web.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author awei  
* @date Sep 21, 2015 10:32:47 PM 
* @version V1.0   
*/
package com.awei.eshop.modules.hello.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.awei.eshop.common.base.BaseAction;
import com.awei.eshop.modules.hello.service.HelloService;

/** 
 * @ClassName: HelloAction 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 21, 2015 10:32:47 PM 
 */
@Controller
@Namespace("/hello")
@ParentPackage(value = "ssh2-default")
public class HelloAction extends BaseAction {
	@Autowired
	private HelloService helloService;
	
	private String msg;
	
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	@Action("hello_list")
	public String helloList() {
		msg = helloService.sayHello();
		System.out.println("??????????????????");
		return SUCCESS;
	}
}

/**   
* @Title: ShowFormAction.java 
* @Package com.awei.eshop.web.action.tests 
* @Description: TODO(用一句话描述该文件做什么) 
* @author awei  
* @date Sep 19, 2015 12:44:03 AM 
* @version V1.0   
*/
package com.awei.eshop.web.action.tests;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import com.awei.eshop.service.HelloService;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * @ClassName: ShowFormAction 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 19, 2015 12:44:03 AM 
 */
@Controller
public class ShowFormAction extends ActionSupport {
	@Autowired
	private HelloService helloService;
	
	private String message;
	

	public String getMessage() {
		return message;
	}


	/**
	* @Title: *************************   showForm   *************************
	* @author: awei
	* @Description: TODO(他的action是在struts.xml中配置的，根路径默认为"/",所以本action的访问路径为：/tests, 他的访问路径为：)
	* @param @return    参数名称
	* @return String    返回类型
	* @throws
	 */
	@Action("showForm")
	public String showForm() {
		message = helloService.sayHello();
		return SUCCESS;
	}
}

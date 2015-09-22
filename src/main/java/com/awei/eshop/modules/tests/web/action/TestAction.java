/**   
* @Title: TestAction.java 
* @Package com.awei.eshop.modules.tests.web.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author awei  
* @date Sep 21, 2015 2:37:57 PM 
* @version V1.0   
*/
package com.awei.eshop.modules.tests.web.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.awei.eshop.common.base.BaseAction;
import com.awei.eshop.modules.tests.service.TestService;


@Controller
@Namespace("/tests")
@ParentPackage(value = "ssh2-default")
public class TestAction extends BaseAction {
	@Autowired
	private TestService testService;
	

	private String testmsg;
	

	public String getTestmsg() {
		return testmsg;
	}

	public void setTestmsg(String testmsg) {
		this.testmsg = testmsg;
	}


	@Action("mytest01")
	public String test01() {
		testmsg = testService.testResult();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>     test01    >>>>>>>>>>>>>>>>>");
		return SUCCESS;
	}
	
	
	@Action("mytest02")
	public String test02() {
		testmsg = testService.testResult();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>     test02    >>>>>>>>>>>>>>>>>");
		return SUCCESS;
	}
	
}

/**   
* @Title: HelloServiceImpl.java 
* @Package com.awei.eshop.modules.hello.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author awei  
* @date Sep 21, 2015 10:40:22 PM 
* @version V1.0   
*/
package com.awei.eshop.modules.hello.service.impl;

import org.springframework.stereotype.Service;

import com.awei.eshop.modules.hello.service.HelloService;

/** 
 * @ClassName: HelloServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 21, 2015 10:40:22 PM 
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "你好 ，hello测试成功";
	}

}

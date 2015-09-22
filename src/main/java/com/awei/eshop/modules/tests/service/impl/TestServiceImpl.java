package com.awei.eshop.modules.tests.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.awei.eshop.modules.tests.service.TestService;

/** 
 * @ClassName: TestServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 21, 2015 2:59:12 PM 
 */
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String testResult() {
		System.out.println("-------------------------------->>>>>>>>>>>>>   testResult ");
		return "测试分包成功了。。。。。。。。。。。。。。。";
	}

}

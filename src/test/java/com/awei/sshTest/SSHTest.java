package com.awei.sshTest;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @ClassName: SSHTest 
* @Description: TODO(这里用一句话描述这个类的作用:测试ssh框架的搭建) 
* @author 刘亚伟
* @Copyright  伟佳科技有限责任公司
* @date 2015 Aug 25, 2015 11:37:23 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_test.xml")
public class SSHTest {
	@Resource
	private Date date;
	/**
	* @Title: *************************   add   *************************
	* @author: awei
	* @Description: TODO(测试spring的搭建，用spring构建一个date对象，打印，如果打印成功，说明整合spring成功)
	* @param @param id
	* @param @param name    参数名称
	* @return void    返回类型
	* @throws
	 */
	@Test
	public void testDate() {
		System.out.println(date);
	}
}

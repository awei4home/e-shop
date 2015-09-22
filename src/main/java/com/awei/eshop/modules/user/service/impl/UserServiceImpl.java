package com.awei.eshop.modules.user.service.impl;

import org.springframework.stereotype.Service;

import com.awei.eshop.modules.user.service.UserService;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 20, 2015 8:23:12 PM 
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String find() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>    ??????   >>>>>>>>>>>>>>>>>>>>>>>>>>");
		return "很帅气，分包测试成功。。。。。。。。。。。。。。。。";
	}

}

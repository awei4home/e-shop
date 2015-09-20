package com.awei.eshop.service.impl;

import org.springframework.stereotype.Service;

import com.awei.eshop.service.HelloService;

/** 
 * @ClassName: HelloServieImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 刘亚伟
 * @Copyright  伟佳科技有限责任公司
 * @date 2015 Sep 20, 2015 3:37:07 PM 
 */
@Service
public class HelloServieImpl implements HelloService {

	@Override
	public String sayHello() {
		return "<body style=\"text-align:center\"></br></br></br></br></br></br></br></br>"
				+ "<div style=\"margin:0 auto;border:5px; border-color:black;width=400px;height:300px;\">你好，测试者！spring+sturts整合后返回的字符串"
				+ "</br>（直接从serviceImpl中拿的字符串，以后所有的数据通过serviceImpl从"
				+ "</br>dao中获取返回给前台）。。。。。。。。</div>"
				+ "</body>";
	}

}

package com.lagou.domain;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * desc:
 *
 * @author tengfei wang
 * @version 1.0
 * @date Created in 3/9/2020
 */
public class UserBeanTest {

    @Test
    public void getId() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"}, true, null);
		UserBean userBean = (UserBean) applicationContext.getBean("userBean");
		System.out.println(userBean);
		Integer id = userBean.getId();
		System.out.println(id);
	}

    @Test
    public void getUsername() {
    }
}
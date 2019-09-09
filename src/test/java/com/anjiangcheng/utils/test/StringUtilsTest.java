package com.anjiangcheng.utils.test;

import org.junit.Test;

import com.anjiangcheng.common.utils.StringUtils;

public class StringUtilsTest {
	
	
	/**
	 * 测试isBlank
	 */
	@Test
	public void isBlank() {
		boolean blank = StringUtils.isBlank("asdsa");
		System.out.println(blank);
	}
	
	/**
	 * toHtml测试
	 */
	@Test
	public void toHtmlTest() {
		String html = StringUtils.toHtml("9月5日一大早，又有了新情况\n");
		System.out.println(html);
	}
	
	/**
	 * 测试isPhoneasd
	 */
	@Test
	public void isPhone() {
		boolean phone = StringUtils.isPhone("13628442658");
		System.out.println(phone);
	}
	
	
	/**
	 * 测绘isEmail
	 */
	@Test
	public void isEmail() {
		boolean email = StringUtils.isEmail("asd@sad.com");
		System.out.println(email);
	}
	
	
	
}

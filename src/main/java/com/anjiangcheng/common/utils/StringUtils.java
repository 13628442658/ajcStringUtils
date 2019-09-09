package com.anjiangcheng.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	
	/**
	 * 判断传入的字符串不能为空，空格也是没值
	 */
	public static boolean isBlank(String str) {
		if(str!=null &&str!=""&&str.trim().length()>0) {
			return true;
			
		}
		return false;
	}
	

	/**
	 * 
		* 方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
		* 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
		* 使用场景：网页文本框传到后台的字符串就可能就会回车换行。
	 */
	public static String toHtml(String str) {
		StringBuffer buffer = new StringBuffer();
		String[] split = str.split("(\n\r)");
		for (String string : split) {
			buffer.append("<p>");
			buffer.append(string);
			string.replace("(\r)", "<br/>");
			buffer.append("</p>");
		}
		
		return buffer.toString();
		
	}
	
	/**
	 * 测试StringUtils工具类中的是否为中国地区手机号码isPhone()工具方法
	 */
	
	public static boolean isPhone(String str) {
		boolean blank = isBlank(str);
		if(!blank) {
			return false;
			
		}
		
		Pattern compile = Pattern.compile("^1[3|4|5|8][0-9]\\d{8}$");
		Matcher matcher = compile.matcher(str);
		if(matcher.matches()) {
			
			return true;
		}
		
		return false;
		
	}
	
	
	/**
	 * 测试StringUtil工具类中的是否为邮箱isEmail()工具方法
	 */
	
	public static boolean isEmail(String str) {
		boolean blank = isBlank(str);
		if(!blank) {
			return false;
			
		}
		
		Pattern compile = Pattern.compile("^([a-zA-Z0-9]+)@([a-zA-Z]+)\\.([a-zA-Z]{2,})$");
		Matcher matcher = compile.matcher(str);
		if(matcher.matches()) {
			
			return true;
		}
		return false;
		
	}
	
	
}

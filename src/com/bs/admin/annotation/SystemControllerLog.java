package com.bs.admin.annotation;

import java.lang.annotation.*;


/**  

* <p>Title: SystemControllerLog</p>  

* <p>Description: 用来进行control 层日志的注解</p>  

* @author 王顺坤  

* <p> @date 2018年12月9日</p>   

*/ 
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemControllerLog {
	/**
	 * 描述业务操作 例:Xxx管理-执行Xxx操作
	 * @return
	 */
	String description() default "";
	/** 操作类型
	 * 1，登陆与注销
	 *	2.数据库操作
	 * 3.日志操作
	 * 0.未知
	 * -1.错误
	 * */ 
	int type() default 0;
}

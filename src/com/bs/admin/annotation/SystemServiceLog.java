package com.bs.admin.annotation;
import java.lang.annotation.*; 

/**  

* <p>Title: SystemServiceLog</p>  

* <p>Description: service 的日志注解</p>  

* @author 王顺坤  

* <p> @date 2018年12月9日</p>   

*/ 
@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemServiceLog {
	  String description()  default "";
}

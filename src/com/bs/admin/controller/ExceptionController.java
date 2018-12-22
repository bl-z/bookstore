package com.bs.admin.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
* <p>Title: ExceptionController</p>  
* <p>Description: 全局异常处理</p>  
* @author 胡杰
* @date 2018年11月21日
 */
@ControllerAdvice
public class ExceptionController {

//	@ExceptionHandler(value=Exception.class)
//	public ModelAndView exceptionHandel(Exception ex){
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("exception");
//		mv.addObject("ex", ex);
//		return mv;
//	}
}

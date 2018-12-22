package com.bs.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.admin.annotation.SystemControllerLog;
import com.bs.admin.pojo.BookModel;
import com.bs.admin.pojo.PageData;
import com.bs.admin.service.BookService;
import com.bs.admin.service.ThemeService;
import com.bs.admin.util.JsonData;

@Controller
@RequestMapping("themeController")
public class ThemeController {

	@Autowired
	private BookService bs;
	@Autowired
	private ThemeService ts;
	
	/**
	 * 跳转到执行页面
	 */
	@RequestMapping("sendThemePage")
	private String themePage(){
		return "themePage";
	}
	
	/**
	 * 获取到书的信息，供用户选择主题书
	 */
	@RequestMapping(value="getThemeBook/{pageNumber}/{pageSize}", produces="application/json;charset=utf-8")
	public @ResponseBody JsonData getThemeBook(@PathVariable("pageNumber") Integer pageNumber, @PathVariable("pageSize") Integer pageSize, 
			@RequestParam("value") String value, @RequestParam("authorName") String authorName, @RequestParam("category")String category){
		PageData<BookModel> bookData = bs.getBookData(null, null, category, null, null, value, pageNumber, pageSize, authorName);
		Boolean state = bookData != null ? true : false;
		String msg = state ? "查询成功！" : "查询失败！";
		JsonData jsonData = new JsonData("book", bookData, msg, state);
		return jsonData;
	}
	
	/**
	 * 添加主题书的信息
	 */
	@SystemControllerLog(type=2, description="添加主题书的信息")
	@RequestMapping(value="addRecommendWord", produces="application/json;charset=utf-8")
	public @ResponseBody JsonData addRecommendWord(@RequestParam("themeContent") Integer themeContent, 
			@RequestParam("text") String text, @RequestParam("bookId") Integer bookId){
		Integer addTheme = ts.addThemeBook(bookId, themeContent, text);
		Boolean state = addTheme > 0 ? true : false;
		String msg = state ? "该书推荐成功！请在书城查看..." : "推荐失败！请刷新后重试..."; 
		JsonData jsonData = new JsonData("addTheme", "数据库受影响行：" + addTheme, msg, state);
		return jsonData;
	}
	
	/**
	 * 更新主题
	 */
	@SystemControllerLog(type=2, description="更新主题")
	@RequestMapping(value="updateTheme", produces="application/json;charset=utf-8")
	public @ResponseBody JsonData updateTheme(@RequestParam("themeContent") Integer themeContent, @RequestParam("themeName")String themeName, 
			@RequestParam("reason")String reason){
		Integer updateTheme = ts.updateTheme(themeContent, themeName, reason);
		Boolean state = updateTheme > 0 ? true : false;
		String msg = state ? "主题更新成功！请在书城查看..." : "主题更新失败！请刷新后重试...";
		JsonData jsonData = new JsonData("updateTheme", updateTheme, msg, state);
		return jsonData;
	}
	
}

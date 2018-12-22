package com.bs.admin.mapper;

import org.apache.ibatis.annotations.Param;

public interface ThemeMapper {
	
	/**
	 * 
	 * <p>Title: addTheme</p>  
	 * <p>Description: 更新主题</p>  
	 * @param themeName
	 * @param reason
	 * @return  
	 * <p> @date 2018年12月14日  </p>
	 */
	Integer updateTheme(@Param("themeId")Integer themeId, @Param("themeName")String themeName, 
			@Param("reason")String reason);
	
	/**
	 * 
	 * <p>Title: addTheme</p>  
	 * <p>Description: 添加主题书的信息</p>  
	 * @param bookId
	 * @param themeId
	 * @param recommendWord
	 * @return  
	 * <p> @date 2018年12月13日  </p>
	 */
	Integer addThemeBook(@Param("bookId") Integer bookId, @Param("themeId") Integer themeId,
			@Param("recommendWord") String recommendWord);
	
	/**
	 * 
	 * <p>Title: deleteBookTheme</p>  
	 * <p>Description: 更新新主题需要删除之前的主题书</p>  
	 * @param themeId
	 * @return  
	 * <p> @date 2018年12月19日  </p>
	 */
	Integer deleteBookTheme(@Param("themeId") Integer themeId);
	
}

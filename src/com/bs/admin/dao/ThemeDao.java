package com.bs.admin.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface ThemeDao {

	/**
	 * 
	 * <p>Title: updateTheme</p>  
	 * <p>Description: 更新主题</p>  
	 * @param themeName
	 * @param reason
	 * @return  
	 * <p> @date 2018年12月14日  </p>
	 */
	Integer updateTheme(Integer themeId, String themeName, String reason);
	
	/**
	 * 
	 * <p>Title: addTheme</p>  
	 * <p>Description: 添加主题</p>  
	 * @param bookId
	 * @param themeId
	 * @param recommendWord
	 * @return  
	 * <p> @date 2018年12月13日  </p>
	 */
	Integer addThemeBook(Integer bookId, Integer themeId, String recommendWord);
	
	/**
	 * 
	 * <p>Title: deleteBookTheme</p>  
	 * <p>Description: 删除主题书</p>  
	 * @param themeId
	 * @return  
	 * <p> @date 2018年12月19日  </p>
	 */
	Integer deleteBookTheme(Integer themeId);
	
}

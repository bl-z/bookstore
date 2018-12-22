package com.bs.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.ThemeDao;
import com.bs.admin.service.ThemeService;

@Service
public class ThemeServiceImpl implements ThemeService {
	
	@Autowired
	private ThemeDao td;

	@Override
	public Integer addThemeBook(Integer bookId, Integer themeId, String recommendWord) {
		Integer addTheme = td.addThemeBook(bookId, themeId, recommendWord);
		return addTheme;
	}

	@Override
	public Integer updateTheme(Integer themeId, String themeName, String reason) {
		Integer update = td.updateTheme(themeId, themeName, reason);
		Integer delete = td.deleteBookTheme(themeId);
		return update + delete;
	}


}

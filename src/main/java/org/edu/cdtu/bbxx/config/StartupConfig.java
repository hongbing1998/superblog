package org.edu.cdtu.bbxx.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import org.edu.cdtu.bbxx.model.domain.Options;
import org.edu.cdtu.bbxx.model.dto.MaydayConst;
import org.edu.cdtu.bbxx.service.MenuService;
import org.edu.cdtu.bbxx.service.OptionsService;
import org.edu.cdtu.bbxx.service.ThemeService;

/**
 * @author : 宋浩志
 * @createDate : 2018年10月30日
 */
@Configuration
public class StartupConfig implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private OptionsService optionsService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private ThemeService themeService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		this.loadOptions();
		this.loadMenus();
		this.loadThemeName();
	}

	/**
	 * 加载设置选项
	 */
	private void loadOptions() {
		List<Options> listMap = optionsService.selectMap();
		if (listMap.size() > 0 && !listMap.isEmpty()) {
			for (Options options : listMap) {
				MaydayConst.OPTIONS.put(options.getOptionName(), options.getOptionValue());
			}
		}
	}

	/**
	 * 加载菜单
	 */
	private void loadMenus() {
		MaydayConst.MENUS = menuService.findMenus();
	}
	/**
	 * 加载主题
	 */
	private void loadThemeName() {
		MaydayConst.THEME_NAME=themeService.getEnabledTheme();
	}

}

package org.edu.cdtu.bbxx.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.edu.cdtu.bbxx.model.domain.Log;

/**
 * @author : 宋浩志
 * @createDate : 2018年9月28日
 */
public interface LogService {
	/**
	 * 保存日志
	 *
	 * @param log
	 */
	void save(Log log);

	/**
	 * 分页查询日志
	 *
	 * @param page
	 * @param limit
	 * @return
	 */
	PageInfo<Log> findLogs(int page, int limit);

	/**
	 * 删除所有日志
	 */
	void clear();
}

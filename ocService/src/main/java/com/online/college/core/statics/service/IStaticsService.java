package com.online.college.core.statics.service;

import com.online.college.core.statics.domain.CourseStudyStaticsDto;
import com.online.college.core.statics.domain.RegisterStaticsDto;
import com.online.college.core.statics.domain.StaticsVO;

/**
 * 报表统计
 */
public interface IStaticsService {
	/**
	*统计课程学习情况
	**/
	public StaticsVO queryCourseStudyStatistics(CourseStudyStaticsDto queryEntity);
	
	/**
	 * 统计注册情况
	 * @param queryEntity
	 * @return
	 */
	public StaticsVO queryRegisterStatics(RegisterStaticsDto queryEntity);
}

package com.online.college.core.statics.dao;

import java.util.List;

import com.online.college.core.statics.domain.CourseStudyStaticsDto;
import com.online.college.core.statics.domain.RegisterStaticsDto;

public interface CourseStudyStaticsDao {
	
	/**
	*统计课程学习情况
	**/
	public List<CourseStudyStaticsDto> queryCourseStudyStatistics(CourseStudyStaticsDto queryEntity);
	
	/**
	 * 统计注册人数情况
	 */
	public List <RegisterStaticsDto> queryRegisterStatics(RegisterStaticsDto queryEntity);
}


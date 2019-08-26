package com.online.college.core.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.college.core.course.dao.CourseBuyDao;
import com.online.college.core.course.domain.CourseBuy;
import com.online.college.core.course.service.ICourseBuyService;

@Service
public class CourseBuyServiceImpl implements ICourseBuyService {

	@Autowired
	private CourseBuyDao entityDao;
	
	@Override
	public List<CourseBuy> getById(Long id) {
		// TODO Auto-generated method stub
		if(id == null)
			return null;
		return entityDao.getById(id);
	}

	@Override
	public void create(CourseBuy entity) {
		// TODO Auto-generated method stub
		entityDao.create(entity);
	}

}

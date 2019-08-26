package com.online.college.opt.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.college.common.util.CalendarUtil;
import com.online.college.common.util.JsonUtil;
import com.online.college.common.web.SessionContext;
import com.online.college.core.statics.domain.RegisterStaticsDto;
import com.online.college.core.statics.domain.StaticsVO;
import com.online.college.core.statics.service.IStaticsService;

/**
 * 后台管理
 */
@Controller
@RequestMapping()
public class CmsController {
	
	
	@Autowired
	private IStaticsService staticsService;
	
	/**
	 * 首页
	 */
	@RequestMapping("/index")
	public ModelAndView index(){
		if(SessionContext.isLogin()){
			ModelAndView mv = new ModelAndView("cms/index");
			mv.addObject("curNav", "home");
			
			RegisterStaticsDto Dto=new RegisterStaticsDto();
			Dto.setEndDate(new Date());
			Dto.setStartDate(CalendarUtil.getPreNDay(new Date(), 10));
			
			StaticsVO vo=staticsService.queryRegisterStatics(Dto);
			if(null!=vo){
				try {
					mv.addObject("vo",JsonUtil.toJson(vo));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return mv;
		}else{
			return new ModelAndView("auth/login");
		}
	}
	
}


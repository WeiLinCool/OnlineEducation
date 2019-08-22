package com.online.college.opt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.college.opt.business.impl.RegisterNumberBusinessImpl;

@Controller
public class ViewController {
	
	@Resource
	private  RegisterNumberBusinessImpl re;
	
	@RequestMapping(value="/registerView")
	public ModelAndView queryregisterView(){
		ModelAndView mv=new ModelAndView("cms/index");
		re.queryRegisterNumberByDay();
		mv.addObject("registerNumber", re);
		return mv;		
	}

}

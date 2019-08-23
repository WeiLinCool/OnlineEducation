package com.online.college.opt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.online.college.opt.business.impl.RegisterNumberBusinessImpl;

@RestController
public class ViewController {
	
	@Resource
	private  RegisterNumberBusinessImpl re;
	
	
	@RequestMapping(value="/registerView")
	@ResponseBody
	public List<Integer> queryregisterView(){

		List<Integer> list =re.queryRegisterNumberByDay();
		System.out.println("__________________________________________________________________________");
		System.out.println(list);
		return list;
	}

}

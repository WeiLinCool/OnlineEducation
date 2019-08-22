package com.online.college.opt.business.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.college.core.auth.service.IAuthUserService;
import com.online.college.opt.business.RegisterNumberBusiness;
import com.online.college.opt.vo.RegisterNumberVO;
import java.text.SimpleDateFormat;  
import java.text.DateFormat;
import java.text.ParseException;
@Service
public class RegisterNumberBusinessImpl implements RegisterNumberBusiness{

	@Autowired
	private IAuthUserService iauthUserService;
	
	
	//查询 注册人数（用于报表统计）
	public List<RegisterNumberVO> queryRegisterNumberByDay() {
		// TODO Auto-generated method stub
		 List <RegisterNumberVO> L=new ArrayList<RegisterNumberVO>();
		
		 Date dt=new Date();
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		 String time = df.format(new Date().getTime()-10*24*60*60*1000);
		 for(int i =10;i>0;i--){
			 RegisterNumberVO re= new RegisterNumberVO();
			 Date thedate;
			try {
				thedate = df.parse(df.format(new Date().getTime()-i*24*60*60*1000));
				re.setData(thedate);
				//根据日期 查询注册人数
				 
				 
				 //
				 //re.setRegisternumber(number);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 L.add(re);
			 
		 }
		 
		 
		 
		 return L;
	}

}

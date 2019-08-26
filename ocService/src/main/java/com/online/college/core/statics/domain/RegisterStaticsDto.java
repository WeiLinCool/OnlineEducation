package com.online.college.core.statics.domain;

import java.util.Date;

/**
 * 注册人数统计 
 * @author Master
 *
 */
public class RegisterStaticsDto {
	
	private Integer totalCount;
	
	private String dateStr;

    private Date startDate;
	
	private Date endDate;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	
	
}

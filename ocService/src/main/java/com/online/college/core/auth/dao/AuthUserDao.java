package com.online.college.core.auth.dao;

import java.util.Date;
import java.util.List;
import com.online.college.common.page.TailPage;
import com.online.college.core.auth.domain.AuthUser;


public interface AuthUserDao {

	/**
	*根据id获取
	**/
	public AuthUser getById(Long id);
	
	/**
	 * 获取全部学校
	 * @return
	 */
	public List<String> getSchool();
	/**
	 * 获取全部省份
	 * @return
	 */
	public List<String> getProvince();
	/**
	 * 获取当前省份的城市
	 * @return
	 */
	public List<String> getCity(String pro);
	
	/**
	 * 根据username获取
	 */
	public AuthUser getByUsername(String username);

	/**
	 * 根据username 和 password获取
	 * @param authUser
	 * @return
	 */
	public AuthUser getByUsernameAndPassword(AuthUser authUser);
	
	/**
	*获取首页推荐5个讲师
	**/
	public List<AuthUser> queryRecomd();

	/**
	*获取总数量
	**/
	public Integer getTotalItemsCount(AuthUser queryEntity);

	/**
	*分页获取
	**/
	public List<AuthUser> queryPage(AuthUser queryEntity , TailPage<AuthUser> page);

	/**
	*创建新记录
	**/
	public void createSelectivity(AuthUser entity);

	/**
	*根据id更新
	**/
	public void update(AuthUser entity);

	/**
	*根据id选择性更新自动
	**/
	public void updateSelectivity(AuthUser entity);

	/**
	*物理删除
	**/
	public void delete(AuthUser entity);

	/**
	*逻辑删除
	**/
	public void deleteLogic(AuthUser entity);
	

    /**
    * 报表查询统计注册人数
    * @param thedate
    * @param thedate2
    * @return
    */
	public Integer registerNumber(Date thedate, Date thedate2);
	




}


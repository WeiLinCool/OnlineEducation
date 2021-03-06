package com.online.college.core.auth.service;

import java.util.Date;
import java.util.List;

import com.online.college.common.page.TailPage;
import com.online.college.core.auth.domain.AuthUser;

public interface IAuthUserService {

	/**
	 * 根据username获取
	 **/
	public AuthUser getByUsername(String username);

	/**
	 * 创建
	 **/
	public void createSelectivity(AuthUser entity);

	/**
	 * 根据id获取
	 **/
	public AuthUser getById(Long id);

	/**
	 * 获取全部学校
	 */
	public List<String> getSchool();

	/**
	 * 根据username和password获取
	 **/
	public AuthUser getByUsernameAndPassword(AuthUser authUser);

	/**
	 * 获取首页推荐5个讲师
	 **/
	public List<AuthUser> queryRecomd();

	/**
	 * 分页获取
	 **/
	public TailPage<AuthUser> queryPage(AuthUser queryEntity, TailPage<AuthUser> page);

	/**
	 * 根据id更新
	 **/
	public void update(AuthUser entity);

	/**
	 * 根据id 进行可选性更新
	 **/
	public void updateSelectivity(AuthUser entity);

	/**
	 * 物理删除
	 **/
	public void delete(AuthUser entity);

	/**
	 * 逻辑删除
	 **/
	public void deleteLogic(AuthUser entity);

	/**
	 * 查省份
	 *
	 */
	public List<String> getProvince();

	/**
	 * 查城市
	 * @param pro 
	 *
	 */
	public List<String> getCity(String pro);
	
	/**
	 * 报表查询注册人数根据时间
	 * @param thedate
	 * @param thedate2
	 * @return
	 */

	public Integer registerNumber(Date thedate, Date thedate2);

}

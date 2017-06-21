package com.ruanko.dao;

import java.util.List;

import com.ruanko.model.ConProcess;
import com.ruanko.utils.AppException;


public interface ConProcessDao {

	/* 判断id是否已存在*/
	public boolean isExist(int conId) throws AppException;
	/*添加*/
	public boolean add(ConProcess conProcess) throws AppException;
	
	/*排列合同 */
	public List<Integer> getConIds(ConProcess conProcess) throws AppException;
	
	/* */
	public boolean update(ConProcess conProcess) throws AppException;
	
	/*查询*/
	public int getTotalCount(ConProcess conProcess) throws AppException;
	
	/*查询 */
	public List<Integer> getIds(int conId, int type, int state) throws AppException;
	/**通过id查询 */
	public ConProcess getById(int id) throws AppException;
	
}

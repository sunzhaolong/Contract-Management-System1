package com.ruanko.dao;

import java.util.List;

import com.ruanko.model.ConProcess;
import com.ruanko.utils.AppException;


public interface ConProcessDao {

	/* �ж�id�Ƿ��Ѵ���*/
	public boolean isExist(int conId) throws AppException;
	/*���*/
	public boolean add(ConProcess conProcess) throws AppException;
	
	/*���к�ͬ */
	public List<Integer> getConIds(ConProcess conProcess) throws AppException;
	
	/* */
	public boolean update(ConProcess conProcess) throws AppException;
	
	/*��ѯ*/
	public int getTotalCount(ConProcess conProcess) throws AppException;
	
	/*��ѯ */
	public List<Integer> getIds(int conId, int type, int state) throws AppException;
	/**ͨ��id��ѯ */
	public ConProcess getById(int id) throws AppException;
	
}

package com.neil.dao;
import java.util.*;

import com.neil.vo.*;
public interface IEmpDAO {
	/*
	 * 数据增加操作
	 * @param emp 要增加的数据对象
	 * @return 是否添加成功的标记
	 * @throws Exception 异常交由被调用处处理
	 */
	public boolean doCreate(Emp emp) throws Exception;
	/*
	 * 查询全部数据
	 * @param keyWord 查询关键字
	 * @return 返回全部查询结果
	 * @throws Exception 异常交由被调用处处理
	 */
	public List<Emp> findAll(String keyWord)throws Exception;
	/*
	 * 根据雇员号查询雇员信息
	 * @param empno 雇员编号
	 * @return 雇员的vo对象
	 * @throws Exception 异常交由被调用处处理
	 */
	public Emp findById(int empno) throws Exception;
	/*
	 * 更新雇员信息
	 * @param emp 要更新的数据对象
	 * @return 返回跟新是否成功消息
	 * @throws Exception 异常交由被调用处处理
	 */
	public boolean doUpdate(Emp emp)throws Exception;
	/*
	 * 雇员删除操作
	 * @param empno
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(int empno)throws Exception;
}

package com.neilpro.dao;
import com.neilpro.vo.*;
import java.util.*;
public interface IDeptDAO {
	public boolean doCreate(Dept dept)throws Exception;
	public List<Dept> findAll(String keyWord) throws Exception;
	public Dept findById(int deptno) throws Exception;
	public boolean doUpdate(Dept dept)throws Exception;
	public boolean doDelete(int deptno)throws Exception;
}

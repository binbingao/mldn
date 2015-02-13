package com.neil.dao.test;
import java.util.*;
import com.neil.factory.*;
import com.neil.vo.*;
public class TestDAODelete {
	public static void main(String[] args)throws Exception{
		DAOFactory.getEmpDAOInstance().doDelete(8887);
	}
}

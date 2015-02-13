package com.member.dao;

import com.member.vo.Member;
import java.util.*;
public interface IDAOMember {
	public boolean doInsert(Member member)throws Exception;
	public List<Member> findAll(String keyWord)throws Exception;
	public Member findById(String mids)throws Exception;
	public boolean doUpdate(Member member)throws Exception;
	public boolean doDelete(String mids) throws Exception;
	public boolean updateDate(String mids)throws Exception;
}

package com.neil.dao;
import java.util.*;

import com.neil.vo.*;
public interface IEmpDAO {
	/*
	 * �������Ӳ���
	 * @param emp Ҫ���ӵ����ݶ���
	 * @return �Ƿ���ӳɹ��ı��
	 * @throws Exception �쳣���ɱ����ô�����
	 */
	public boolean doCreate(Emp emp) throws Exception;
	/*
	 * ��ѯȫ������
	 * @param keyWord ��ѯ�ؼ���
	 * @return ����ȫ����ѯ���
	 * @throws Exception �쳣���ɱ����ô�����
	 */
	public List<Emp> findAll(String keyWord)throws Exception;
	/*
	 * ���ݹ�Ա�Ų�ѯ��Ա��Ϣ
	 * @param empno ��Ա���
	 * @return ��Ա��vo����
	 * @throws Exception �쳣���ɱ����ô�����
	 */
	public Emp findById(int empno) throws Exception;
	/*
	 * ���¹�Ա��Ϣ
	 * @param emp Ҫ���µ����ݶ���
	 * @return ���ظ����Ƿ�ɹ���Ϣ
	 * @throws Exception �쳣���ɱ����ô�����
	 */
	public boolean doUpdate(Emp emp)throws Exception;
	/*
	 * ��Աɾ������
	 * @param empno
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(int empno)throws Exception;
}

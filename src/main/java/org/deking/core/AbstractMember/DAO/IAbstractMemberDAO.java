package org.deking.core.AbstractMember.DAO;

import org.deking.core.AbstractMember.DO.AbstractMemberDO;

public interface IAbstractMemberDAO {

	AbstractMemberDO getMemberByLogin(AbstractMemberDO AMDO) throws Exception;

	boolean doLogin(AbstractMemberDO AMDO) throws Exception;

	boolean doLoginout(AbstractMemberDO AMDO) throws Exception;

	boolean remove(int AMDO) throws Exception;

	boolean updateHeader(AbstractMemberDO AMDO) throws Exception;

	boolean doPay(AbstractMemberDO AMDO);

}
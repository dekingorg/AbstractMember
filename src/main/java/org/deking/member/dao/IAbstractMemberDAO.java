package org.deking.member.dao;

import org.deking.member.interfaces.Loginable;
import org.deking.member.interfaces.Logoffable;
import org.deking.member.interfaces.Logoutable;
import org.deking.member.interfaces.Payable;
import org.deking.member.interfaces.Profileable;
import org.deking.member.interfaces.Rechargeable;

public interface IAbstractMemberDAO<T> extends Payable<T>,Rechargeable<T>,Loginable<T>,Logoutable<T>,Logoffable,Profileable<T>{

	boolean updateHeader(T abstractMember) throws Exception;
	
	boolean updatePassword(int id ,String newPassword) throws Exception;
 

}
package org.deking.member.interfaces;

import org.deking.member.UserLevelEnum;

public interface Upgradable<T> {
	boolean upgrade(T t,UserLevelEnum newLevel) throws Exception;
}

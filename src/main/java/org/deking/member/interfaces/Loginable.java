package org.deking.member.interfaces;

public interface Loginable<T> {
	T login(T t) throws Exception;
}

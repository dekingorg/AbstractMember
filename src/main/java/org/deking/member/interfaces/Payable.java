package org.deking.member.interfaces;

import java.math.BigDecimal;

public interface Payable<T> {
	boolean pay(T t,BigDecimal money) throws Exception;
}

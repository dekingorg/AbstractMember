package org.deking.member.interfaces;

import java.math.BigDecimal;

public interface Rechargeable<T> {
	boolean recharge(T t,BigDecimal amount) throws Exception;
}

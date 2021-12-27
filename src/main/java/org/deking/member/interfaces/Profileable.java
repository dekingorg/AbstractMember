package org.deking.member.interfaces;

import org.apache.commons.dbutils.ResultSetHandler;

public interface Profileable<T> {
	<R> R getProfile(T object, ResultSetHandler<R> rsh, Object... params) throws Exception;
}

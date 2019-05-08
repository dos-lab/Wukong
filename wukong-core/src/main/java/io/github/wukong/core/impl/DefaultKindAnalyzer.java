/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core.impl;

import java.lang.reflect.Method;

import io.github.wukong.core.KindAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class DefaultKindAnalyzer extends KindAnalyzer {

	@Override
	protected boolean isKind(Method method) {
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		return null;
	}

	@Override
	protected String toMethodDesc(String parent, Method method) {
		return null;
	}

	@Override
	public String getClient() {
		return DefaultClient.class.getName();
	}

	@Override
	protected String toParamDesc(Method method) {
		return null;
	}

}

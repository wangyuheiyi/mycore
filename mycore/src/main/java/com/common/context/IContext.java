package com.common.context;


public interface IContext {
	public <T> T getBean(Class<T> classType);
}

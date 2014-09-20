package com.common.async;




/**
 * 异步操作管理器
 * @author Thinker
 */
public interface AsyncService
{
	/**
	 * 创建一个异步操作,并且马上执行
	 * 
	 * @param operation
	 * @return
	 */
	public abstract AsyncOperation createOperationAndExecuteAtOnce(IIoOperation operation);
	
	/**
	 * 创建一个同步操作,并且马上执行
	 * 
	 * @param operation
	 * @return
	 */
	public abstract SyncOperation createSyncOperationAndExecuteAtOnce(IIoOperation operation);
}
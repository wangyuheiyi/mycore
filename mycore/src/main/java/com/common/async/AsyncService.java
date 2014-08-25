package com.common.async;


/**
 * 异步操作管理
 * @author Thinker
 */
public interface AsyncService
{
	/**
	 * 创建异步操作,并且马上执行
	 * 
	 * @param operation
	 * @return
	 */
	public abstract AsyncOperation createOperationAndExecuteAtOnce(IIoOperation operation);

	/**
	 * 创建同步操作,并且马上执行
	 * 
	 * @param operation
	 * @return
	 */
	public abstract SyncOperation createSyncOperationAndExecuteAtOnce(IIoOperation operation);
	
	/**
	 * 创建�?��异步操作，并且马上执行，在执行完doIo方法后，在玩家线程中执行
	 * 
	 * @param operation
	 * @param uuid
	 * @return
	 */
	public abstract AsyncOperation createOperationAndExecuteAtOnce(IIoOperation operation, long uuid);
	
	/**
	* 创建异步操作,并且马上执行，在执行完doIo方法后，doStop返回GlobalLogicRunner�?��线程执行
	* 
	* @param operation
	* @return
	*/
	public abstract AsyncOperation createGlobalAsyncOperationAndExecuteAtOnce(IIoOperation operation);
	
	/**
	* 创建同步操作,并且马上执行，在执行完doIo方法后，doStop返回GlobalLogicRunner�?��线程执行
	* 
	* @param operation
	* @return
	*/
	public abstract SyncOperation createGlobalSyncOperationAndExecuteAtOnce(IIoOperation operation);
	/**
	 * 停止服务
	 */
	public abstract void stop();
}
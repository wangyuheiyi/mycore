package com.common.async;

/**
 * 与IO相关的较为费时的操作，分为三个阶doStart,doIo,doStop
 * @author Thinker
 * 
 */
public interface IIoOperation
{
	/** 初始*/
	public static final int STAGE_INITAILZED = 0;
	/** doStart完成 */
	public static final int STAGE_START_DONE = 1;
	/** doIo完成 */
	public static final int STAGE_IO_DONE = 2;
	/** doStop完成,也可用于中止执行 */
	public static final int STAGE_STOP_DONE = 3;

	/**
	 * 操作时的操作,在主线程中执
	 * 
	 * @return
	 */
	public int doStart();

	/**
	 * 运行在另线程，如果要访问主线程共享对象，注意只读操作 或先Copy对象给数据库线程操作
	 * 
	 * 注意防止我们在另线程操作，但是失败后
	 * 
	 * @return
	 */
	public int doIo();

	/**
	 * 异步操作结束后执行的操作,在主线程中执
	 * 
	 * @return
	 */
	public int doStop();

}
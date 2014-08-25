package com.common.async;

/**
 * 同步操作
 * @author Thinker
 */
public class SyncOperation 
{
	/** 当前的状态 */
	private int stage;
	/** 与IO相关的操作 */
	private final IIoOperation operation;

	/**
	 * 
	 * @param operation
	 * @param asyncExecutor
	 * @param messageProcessor
	 */
	public SyncOperation(IIoOperation operation)
	{
		this.operation = operation;
		stage = IIoOperation.STAGE_INITAILZED;
	}

	/**
	 * 顺序执行IIoOperation的操作,根据各阶段的返回值进行下一步的操作
	 */
	public void execute()
	{
		stage = operation.doStart();
		if (stage == IIoOperation.STAGE_START_DONE)
		{
			stage = operation.doIo();
		}
		if (stage == IIoOperation.STAGE_IO_DONE)
		{
			stage = operation.doStop();
		}
	}
}

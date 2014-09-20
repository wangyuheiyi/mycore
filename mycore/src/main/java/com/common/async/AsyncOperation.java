package com.common.async;

import java.util.concurrent.ExecutorService;

/**
 * 异步操作
 * 
 * 
 */
public class AsyncOperation
{
	/** 当前的状态 */
	private volatile int stage;
	/** 线程池 */
	private final ExecutorService asyncExecutor;
	/** 与IO相关的操作 */
	private final IIoOperation operation;
	private final long uuid;


	public AsyncOperation(IIoOperation operation, ExecutorService asyncExecutor) {
		stage = IIoOperation.STAGE_INITAILZED;
		this.operation = operation;
		this.asyncExecutor = asyncExecutor;
		this.uuid = -1;
	}
	
	public AsyncOperation(IIoOperation operation,
			ExecutorService asyncExecutor,
			long uuid) {
		stage = IIoOperation.STAGE_INITAILZED;
		this.operation = operation;
		this.asyncExecutor = asyncExecutor;
		this.uuid = uuid;
	}

	/**
	 * 根据当前所处的状态来执行相应的操作
	 * 
	 * 框架根据返回值来决定调用的方法
	 * 实现者的状态如果更加复杂，可以根据内部状态来进一步决定doStartStep/doIoStep/doStopStep的执行内容
	 * 
	 * 这里无需指定参数，因为参数在其它步骤都已经获得了
	 */
	public void execute() {
		switch (stage) {
		case IIoOperation.STAGE_INITAILZED: 
		{
			stage = operation.doStart();			
			if (stage == IIoOperation.STAGE_START_DONE)
			{
				// 启动线程执行IOStep
				this.asyncExecutor.execute(new Runnable() {
					@Override
					public void run() {
						execute();
					}
				});
			}else if(stage == IIoOperation.STAGE_IO_DONE)
			{
				stage= this.operation.doStop();	
			}
			break;
		}
		case IIoOperation.STAGE_START_DONE:
		{
			stage = operation.doIo();
			break;
		}
		case IIoOperation.STAGE_IO_DONE:
		{
			stage= this.operation.doStop();			
			break;
		}
		}
	}
	
	@Override
	public String toString(){
		String _operationName = this.operation!=null?this.operation.getClass().getName():"null";
		return this.getClass()+" operation["+_operationName+"]";
	}
	
	public int getStage() {
		return stage;
	}
	
	public long getUUID(){
		return uuid;
	}

	public IIoOperation getOperation() {
		return operation;
	}
}

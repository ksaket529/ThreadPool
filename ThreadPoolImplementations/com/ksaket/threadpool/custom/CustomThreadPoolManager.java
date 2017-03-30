/**
 * 
 */
package com.ksaket.threadpool.custom;

/**
 * @author saket
 *
 */
public class CustomThreadPoolManager {
	
	private final int THREADPOOL_CAPACITY;
	private CustomQueueImpl<Runnable> tasksQueue = new CustomQueueImpl<Runnable>();
	
	public CustomThreadPoolManager(int capacity){
		THREADPOOL_CAPACITY = capacity;
		initAllWorkers();
	}
	
	public void initAllWorkers(){
		for(int i=0; i<THREADPOOL_CAPACITY; i++){
			Thread thread = new Thread(new WorkerThread(tasksQueue), ""+i);
			thread.start();
		}
	}
	
	public void submitTask(Runnable r){
		tasksQueue.enqueue(r);
	}
}

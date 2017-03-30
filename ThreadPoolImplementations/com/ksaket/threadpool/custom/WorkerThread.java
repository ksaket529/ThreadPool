/**
 * 
 */
package com.ksaket.threadpool.custom;

/**
 * @author saket
 *
 */
public class WorkerThread implements Runnable {

	private CustomQueueImpl<Runnable> tasksQueue;
	
	public WorkerThread(CustomQueueImpl<Runnable> tasksQueue){
		this.tasksQueue = tasksQueue;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			Runnable r = tasksQueue.dequeue();
			if(r != null){
				System.out.println("Task undertaken by thread - " + Thread.currentThread().getName());
				r.run();
//				System.out.println("Task completed by thread - " + Thread.currentThread().getName());
			}
			else{
				System.out.println("Thread - " + Thread.currentThread().getName() + " is free");
				return;
			}
		}
	}

}

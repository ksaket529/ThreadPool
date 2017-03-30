/**
 * 
 */
package com.ksaket.threadpool.concurrent;

/**
 * @author saket
 *
 */
public class WorkerThread implements Runnable {

	private String task;
	
	public WorkerThread(String task){
		this.task = task;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " Task - " + task + " - Start");
		executeTask();
		System.out.println(Thread.currentThread().getName() + " -  " + Thread.currentThread().getState() + " Task - " + task + " - End");
	}
	
	public void executeTask(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return task;
	}

}

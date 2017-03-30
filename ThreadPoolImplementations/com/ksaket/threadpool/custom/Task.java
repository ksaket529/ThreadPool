/**
 * 
 */
package com.ksaket.threadpool.custom;

/**
 * @author saket
 *
 */
public class Task implements Runnable {
	
	private String name;
	
	public Task(String name){
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task - " + name + " - started by Thread - " + Thread.currentThread().getName());
		try{
			Thread.sleep(500);
		}catch(InterruptedException exc){
			exc.printStackTrace();
		}
		System.out.println("Task - " + name + " - completed");
	}

}

/**
 * 
 */
package com.ksaket.threadpool.custom;

/**
 * @author saket
 *
 */
public class TestCustomThreadPoolManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomThreadPoolManager threadPoolManager = new CustomThreadPoolManager(5);
		for(int i=0; i<10; i++){
			Runnable task = new Task("" + i);
			threadPoolManager.submitTask(task);
		}
	}

}

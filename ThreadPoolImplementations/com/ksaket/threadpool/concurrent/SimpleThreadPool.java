/**
 * 
 */
package com.ksaket.threadpool.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * @author saket
 *
 */
public class SimpleThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++){
			WorkerThread worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()){
		}
		System.out.println("All tasks completed!");
	}

}

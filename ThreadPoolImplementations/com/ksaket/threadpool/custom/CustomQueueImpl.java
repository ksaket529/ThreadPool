/**
 * 
 */
package com.ksaket.threadpool.custom;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author saket
 *
 */
public class CustomQueueImpl<E> implements CustomQueue<E> {

	private Queue<E> tasksQueue = null;
	
	@Override
	public synchronized void enqueue(E e) {
		// TODO Auto-generated method stub
		if(tasksQueue == null){
			tasksQueue = new LinkedList<E>();
		}
		tasksQueue.offer(e);
		notifyAll();
	}

	@Override
	public synchronized E dequeue() {
		// TODO Auto-generated method stub
		E e = null;
		while(tasksQueue == null){
			try{
				wait(1000);
			} catch(InterruptedException exc){
				return e;
			}
		}
		e = tasksQueue.poll();
		return e;
	}

}

/**
 * 
 */
package com.ksaket.threadpool.custom;

/**
 * @author saket
 *
 */
public interface CustomQueue<E> {
	
	public void enqueue(E e);
	
	public E dequeue();
}

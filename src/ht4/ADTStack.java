/*
 * Universidad del Valle de Guatemala
 * 22-08-16
 * @author Isaac Rodriguez 
 *@author Julian Lopez
 */
public interface ADTStack<E> {
	public void empty();
	public boolean isEmpty();
	public void push(E x) ;
	public E pop() throws Exception;
	public int size();
	public E peek() throws Exception;
	
}

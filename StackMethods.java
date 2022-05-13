package StackImplementation;

import java.util.EmptyStackException;

public class StackMethods implements StackInterface{
	private int[] stack;
	private int size ;
	private static final int INITIAL_SIZE = 10;
	
	
	public StackMethods(){
		stack = new int[INITIAL_SIZE];
		size = -1;
		
	}
	
	/*adding the element in the insertion order in stack
	 * if the stack is full double the capacity
	 */
	public void myPush(int element) {
		if(size == stack.length){
			doublecapacity();
		}
		
		++size;
		stack[size] = element;
		
	}
	
	
	 /*if the size is full then the capacity will double
	  * stack element change to newstack
	  * then new stack element change to stack
	  */
	private void doublecapacity(){
		int newcapacity = 2*stack.length;
		int[] newstack = new int[newcapacity];
		for(int i=0;i<stack.length;i++){
			newstack[i] = stack[i];
		}
		stack = newstack;
	}
	/*
	 * In stack delete the top of the element and return 
	 */
	public int myPop() {
		if(size == -1){
			throw new EmptyStackException();
		}
		int popped = stack[size];
		size--;
		return popped;
	}
	
	/*
	 * In stack return the top of the element without delete
	 */
	public int myPeeek() {
		if(size == -1){
			throw new EmptyStackException();
		}
		int peeked = stack[size];
		return peeked;
	}
	// just return stored size of the stack 
	public int mySize() {
		return size;
	}
	
	//Stack is empty return boolean
	public boolean myEmpty() {
		if(size == -1){
			return true;
		}
		return false;
	}
	
	//In capcity how much element are stored
	public int myCapacity() {
		return stack.length;
	}
	
	
	//remaining capacity will return 
	public int myRemainCapacity() {
		int remain = stack.length-size;
		//capacity()-stack.length
		return remain;
	}

	public int[] display() {
		int[] store =new int[mySize()+1];
		for(int i=0;i<=mySize();i++){
			store[i] = stack[i];
			
		}
		
		return store;
	}

	

}

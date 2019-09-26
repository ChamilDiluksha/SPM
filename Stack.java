/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassesNew;

/**
 *
 * @author User
 */
public class Stack {
    
    private int top;
    private int size;
    private char[] array;
	
    public Stack(int s) {
	top = -1;
        size = s;
	array = new char[size];
    }

    public void push(char ch) {
	if(top == size-1) 
	    System.out.println("Stack is full");
	else {
	    top++;
            array[top] = ch;
	}
    }
	
    public char pop() {
	if(top == -1) {
	    return 'z';
	 }
	 else {
            char topvalue = array[top];
	    top--;
	    return topvalue;
	 }
    }
	
    public char peek() {
	if(top == -1) {
            System.out.println("Stack is empty");
            return 'z';
	 }
	else {
	    char topvalue = array[top];
	    return topvalue;
	 }
    }
	
    public boolean isEmpty() {
	if(top == -1)
	    return true;
	else
            return false;
    }
	
    public boolean isFull() {
	if(top == size-1)
	    return true;
	else
	    return false;
	}
    
}

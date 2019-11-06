package com.revature.list;

import java.util.Arrays;

public class MyArrayList {

	int size  = 0;
	int capacity = 100;
	int[] array = new int[100];
	
	private void resize() {
		capacity *= 2;
		int[] temp = Arrays.copyOf(array, capacity);
		array = temp;
	}
	
	public void add(int val) {
		
		if(size >= capacity) {
			resize();
		}
		
		array[size] = val;
		size++;
	}

	public void set(int index, int val) {
		
		if ( index<0 || index>=size) {
			return;
		} 
		else {
			array[index]=val;
		}
	}

	public void remove(int index) {
		
		if(index < 0 || index >= size) {
			return;
		}
		
		for(int arrayIndex = index; arrayIndex < array.length - 1; arrayIndex++) {
			array[arrayIndex] = array[arrayIndex + 1];
		}
		size --;
		
	}

	public int get(int index) {
		
		int value = array[index];
		return value;
	}

	@Override
	public String toString() {
		String output = "";
		
		for(int index = 0; index < array.length; index++) {
			output += "[" + array[index] + "]";
		}
		
		return output;
	}
}

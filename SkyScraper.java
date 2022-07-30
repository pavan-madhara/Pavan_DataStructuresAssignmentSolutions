package com.greatlearing.Project2;

import java.util.Arrays;
import java.util.Stack;


public class SkyScraper {
	static boolean maxNumber, addFlag;
	
	@SuppressWarnings("unchecked")
	public static void calculateFloors(int[] floorSize) {
		Stack<Integer> stack = new Stack<Integer>();	
		for (int i = 0; i < floorSize.length; i++) {
				maxNumber =  true;
				int floorSize_i = floorSize[i];
				for (int j =i; j< floorSize.length; j++) {
					if(j == i) {
						continue;
					} else {
						int floorSize_j = floorSize[j];
						
						if (floorSize_i >= floorSize_j) {
							maxNumber = true;
							continue;
						} else {
							maxNumber = false;
							stack.push(floorSize_i);
							break;
						}
					}
				}	
			if (maxNumber == true) {
				try {
					  Stack<Integer> stackTemp = displayFloor(stack, floorSize_i, i, floorSize);
					  stack.clear();
					  stack = (Stack<Integer>) stackTemp.clone();
					  stackTemp.clear();
					  System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			} else {
				System.out.println("Day: " + (i+1) + " \n");	
			}
		  }
	   }
		
	public static Stack<Integer> displayFloor(Stack<Integer> stack, int currentFloor, int rep, int[] arrFloor){
			int[] arrPoppedFloors =  new int[arrFloor.length];
			int counter = 0;
			
			System.out.print("Day: " + (rep + 1) + " \n" + currentFloor);
		
			Stack<Integer> stackTemp = new Stack<Integer>();
			boolean maximuminStack;
			
			if (rep == arrFloor.length - 1) {
				while (!stack.empty()) {
					int popFloor = (int)stack.pop();
					arrPoppedFloors[counter++] = popFloor;
				}
				
				if (arrPoppedFloors != null) {
					Arrays.sort(arrPoppedFloors);
					for (int i = arrPoppedFloors.length - 1; i> 0; i--) {
						if (arrPoppedFloors[i] != 0) {
							System.out.print("  " + arrPoppedFloors[i]);
						}
					}
				}
				return stackTemp;
			
			   } else {
				   if (!stack.empty()) {
			   		while (!stack.empty()) {
			   			maximuminStack = true;
			   			int popFloor = (int)stack.pop();
			   			
			   			for(int i = rep; i< arrFloor.length; i++) {
			   				if(i == rep) {
			   					continue;
			   				}
			   				if (popFloor < arrFloor[i]) {
			   					stackTemp.push(popFloor);
			   					maximuminStack = false;
			   					break;
			   				}else {
			   					maximuminStack = true;
			   				}
			   			   }
			   			if(maximuminStack ==  true) {
			   				arrPoppedFloors[counter++] = popFloor;
			   			 }
			   	  	   }
			       	}
			   	if (arrPoppedFloors != null) {
			   		Arrays.sort(arrPoppedFloors);
			   		for(int i = arrPoppedFloors.length - 1; i > 0; i--) {
			   			if(arrPoppedFloors[i] != 0) {
			   				System.out.print(" " + arrPoppedFloors[i]);
			   			}
			   		}
			   	}
			   	return stackTemp;
		}
	}
}

package com.greatlearing.Project2;

import java.util.ArrayList;


public class DriverClassBTS {

	public static void main(String[] args) {
		// creating input Object and Hard coding the Input
		
		ArrayList<Integer> sc = new ArrayList<Integer>();
		Node root = new Node(50);
		sc.add(root.data);
		root.leftNode = new Node(30);
		sc.add(root.leftNode.data);
		root.leftNode.leftNode = new Node(10);;
		sc.add(root.leftNode.leftNode.data);
		root.rightNode = new Node(60);
		sc.add(root.rightNode.data);
		root.rightNode.leftNode = new Node(55);
		sc.add(root.rightNode.leftNode.data);
		
		//To display the input
		
		 	System.out.print("Input Tree :-  ");
		 	
		 	for (int i =0; i<sc.size(); i++) {
		 		if ( i == sc.size() - 1) {
		 			System.out.print(sc.get(i));
		 		} else {
		 			System.out.print(sc.get(i) + "  ");
		 		}
		 	}
		  
		 	System.out.println();
			System.out.println();
		
		//Creating the output object	
	     ArrayList<Integer> output = BinarySearchTreeTraversal.traversal(root);

		 //To Display the output	
	     System.out.print("Output Tree :-  ");
		 	
		 	for (int i =0; i<output.size(); i++) {
		 		if ( i == sc.size() - 1) {
		 			System.out.print(output.get(i));
		 		} else {
		 			System.out.print(output.get(i) + "  ");
		 		}
		 	}

	  }

}

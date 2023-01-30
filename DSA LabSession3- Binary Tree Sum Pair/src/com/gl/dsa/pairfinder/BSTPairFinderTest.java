package com.gl.dsa.pairfinder;

import com.gl.dsa.bst.BinarySearchTree;
import com.gl.dsa.bst.TestDataUtil;

import com.gl.dsa.internal.Log;


public class BSTPairFinderTest {
	public static void main(String[] args) {
		
//		test(120);
		test(60);
//		test(190);
//		test(500); //invalid data
	}

	private static void test(int sum) {
		
//		Log.ENABLE = true;
		
		
		BinarySearchTree tree = 
			TestDataUtil.sampleBST1();

		Log.ENABLE = true;

		BSTPairFinder finder 
			= new BSTPairFinder(tree);
		
		finder.findPair(sum);
		
		System.out.println("-----------------------");

		Log.ENABLE = false;

	}
}

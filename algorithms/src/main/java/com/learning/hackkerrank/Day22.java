package com.learning.hackkerrank;

import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		sc.close();
		
		int height = getHeight(root);
		System.out.println(height);
	}

	public static int getHeight(Node root) {
		if (root == null) {
			return -1;
		}

		return 1 + getHeight(root.left);
//		return 1 + getHeight(root.left) > getHeight(root.right) ? getHeight(root.left) : getHeight(root.right);
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

}

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
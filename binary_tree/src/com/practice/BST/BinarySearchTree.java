package com.practice.BST;

public class BinarySearchTree {

	class Node {
		
		Node left, right;
		int key;
		
		public Node(int data){
			this.key=data;
		}
	}
	
	Node root;
	
	void insert(int data){
		root=insertRec(root,data);
	}

	Node insertRec(Node root, int data){
		
		if(root==null){
			root= new Node(data);
			return root;
		}
		
		if(data<root.key){
			root.left=insertRec(root.left,data);
		}
		else if(data>root.key){
			root.right=insertRec(root.right, data);
		}
		
		return root;
	}
	
	Node search(int data){
		return search(root, data);
	}
	
	Node search(Node root, int key){
		
		if(root==null || root.key==key){
			return root;
		}
		
		if(key<root.key){
			return search(root.left,key);
		}
		return search(root.right,key);
	}
	
	void inorderTraversal(){
		inorderTraversal(root);
	}
	
	void inorderTraversal(Node root){
		
		if(root!=null){
			inorderTraversal(root.left);
			System.out.print(root.key +" ");
			inorderTraversal(root.right);
		}
	}
	
	void delete(int key){
		root=delete(root,key);
	}
	
	Node delete(Node root, int key){
		
		if(root==null)
			return root;
		
		if(key<root.key){
			root.left=delete(root.left,key);
		}
		else if(key>root.key){
			root.right=delete(root.right,key);
		}
		else{
			
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			//find successor
			//below code is working fine, just want to check predeccessor as well
			root.key=findSuccessor(root.right);
			System.out.println(root.key);
			System.out.println(root.right.key);
			root.right=delete(root.right,root.key);
			
			//this below code is also works fine
//			root.key=findPredecessor(root.left);
//			root.left=delete(root.left,root.key);
		
		}
		
		return root;
	}
	
	int findSuccessor(Node root){
		int tmp=root.key;
		while(root.left!=null){
			tmp=root.left.key;
			root=root.left;
		}
		return tmp;
	}
	
	int findPredecessor(Node root){
		int tmp=root.key;
		while(root.right!=null){
			tmp=root.right.key;
			root=root.right;	
		}
		return tmp;
	}
}






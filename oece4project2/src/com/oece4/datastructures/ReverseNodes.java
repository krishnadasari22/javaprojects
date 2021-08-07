package com.oece4.datastructures;

public class ReverseNodes {

	public static void main(String[] args) {
		Node first=null
				first=createLinkedList(first,10);
		        first=createLinkedList(first,20);
		        first=createLinkedList(first,30);
		        first=createLinkedList(first,40);
		        display(first);
		        first=reverse(first);
		        display(first);
		

	}
	static Node createLinkedList(Node first,Object e) {
		if(first==null) {
			first=new Node(e,null);
			return first;
		}
		//adding a last node
		Node last=first;
		while(last.next!=null) {
			last=last.next;
		}
		static Node reverse(Node first)
		{
			if(first==null)return null;
			Node previousNode=null;
			Node cuuNode=first;
			Node nextNode=null;
			while(cuuNode!=null) {
				nextNode=currNode.next;
				currNode.next=previousNode;
				previousNode=currNode;
				currNode=nextNode;
			}
			return previousNode;
		}
		static void display(Node first) {
			Node currNode=first;
			while(currNode!=null) {
				System.out.println(currNode.e+"----->");
				currNode=currNode.next;
			}
			System.out.println("null");
		}
	}


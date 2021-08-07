package fifoqueue;

import jdk.internal.jimage.ImageReader.Node;

public class FIFOQueue000 {
	private Node first;
	private int count;
	public void add1(Object e) {
		//creating a first node
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		//adding a last node
		Node last=first;
		while(last.next!=null) {
			last=last.next;
		}
		public Object peek() {
			if(first==null)return null;
			return first.e;
		}
		public Object poll() {
			if(first==null)return null;
			Object temp=first.e;
			first=first.next;
			count--;
			return temp;
		}
		public size() {
			return count;
			}
		public String toString() {
			if(first==null)return"[]";
			Node currNode=first;
			String str="["+currNode.e;
					+ "while(currNode.next!=null;"
					+ "str +=","+currNode.e;
		}
		str+="]";
		return str;
		}
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node cueeNode=first;
		Node previousNode=null;
		while(currNode!=null) {
			if(c==null) {
				Comparable co=(Comparable)e;
				if(co.compareTo(currNode.e)<0)
					break;
			}else {
				if(c.compare(e,currNode.e)<0)break;
			}
			previousNode=currNode;
			currNode=currNode.next;
		}
		if(previousNode==null) {
			first=new Node(e,first);
			count++;
			return;
		}
		previousNode.next=new Node(e,previousNode.next);
		count++;		

	}

}

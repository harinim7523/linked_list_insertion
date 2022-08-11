import java.util.*;
public class insert {
	Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
		
	}
}

void insert_beg(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
}
void insert_last(int data) {
	Node temp=head;
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		return;
		
	}
	
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=newnode;
	newnode.next=null;
}
void printlist() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
}
void insertAfter(Node prev,int data) {
	if(prev==null) {
		System.out.println("Previous should not be null");
		return;
	}
	Node newnode=new Node(data);
	newnode.next=prev.next;
	prev.next=newnode;
}
void insertAfterposition(int val,int data) {
	Node newnode=new Node(data);
	Node temp=head;
	while(temp.data!=val) {
		temp=temp.next;
	}
	newnode.next=temp.next;
	temp.next=newnode;
}
void insertBeforeposition(int val,int data) {
	Node newnode=new Node(data);
	Node temp=head;
	while(temp.next.data!=val) {
		temp=temp.next;
	}
	newnode.next=temp.next;
	temp.next=newnode;
}
public static void main(String args[]) {
	insert l=new insert();
	l.insert_last(6);
	l.insert_beg(7);
	l.insert_beg(1);
	l.insert_last(4);
	l.insertAfter(l.head.next, 8);
	l.insertAfterposition(1, 10);
	l.insertBeforeposition(4, 40);
	l.printlist();
}
}

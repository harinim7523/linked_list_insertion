import java.util.*;
public class delete {
Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
void push(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
		
		
	
}
void delete_beg() {
	Node temp;
	temp=head;
	head=head.next;
	
}
void delete_end() {
	Node temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null;
	
}
void delete_key(int d) {
	Node temp=head;
	Node prev=null;
	if(temp!=null && temp.data==d) {
		head=temp.next;
		return;
	}
	while(temp!=null && temp.data!=d) {
		prev=temp;
		temp=temp.next;
	}
	if(temp==null) {
		System.out.println("No such element exists");
		return;
	}
	prev.next=temp.next;
	
}
void delete_pos(int pos) {
	Node temp=head;
	Node prev=null;
	int p=pos;
	for(int i=1;i<=pos;i++) {
		prev=temp;
		temp=temp.next;
				
	}
	prev.next=temp.next;
}
void delete_list() {
	head=null;
	System.out.println("List is deleted");
	
}
void printl() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}

public static void main(String args[]) {
	delete l=new delete();
	l.push(8);
	l.push(7);
	l.push(6);
	l.push(5);
	l.push(4);
	l.push(3);
	l.push(2);
	l.push(1);
	l.printl();
	System.out.println("delete beginning");
	l.delete_beg();
	l.printl();
	System.out.println("delete end");
	l.delete_end();
	l.printl();
	System.out.println("delete position");
	l.delete_pos(3);
	l.printl();
	System.out.println("delete key");
	l.delete_key(4);
	l.printl();

	System.out.println("To delete the linked list");
	l.delete_list();
	
	l.delete_beg();
	
	
	
	
}
}

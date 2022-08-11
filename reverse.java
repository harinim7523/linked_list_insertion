
public class reverse {
	Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
		
	}
}


void insert(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
}
void rev() {
	Node current=head;
	Node prev=null;
	Node next=null;
	while(current!=null) {
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		
				
	}
	System.out.print("The list after reversal:");
	Node temp=prev;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("NULL"+"\n");
	
}

void printlist() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("NULL"+"\n");
}

public static void main(String args[]) {
	reverse s=new reverse();

	s.insert(1);
	s.insert(2);
	s.insert(3);
	System.out.print("The list before reversal:");
	s.printlist();
	s.rev();
	
	
	
	
}
}

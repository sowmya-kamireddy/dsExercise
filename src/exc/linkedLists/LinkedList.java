package exc.linkedLists;

public class LinkedList {
	
	public class Node{
		int data;
		Node next;
		
		Node(int value){
			data = value;
		}
	}
	
	Node head;
	
	// Insert at Head
	public void add(int value){
		System.out.println("Add :"+value);
		Node temp = new Node(value);
		temp.next = head;
		head = temp;
	}
	
	// Delete at Head
	public void remove(){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	
	// Delete a node given a value
	public void remove(int value){
		if(head==null)
			return;
		Node next = head.next;
		Node curr = head;
		if(curr.data == value)
			remove();
		else{
			while(next!=null){
				if(next.data==value){
					curr.next = next.next;
					break;
				}else{
					next = next.next;
				}
			}
		}
	}
	
	// Delete a node at specified position
	public void removeNthPosition(int position){
		if(head==null)
			return;
		if(position==0){
			head = head.next;
		}else{
			Node prev = head;
			for(int i=1;prev.next!=null;i++){
				if(i==position){
					prev.next = prev.next.next;
					break;
				}else{
					prev = prev.next;
				}
			}		
		}	
	}
	
	// Get list size in iterative approach
	public int iterativeSize(){
		int size = 0;
		Node temp = head;
		while(temp!=null){
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	// Get list size in recursive approach
	public int recursiveSize(){
		return subRecurSize(head);
	}
	
	private int subRecurSize(Node n){
		if(n!=null)
			return 1+subRecurSize(n.next);
		else return 0;
	}
	
	// Search specific value from the list in iterative approach
	public boolean iterativeSearch(int value){
		Node temp=head;
		while(temp!=null){
			if(temp.data==value)
				return true;
			else
				temp = temp.next;
		}
		return false;
	}
	
	// Search specific value from the list in recursive approach
	public boolean recursiveSearch(int value){
		return subSearch(head,value);
	}
	
	private boolean subSearch(Node n, int value){
		if(n==null)
			return false;
		if(n.data==value)
			return true;
		else
			return subSearch(n.next,value);
	}
	
	// Return node value at specified index
	public int nodeAtIndex(int index){
		Node temp= head;
		for(int i=0;temp!=null;i++){
			if(i==index)
				return temp.data;
			else
				temp = temp.next;
		}
		return -99999;
	}
	
	public void print(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("\n");
	}
	
}

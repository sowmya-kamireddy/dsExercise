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
	
	public void add(int value){
		System.out.println("Add :"+value);
		Node temp = new Node(value);
		temp.next = head;
		head = temp;
	}
	
	public void remove(){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	
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
	
	public int iterativeAppSize(){
		int size = 0;
		Node temp = head;
		while(temp!=null){
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public int recurAppSize(){
		return subAppSize(head);
	}
	
	private int subAppSize(Node n){
		if(n!=null)
			return 1+subAppSize(n.next);
		else return 0;
	}
	
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

package exc.linkedLists;

public class Main {

	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.remove();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Full List");
		list.print();
		System.out.println("Remove op");
		list.remove();
		list.print();
		list.add(3);
		list.print();
		System.out.println("Remove specific value - 3");
		list.remove(3);
		list.print();
		System.out.println("Remove specific value - 1");
		list.remove(1);
		list.print();
		list.add(3);
		list.add(1);
		list.print();
		System.out.println("Remove specific value - 3");
		list.remove(3);
		list.print();
		list.add(3);
		list.print();
		System.out.println("Remove 0th Pos");
		list.removeNthPosition(0);
		list.print();
		list.add(3);
		list.print();
		System.out.println("Iterative approach size");
		int size = list.iterativeAppSize();
		System.out.println(size);
		System.out.println("Remove 2nd Pos");
		list.removeNthPosition(2);
		list.print();
		list.add(2);
		list.print();
		System.out.println("Recurrsive approach size");
		size = list.recurAppSize();
		System.out.println(size);
		System.out.println("Remove 1st Pos");
		list.removeNthPosition(1);
		list.print();
		list.add(3);
		list.print();
		System.out.println("Itr Search 3");
		boolean search = list.iterativeSearch(3);
		System.out.println(search);
		System.out.println("Rec Search 3");
		search = list.recursiveSearch(3);
		System.out.println(search);
		System.out.println("Itr Search 1");
		search = list.iterativeSearch(1);
		System.out.println(search);
		System.out.println("Rec Search 1");
		search = list.recursiveSearch(1);
		System.out.println(search);
		System.out.println("Itr Search 2");
		search = list.iterativeSearch(2);
		System.out.println(search);
		System.out.println("Rec Search 2");
		search = list.recursiveSearch(2);
		System.out.println(search);
		System.out.println("Itr Search 4");
		search = list.iterativeSearch(4);
		System.out.println(search);
		System.out.println("Rec Search 4");
		search = list.recursiveSearch(4);
		System.out.println(search);
	}
	
}

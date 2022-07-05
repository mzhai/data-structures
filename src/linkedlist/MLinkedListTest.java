package linkedlist;

public class MLinkedListTest {
	public static void main(String[] args) {
		MLinkedList<String> ll = new MLinkedList<String>();
		MLinkedList<String> ll2 = new MLinkedList<String>();
		
		//insert
		System.out.println("Inserting elements");
		ll.insert("a");
		ll.insert("b");
		ll.insert("q");
		ll.insert("s");
		ll.insert("r");
		ll.print();
		
		//delete
		System.out.println("Delete nonexistent:" + ll.deleteFirst("e"));
		ll.print();
		System.out.println("Delete head:" + ll.deleteFirst("a"));
		ll.print();
		System.out.println("Delete mid:" + ll.deleteFirst("q"));
		ll.print();
		System.out.println("Delete end:" + ll.deleteFirst("r"));
		ll.print();
		
		System.out.println("Delete empty:" + ll2.deleteFirst("e"));
		ll2.print();
		
		//reverse
		System.out.println("Inserting elements");
		ll.insert("a");
		ll.insert("b");
		ll.insert("q");
		ll.insert("s");
		ll.insert("r");
		ll.print();
		
		System.out.println("Reverse ll");
		ll.reverse();
		ll.print();
	}
}

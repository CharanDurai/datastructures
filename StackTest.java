public class StackTest {
	
	private LinkedListTest list = new LinkedListTest();
	
	private Node top;
	
	public void push(int value) {
		list.insertAtBegin(value);
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		Node temp = list.head;			
		list.head = list.head.next;
		temp.next = null;
		return temp.value;
	}

	private boolean isEmpty() {
		return list.head == null;
	}
	
	public int peek() {
		if(isEmpty()) 
			return -1;
		return list.head.value;
	}
	
	public void traverse() {
		list.traverse();
	}

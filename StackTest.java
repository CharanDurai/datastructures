public class StackTest {
	
	private Node head;
	
	public void push(int value) {
		insertAtBegin(value);
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		Node temp = head;			
		head = head.next;
		temp.next = null;
		return temp.value;
	}

	private boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		if(isEmpty()) 
			return -1;
		return head.value;
	}
	
	public void traverse() {
		if(head ==null) {
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);	
	}
	
	private void insertAtBegin(int input) {
		Node inputNode = new Node(input);
		
		if(head ==null) {
			head = inputNode;
			return;
		}
		inputNode.next = head;
		head = inputNode;
		return;
	}

}

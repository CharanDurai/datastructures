public class Queue {
	
	
	public Node front;
	
	public Node rear;
	
	public void enqueue(int value) {
		if(rear == null) {
			rear = front = new Node(value);
		} else {
			Node temp = new Node(value);
			rear.next = temp;
			rear = rear.next;
		}
			
	}
	
	public int dequeue() {
		if(front == null) {
			return -1;
		} else {
			Node temp = front.next;
			int value = front.value;
			front.next = null;
			front = temp;
			return value;
		}
			
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void traverse() {
		if(front ==null) {
			return;
		}
		Node temp = front;
		while(temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);	
	}
	
	public int peek() {
		if(isEmpty()) 
			return -1;
		return front.value;
	}

}

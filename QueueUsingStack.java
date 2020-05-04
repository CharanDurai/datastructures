public class QueueUsingStack {
	
	StackTest stack1 = new StackTest();
	
	StackTest stack2 = new StackTest();
	
	public void enqueue(int value) {
		stack1.push(value);
	}
	
	public int dequeue() {
		if(stack1.head == null)
			return -1;
		Node temp = stack1.head;
		if(temp.next == null) {
			int result = temp.value;
			stack1.head = temp = null;
			return result;
		}
		while(temp.next.next != null) {
			stack2.push(temp.value);
			temp = temp.next;
		}
		stack2.push(temp.value);
		int result = temp.next.value; 
		stack1.head = null;
		temp = stack2.head;
		while(temp.next != null) {
			stack1.push(temp.value);
			temp = temp.next;
		}
		stack1.push(temp.value);
		stack2.head = null;
		return result;
	}
	
    public void traverse() {
    	stack1.traverse();
	}

}

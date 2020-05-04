public class StackUsingQueue {

	private Queue queue1 = new Queue();
	
	private Queue queue2 = new Queue();
	
	public void push(int value) {
		if(!queue1.isEmpty())
		   queue1.enqueue(value);
		else
		   queue2.enqueue(value);
	}
	
	public int pop() {
		if(!queue1.isEmpty())
			return transferData(queue1, queue2);
		else if(!queue2.isEmpty())
			return transferData(queue2, queue1); 
		else
			return -1;
	}

	private int transferData(Queue source, Queue destination) {
		Node temp = source.front;
		while(temp.next.next != null) {
			destination.enqueue(temp.value);
			temp = temp.next;
		}
		destination.enqueue(temp.value);	
		source.front = source.rear = null;
		return temp.next.value;
	}
	
	public void traverse() {
		if(!queue1.isEmpty())
			queue1.traverse();
		else
			queue2.traverse();
	}
	
	
	
}


public class ReverseLinkedList {
	Node head;
	Node end;
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		
		Node newNode = list.new Node(5);
		Node newNode1 = list.new Node(6);
		Node newNode2 = list.new Node(8);
		list.add(newNode);
		list.add(newNode1);
		list.add(newNode2);
		list.end = newNode2;
//		list.reverse(newNode);
		Node temp = list.head;
		for(int i = 0; i < list.getSize(); i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		list.add(temp);
		System.out.println(temp);
	}

	public ReverseLinkedList()
	{
		this.head = head; //pointer 
		this.end = end; //pointer 
		
	}
	
	class Node //inner class
	{
		int data;
		Node next;
		
		//constructor for Node
		public Node(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	
//	Add (adds an element to the end of the linked list)
	public void add(Node newNode) //passing in a new node 
	// you can also do int in parameter and create the node insid of the method 
	//Node newNode = new Node;
	{
		//base case, empty linkedList
		if(this.head == null) //no head then end will be empty as well
		{
			this.head = newNode; //pointing the head to the new node
			this.end = newNode;
		}
		//linkedList is not empty
		else 
		{
//			Node temp = head; //update the pointer
//			while(temp.next != null)
//			{
//				temp = temp.next;
//			}
//			temp.next = newNode;
//			this.end = newNode;
			this.end.next = newNode;
			this.end = newNode;
		}
	}
	
	public int getSize()
	{
		int count = 0;
		Node temp = head;
		while(temp != null)// if the current temp is not null
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public void reverse(Node node)
	{
		Node prev = null;
		Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
	}
}

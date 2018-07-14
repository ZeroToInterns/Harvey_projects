
public class LinkedList {
	
	Node head;
	Node end;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node newNode = list.new Node(5);
		Node newNode1 = list.new Node(6);
		Node newNode2 = list.new Node(8);
		Node newNode3 = list.new Node(7);
		list.insert(newNode3, 2);
		
		Node temp = list.head;
		for(int i = 0; i < list.getSize(); i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		list.add(newNode);
		list.add(newNode1);
		list.add(newNode2);
		System.out.println(list.head.data); //.data gives you the data in the node
		System.out.println(list.end.data); 
	}
	
	public LinkedList()
	{
		this.head = null; //pointer 
		this.end = null; //pointer 
		
	}
	
	public class Node //inner class
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
	
//	Insert (inserts an element anywhere in the linked list)
	public void insert(Node newNode,int index) // always start at 0 for node
	{

		if(this.head == null && index != 0) //no head then end will be empty as well
		{
			this.head = newNode; //pointing the head to the new node
			this.end = newNode;
		}
		//index is invalid
		else if(index > this.getSize() || index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		else 
		{
			Node temp = head;
			for (int i = 0; i < index - 1 ; i++)
			{
				temp = temp.next;
			}
			newNode.next = temp.next; // the next element after temp 
			temp.next = newNode;
		}
	}
	
//	Delete (Deletes any element from the linked list)
	
	public void deleteNode(Node node)
	{
		Node temp = head;
		if (temp.data == node.data)
		{
			temp = temp.next;
		}
		
		while(temp.next.data != node.data)
		{
			temp = temp.next;
		}
		temp.next = temp.next;
	}
//	getSize returns the number of nodes in the list
	
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
}

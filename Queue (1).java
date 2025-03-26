class Node
{
	int data;
	Node next;
	public Node (it data)
	{
		this.data=data;
		this.next=null;
 	}
}
class Queue
{
	Node front;
	Node rear;
	int size;
public Queue()
{
	front=rear=null;
	size=0;
}
public void enqueue (int data)
{
	Node newNode=new Node(data);
	if(rear)==null
	{
		front=rear=newNode;
	}
	else
	{
		rear.next=newNode;
		rear=newNode;
	}
	size++;
}
public int dequeue()
{
	if(isEmpty())

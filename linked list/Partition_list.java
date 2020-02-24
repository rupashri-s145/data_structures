import java.util.*;
	class Node
	{
	int data;
	Node next;
	Node(int value)
	{
	data=value;
	}
	}
	public class partition_List
	{
	Node head;
	

	void insert_List(int value)
	{
	Node newnode=new Node(value);
	Node temp=this.head;
	if(this.head==null)
	{
	this.head=newnode;
	}
	else
	{
	while(temp.next!=null)
	{
	temp=temp.next;
	}
	temp.next=newnode;
	}
	}
	

	void0 partition_Element(int value)
	{
	Node temp=this.head;
	partition_List left=new partition_List();
	partition_List right=new partition_List();
	while(temp!=null)
	{
	if(temp.data<value)
	{
	left.insert_List(temp.data);
	}
	if(temp.data>=value)
	{
	right.insert_List(temp.data);
	}
	temp=temp.next;
	}
	left.printList();
	right.printList();
	}
	

	void printList()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		
		}
		System.out.println("NULL");
	}
	

	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int totalnodes=sc.nextInt();
	partition_List part=new partition_List();
	

	for(int i=0;i<totalnodes;i++)
	{
	int value=sc.nextInt();
	part.insert_List(value);
	}
	part.printList();
	int part_element=sc.nextInt();
	part0.partition_Element(part_element);
	}
	}

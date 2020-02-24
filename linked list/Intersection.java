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
	

	void insertList(int value)
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
	

	void partition_List(int value)
	{
	Node temp=this.head;
	partition_List left=new partition_List();
	partition_List right=new partition_List();
	while(temp!=null)
	{
	if(temp.data<value)
	{
	left.insertList(temp.data);
	}
	if(temp.data>=value)
	{
	right.insertList(temp.data);
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
	partition_List k=new partition_List();
	

	for(int i=0;i<totalnodes;i++)
	{
	int value=sc.nextInt();
	insec.insertList(value);
	}
	k.printList();
	int partitionelement=sc.nextInt();
	k.partition_List(partitionelement);
	

	

	

	}
	}

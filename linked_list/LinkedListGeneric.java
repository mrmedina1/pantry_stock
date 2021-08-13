package linked_list;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LinkedListGeneric<T extends Item>
{
	private static class Node<T>
	{
		private T data;		//Instance variable
		private Node<T> next;

		//constructor
		private Node()
		{
			data = null;
			next = null;
		}
			
		//constructor to initialize data in node.  data will be null if not initialized
		//this.data is the instance variable above, data is the local variable (parameter of this method)
		private Node(T data)
		{
			this.data = data;
			next = null;
		}
	}

	private Node<T> head;				//Instance variables
	private Node<T> tail;
	private int length = 0;
	
	public LinkedListGeneric()
	{
		head = null;
		tail = null;
	}
	
	public void insertTail(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if (tail == null)
			head = tail = newNode;
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

//INSERT METHOD; IMPLEMENTATION WAS BEING DONE FOR INSERTING ON ALPHABETICAL ORDER.  UNFINISHED.
/*
	public void insert(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if (head == null)
			head = tail = newNode;
		else
		{
			//newNode.next = head;
			//head = newNode;
			Node<T> currentNode = head;
			//Finds correct position.  currentNode string < newNode string
			while (currentNode.data.grocery.compareTo(newNode.data.grocery) < 0)
			{
				if (currentNode.next == null) break;
				currentNode = currentNode.next;
			}
		}
		length++;
	}
*/
//IMPLEMENT DELETE BY ITEM NAME, DECREMENT BY 1, IF ITEM IS 0 DELETE ITEM FROM LIST	
	//Each delete is O(1) constant time
	public void deleteHead()
	{
		if (head == null)
			System.out.println("The list is empty, cannot delete head.");
		else if (head == tail)
		{
			head = tail = null;
			length--;
		}
		else
		{
			head = head.next;
			length--;
		}
	}
	
	public void printList()
	{
		if (head == null)
			System.out.println("The list is empty.");
		Node<T> currentNode = head;
		while (currentNode != null)
		{
			System.out.println(currentNode.data.grocery + " " + currentNode.data.quantity);
			currentNode = currentNode.next;
		}
	}
//NEXT: WRITE WHOLE LIST TO FILE
	public void writeList() {
		String fileName = "newList.txt";
		
		if (head == null)
			System.out.println("The grocery list is empty, no data has been saved.");
		else {
			try {
				FileWriter fileWriter = new FileWriter(fileName);
				PrintWriter printWriter = new PrintWriter(fileWriter);
				printWriter.print(head.data.grocery + " " + head.data.quantity);
				//printWriter.printf("Product name is %s and its price is %d $", "Sam", 1000);
				printWriter.close();
			}
			catch(IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
	
	public void printLength()
	{
		System.out.println("Current length of list is : " + length);
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void destroy()
	{
		if  (head == null)
			System.out.println("There is no list to destroy.");
		else
		{
			while (head != null)
			{
				head = head.next;
				length--;
			}
			System.out.println("The list has been destroyed");
		}
	}
/*
	public void insertHead(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if (head == null)
			head = tail = newNode;
		else
		{
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	//Each delete is O(1) constant time
	public void deleteHead()
	{
		if (head == null)
			System.out.println("The list is empty, cannot delete head.");
		else if (head == tail)
		{
			head = tail = null;
			length--;
		}
		else
		{
			head = head.next;
			length--;
		}
	}
	
	public void printHead()
	{
		if (head == null)
			System.out.println("The list is empty, there is nothing to print.");
		else
			System.out.println(head.data);
	}
*/
	public T getHead()
	{
		return head.data;
	}
/*
	public void insertTail(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if (tail == null)
			head = tail = newNode;
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	//Each delete is O(n)
	public void deleteTail()
	{
		if (head == null)
			System.out.println("The list is empty, cannot delete tail.");
		else if (head.next == null)
		{
			head = tail = null;
			length--;
		}
		else
		{
			Node<T> nextNode = head;
			Node<T> previousNode = new Node<T>();
			while (nextNode.next != null)
			{
				previousNode = nextNode;
				nextNode = nextNode.next;
			}
			tail = previousNode;
			tail.next = null;
			length--;
		}
	}
	
	public void printTail()
	{
		if (tail == null)
			System.out.println("The list is empty, there is nothing to print.");
		else
			System.out.println(tail.data.grocery);
	}
	
	public T getTail()
	{
		return tail.data;
	}
*/
}
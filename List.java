import java.util.*;

public class List{
	
	private ListElement head;
	
	public List()
	{
		head = new ListElement();
	}
	
	public void addElement(ListElement le)
	{
		ListElement temp = new ListElement();
		ListElement current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		temp.setData(le.getData());
		current.setNext(temp);
	}
	
	public ListElement getElement(int index)
	{
		if (index <= 0)
			return null;
		
		ListElement current = head.getNext();
		for (int i = 1; i < index; i++)
		{
			if (current.getNext() == null)
			{
				return null;
			}
			current = current.getNext();
		}
		return current;
	}
	
	public ListElement deleteElement(int index)
	{	
		ListElement current = head;
		for (int i = 1; i < index; i++)
		{
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		return current;
	}
	
	/*public void printLinkedListTail()
	{
		
	}*/
	
	public void printLinkedListHead()
	{
		ListElement current = head.getNext();
		while (current != null)
		{
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
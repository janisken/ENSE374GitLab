import java.io.IOException;
import java.util.*;

public class ListElementMain{
	
	public static void main (String[] args)
	{
		ListElement le = new ListElement();
		List l = new List();
		le.setData(5);
		l.addElement(le);
		le.setData(4);
		l.addElement(le);
		le.setData(3);
		l.addElement(le);
		le.setData(2);
		l.addElement(le);
		le.setData(1);
		l.addElement(le);
		
		l.printLinkedListHead();
		
		ListElement x = l.getElement(4);
		System.out.println(x.getData());
		
		l.deleteElement(4);
		l.printLinkedListHead();
	}
}
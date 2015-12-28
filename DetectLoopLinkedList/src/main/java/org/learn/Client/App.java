package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.DetectLoop;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {30,35,40,45,50,55};
		Node node30 = new Node(data[0]);
		Node node = null;
		for(int count = 1; count < data.length; count++)
			node = DetectLoop.insert(node30,data[count]);
		node.next = node30;
		
		node = new Node (20);
		node.next = new Node (25);
		node.next.next = node30;
		DetectLoop.isLooped(node);		
    }
}

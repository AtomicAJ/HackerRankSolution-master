package HackerRank;

public class MergeTwoLinkedList {
	
	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedListNode node1= new SinglyLinkedListNode(1);
		node1.next=new SinglyLinkedListNode(2);
		node1.next.next= new SinglyLinkedListNode(3);
		
		SinglyLinkedListNode node2= new SinglyLinkedListNode(3);
		node2.next=new SinglyLinkedListNode(4);
		
		SinglyLinkedListNode temp1=node1;
		SinglyLinkedListNode temp2=node2;
		
		while(!temp2.next.equals(null))
		{
			if(temp1.data>=temp2.data)
			{
				SinglyLinkedListNode temp=temp1;
				temp1=new SinglyLinkedListNode(temp2.data);
				temp1.next=temp;
			}
			temp2=temp2.next;			
		}
		
	}

}

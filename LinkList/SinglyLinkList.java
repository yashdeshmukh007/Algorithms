package LinkList;

public class SinglyLinkList {

    private  Node head;
    private int size;
    private Node tail;

    SinglyLinkList()
    {
        this.size=0;
    }
    private class Node
    {    
        private int value;
        private Node next;
        Node(int value)
        {
            this.value=value;
        }
        Node()
        {

        }
    }
    private void insertFirst(int value)
    {
        Node node= new Node();
        node.value=value;
        if(head==null)
        {    
            head=node;
            tail=head;
            size++;
        }
        else
        {
            Node temp=head;
            head=node;
            head.next=temp;
            size++;
        }

    }

    private void insertIndex(int value,int index)
    {
        if(head==null)
        {
            insertFirst(value);
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node =new Node(value);
        Node temp2=temp.next;
        temp.next=node;
        node.next=temp2;
    }
    private void insertLast(int value)
    {
        if(head==null)
        {
            insertFirst(value);
        }
        else
        {
            Node node= new Node(value);
            tail.next=node;
            tail=node;
            size++;

        }
    }


    private void deleteFirst()
    {
        if(head==null)
        {
            System.out.print("empty");
        }
        else{
            Node temp=head.next;
            head=temp;
           
        }
    }
    private void deleteIndex(int index)
    {
        if(head==null)
        {
            System.out.print("Empty");
        }
        else
        {
            Node temp=head;
            for(int i=1;i<index;i++)
            {
                temp=temp.next;
            }
            Node temp2=temp.next;
            temp.next=temp2.next;
        }
    }
    private  void deleteLast()
    {
        if(head==null)
        {
            System.out.print("empty");
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        
    }






    private void display()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("End");
        }
    }

    public static void main(String args[])
    {
        SinglyLinkList ll =new SinglyLinkList();
        ll.insertFirst(10);
        ll.insertFirst(12);
        ll.insertFirst(23);
        ll.insertLast(22);
        ll.insertFirst(20);
        ll.insertFirst(55);
        ll.insertIndex(50,2);
        ll.deleteFirst();
        ll.deleteLast();
        ll.deleteIndex(2);
        ll.display();
    }

    
}

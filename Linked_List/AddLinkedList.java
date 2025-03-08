package Linked_List;

public class AddLinkedList {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add element in first node
    public void add_first(int data)
    {
        Node newnode=new Node((data));
        size++;
        if (head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    // add element in last node
    public void add_last(int data)
    {
        Node newnode=new Node((data));
        size++;
        if (head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    //add element at index
    public void add(int idx, int data)
    {
        if (idx==0)
        {
            add_first(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    //delete element at first index
    public int delete_first()
    {
        if (size==0)
        {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
                int val= head.data;
                head=tail=null;
                size=0;
                return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }

    //delete element at last index
    public int delete_last()
    {
        if (size==0)
        {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for (int i=0;i<size-2;i++)
            prev=prev.next;

        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //Search iterative
    public int itrsearch(int key)
    {
        Node temp=head;
        int i=0;
        while (temp!=null)
        {
            if (temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //Search Recursive
    public int helper(Node head, int key)
    {
        if (head==null)
            return -1;
        if (head.data==key)
            return 0;
        int idx=helper(head.next,key);
        if (idx==-1)
            return -1;
        return idx+1;
    }
    public int reSearch(int key)
    {
        return helper(head,key);
    }

    //reverse linked list
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //delete nth position
    public void deletenth(int n)
    {
        int sz=0;
        Node temp=head;
        while (temp!=null)
        {
            temp=temp.next;
            sz++;
        }

        if (n==sz)
        {
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while (i<iToFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //palindrome
    public Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast==null && fast.next==null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpalindrome()
    {
        if (head==null || head.next!=null)
        {
            return true;
        }
        //find midNode
        Node midnode=findmid(head);

        //Reverse
        Node prev=null;
        Node curr=midnode;
        Node next;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //1st half==2nd half
        while (right!=null)
        {
            if (left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    //print linked list
    public void print()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddLinkedList ll=new AddLinkedList();
        ll.add_first(2);
        ll.add_first(1);
        ll.add_last(2);
        ll.add_last(1);
        ll.add_first(5);


        ll.print();
        System.out.println(ll.checkpalindrome());

//        ll.reverse();
//        ll.print();
//        ll.deletenth(3);
//        ll.print();
//        ll.delete_first();
//        ll.delete_last();
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.itrsearch(3));
//        System.out.println(ll.itrsearch(10));
//        System.out.println(ll.reSearch(9));
//        System.out.println(ll.reSearch(15));
    }
}

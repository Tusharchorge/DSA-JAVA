public class LinkedlistImpl{
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;


       void InsertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;


        }

        void display(Node head){
        Node temp=head;
        while(head!=null){
            System.out.println(head.data+"");
            head=head.next;
        }
        }

        int size(){
            Node temp=head;
            int count=0;
            while(head!=null){
                count++;
                head=head.next;

            }
            return count;
        }
    }



    public static void main(StringVowels[] args) {
        linkedlist ll=new linkedlist();
        ll.InsertAtEnd(2);
        // ll.display();
         System.out.println(ll.size());
    }
}
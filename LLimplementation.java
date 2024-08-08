public class LLimplementation{

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;

        }
        public static class linkedlist{
            Node head=null;
            Node tail=null;

            void display(Node head){
                Node temp=head;
                while(head!=null){
                    System.out.println(head.data+"");
                    head=head.next;
                    
                }
            }
        }
    }
    public static void main(StringVowels[] args) {
        linkedlist ll=new linkedlist();
        ll.display();
    }
}
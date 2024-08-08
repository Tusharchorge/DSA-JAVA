public class BasicsLL{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }
    public static void main(StringVowels[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;


 
    
        System.out.print(a.data+"->"+a.next.data+"->"+b.next.data+"->"+c.next.data);
         

    }
}

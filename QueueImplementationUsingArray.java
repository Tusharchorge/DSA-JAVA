public class QueueImplementationUsingArray{
    public static class Queue{
        int f=-1;
        int r=-1;
        int arr[]=new int[6];
        int size=0;
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }else{
            arr[++r]=val;
        }
        size++;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
                f++;
                size--;
            return arr[f-1];
        }
        public int peek(){
            return arr[f];
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

    }
 public static void main(StringVowels[] args) {
    Queue q=new Queue();
    System.out.println(q.isEmpty());
    q.display();
    q.add(1);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.display();
    System.out.println(q.peek());
    q.remove();
    q.display();
    System.out.println(q.size());
 }
}
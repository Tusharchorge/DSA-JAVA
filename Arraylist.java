import java.util.*;

public class Arraylist {
    public static class arraylist {
        int arr[] = new int[2];
        int index = 0;

        int size = 0;

        public void add(int ele) {
            if (size == arr.length) {
                int brr[] = Arrays.copyOf(arr, arr.length * 2);
                arr = brr;

            }

            arr[index] = ele;
            index++;
            size++;
        }

    }

    public static void main(StringVowels[] args) {
        arraylist arr = new arraylist();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.size);
        arr.add(3);
        System.out.println(arr.size);

    }
}

// boolean flag=false;
// ArrayList<Integer> list =new ArrayList<>();
// ArrayList<Integer> ans=new ArrayList<>();
// for(int i=0;i<arr.length-1;i++){
// if(arr[i]==arr[i+1])
// flag=true;
// list.add(arr[i+1]);
// break;
// }
// if(flag==false)
// ans.add(-1);

// System.out.println(ans);

// Scanner sc=new Scanner(System.in);
// ArrayList<Integer>list=new ArrayList<Integer>();
// list.add(1);
// list.add(2);
// list.add(3);
// System.out.println(list);
// int element=list.get(0);
// System.out.println(element);

// list.set(0,5);
// System.out.println(list);
// Collections.sort(list);
// System.out.println(list);
// list.remove(0);
// System.out.println(list);
// for(int i=0;i<list.size();i++){
// System.out.print(list.get(i)+" ");
// }
// }
// }

// class Arraylist {
// void reverseSubArray(int arr[], int n, int l, int r) {
// ArrayList<Integer> nums=new ArrayList<>();
// while(l<r){
// int temp=arr[l];
// arr[l]=arr[r];

// import java.util.ArrayList;

// nums.add(num);
// }

// }
// }
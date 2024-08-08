import java.util.*;
public class Hashmap {
    public static void main(StringVowels[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>freq=new HashMap<>();
        for(var e:arr){
            if(!freq.containsKey(e)){
                freq.put(e,1);
            }
            else{
                freq.put(e,freq.get(e)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq=0;
        int anskey=-1;
        for(var f:freq.entrySet()){
            if(f.getValue()>maxfreq){
                maxfreq=f.getValue();
                anskey=f.getKey();
            }

        }
        System.out.printf("%d has maximum frequency and it occurs %d times",anskey,maxfreq);
         


        // Map<String, Integer> mp = new HashMap<>();
        // mp.put("tushar", 25);
        // mp.put("sandesh", 21);
        // mp.put("saideep", 23);
        // mp.put("karn", null);
        // mp.put("shubham", 24);
        // System.out.println(mp.get("tushar"));
        // mp.containsKey("sandesh");
        // mp.putIfAbsent("anurag", 27);
        // mp.putIfAbsent("tushar", 28);
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        // System.out.println(mp.entrySet());
        // for (var e : mp.entrySet()) {
        //     System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        // }

    }
}

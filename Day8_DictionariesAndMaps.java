//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of phone lines book entries
        Map<String,Integer> phoneMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            in.nextLine();
            phoneMap.put(name,phone); 
        }
        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneMap.containsKey(s)) 
            // could also use if (phoneMap.get(s) != null){}
            {
                System.out.println(s+"="+phoneMap.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

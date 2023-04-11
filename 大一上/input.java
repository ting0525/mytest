import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class input{
    public static void main(String[] arge){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("A" , 10);
        int x = mp.get("A");
        x = x+2;
        System.out.print(x);
    }
}
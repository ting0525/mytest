import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class homework4 {
    public static void main(String[] arge){
        Map<Character, Integer> mp = new HashMap<>();  //建表
        mp.put('A' , 10);
        mp.put('B' , 11);
        mp.put('C' , 12);
        mp.put('D' , 13);
        mp.put('E' , 14);
        mp.put('F' , 15);
        mp.put('G' , 16);
        mp.put('H' , 17);
        mp.put('I' , 34);
        mp.put('J' , 18);
        mp.put('K' , 19);
        mp.put('L' , 20);
        mp.put('M' , 21);
        mp.put('N' , 22);
        mp.put('O' , 35);
        mp.put('P' , 23);
        mp.put('Q' , 24);
        mp.put('R' , 25);
        mp.put('S' , 26);
        mp.put('T' , 27);
        mp.put('U' , 28);
        mp.put('V' , 29);
        mp.put('W' , 32);
        mp.put('X' , 30);
        mp.put('Y' , 31);
        mp.put('Z' , 33);
        while(true){
            Scanner scan = new Scanner(System.in);   
            String s = scan.nextLine();   //輸入目標字串
            int count=8,sum=0;            //count:整數的係數 sum:answer
            for(int i=0;i<s.length();i++){ //遍歷字串
                if(s.charAt(i) >= 'A' && s.charAt(i)<='Z'){  //如果是大寫字母(1)
                    char tmp = s.charAt(i);
                    int t = (mp.get(tmp)%10)*9+(mp.get(tmp)/10);
                    sum += t;
                }
                else if(count==0)  sum += (int)(s.charAt(i)-'0');   //如果是最後一個字元(2)
                else{                                       //中間數字(3)
                    sum += ((int)s.charAt(i)-'0')*count;
                    count--;
                }
            } 
            System.out.printf("sum:%d\n" , sum);
        }
        
    }
}

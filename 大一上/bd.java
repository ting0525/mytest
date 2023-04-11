import java.util.Scanner;
import java.math.*;
public class bd {
    static int dec(int Bbin){
        int count = 0;
        int sum=0;
        while(Bbin>0){
            sum += (Bbin%10)<<count;
            Bbin /= 10;
            count++;
        }
        return sum;
    }
    static double dec(String num){
        int len = num.length();
        boolean flag = false;
        double sum=0;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(num.charAt(i) == '.'){
                flag = true;
            }
            if(flag==true){
                if(num.charAt(i)=='1'){
                    sum = sum+Math.pow(2,cnt);
                }
                cnt--;
            }
        }
        return sum;
    }
    public static void main(String [] arge){
        Scanner scan = new Scanner(System.in);
        while(true){
            String num = scan.nextLine();
            int inum=0;
            double fnum=0;
            int count=0;
            int cnt=0;
            Boolean flag = false;
            for(int i=0;i<num.length();i++){
                if(num.charAt(i) == '.'){
                    flag = true;
                }
                if(flag == false && num.charAt(i) == '1'){
                    inum = inum*10+1;
                }
                else if(flag == false && num.charAt(i) == '0'){
                    inum = inum*10;
                }
                /* 
                if(flag == true && num.charAt(i) == '1'){
                    //System.out.printf("%d\n" , count);
                    fnum = fnum+Math.pow(10,count);
                }
                */
                if(flag == true){
                    count--;
                    cnt++;
                }
            }
            System.out.printf("%f\n" , dec(inum)+dec(num));
        }
    }    
}

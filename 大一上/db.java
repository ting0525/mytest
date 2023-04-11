import java.util.Scanner;
import java.math.*;
public class db {
    static int dec(int Bbin){
        int count = 0;
        int sum=0;
        while(Bbin>0){
            sum += (Bbin%2)*Math.pow(10,count);
            Bbin /= 2;
            count++;
        }
        return sum;
    }

    static double dec(String num){
        int len = num.length();
        boolean flag = true;
        double sum=0;
        for(int i=len-1;i>=0;i--){
            if(num.charAt(i) == '.'){
                flag = false;
            }
            if(flag==true){
                sum = sum/10+(num.charAt(i)-'0');
            }
        }
        sum /= 10;
        double ans=0;
        double cnt=-1;
        while(sum!=0){
            sum = sum*2;
            if(sum>=1){
                sum -= 1;
                ans = ans + Math.pow(10,cnt);
            }
            cnt--;
        }
        //System.out.println("sum:"+sum);
        return ans;
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
                if(flag == false ){
                    inum = inum*10+(num.charAt(i)-'0');
                }
                /* 
                if(flag == true && num.charAt(i) == '1'){
                    //System.out.printf("%d\n" , count);
                    fnum = fnum+Math.pow(10,count);
                }
                if(flag == true){
                    count--;
                    cnt++;
                }
                */
            }
            //System.out.printf("%d , %f\n" , dec(inum) , dec(num));
            System.out.printf("%f\n" , dec(inum)+dec(num));
        }
    }    
}

import java.util.Scanner;
import java.math.*;
public class b_to_d {
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

    public static double sub(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    static double dec(String Fbin){
        int len = Fbin.length();
        double sum = 0;
        int count=1;
        for(int i=2;i<len;i++){
            if(Fbin.charAt(i)=='1'){
                sum += 1/Math.pow(2,count); 
            }
            count++;
        }
        return sum;
    }
    public static void main(String[] arge){
        Scanner scan = new Scanner(System.in);
        while(true){
            double bin = scan.nextDouble();
            //System.out.println((int)bin);
            int Bbin = (int)bin;
            String Fbin = Double.toString(sub(bin,Bbin));
            System.out.printf("%s\n" , Fbin);
            //dec(Bbin);
            System.out.println(dec(Fbin));
            System.out.printf("Dec: %f\n" , dec(Bbin)+dec(Fbin));
        }
    }
}

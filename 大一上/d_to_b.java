import java.util.Scanner;
import java.math.*;
public class d_to_b {
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

    public static double sub(double v1,double v2){
        //System.out.println(v1);
        //System.out.println(v2);
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    static double dec(double Fbin){
        double sum = 0;
        int count=1;
        while(Fbin!=0){
            Fbin *= 2;
            if(Fbin>=1){
                sum += (1/Math.pow(10,count));
                Fbin -= 1;
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
            double Fbin = sub(bin,Bbin);
            System.out.printf("Fbin:%f\n" , Fbin);
            //System.out.printf("%s\n" , Fbin);
            System.out.println(dec(Bbin));
            System.out.println(dec(Fbin));
            System.out.printf("Dec: %f\n" , dec(Bbin)+dec(Fbin));
        }
    }
}

import java.util.Scanner;
public class homework3 {
    
    static int GCD(int number1,int number2){  //GCD function
        if( number2==0 ) return number1;
        return GCD( number2, number1%number2);
    }

    public static void main(String[] arge){
            while(true){
                Scanner scan = new Scanner(System.in);
                int number1 = scan.nextInt();
                int number2 = scan.nextInt();
                System.out.println(number1);
                System.out.println(number2);
                int GCD = GCD(number1,number2);
                System.out.printf("GCD:%d\n" , GCD(number1,number2));
                System.out.printf("LCM:%d\n" , number1*number2/GCD);  //LCM公式
            }
        }
        

    }

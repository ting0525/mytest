import java.util.Scanner;
public class loop {
    public static void main(String[] arge){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num-->0){
            int printer  = scan.nextInt();
            System.out.print(printer+"\n");
        }
    }
}

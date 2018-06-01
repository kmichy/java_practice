import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        int c = a.length();
        int d = b-c;
        int e = d/2;
        for(int i = 0;i <e;i++){
            System.out.print("_");
        }
        System.out.print(a);
        for(int i = 0;i <e;i++){
            System.out.print("_");
        }
        if(d % 2 == 1){
            System.out.print("_");
        }
        System.out.println();
    }
}
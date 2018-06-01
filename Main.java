import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.replace("ta","");
        System.out.println(a);
    }
}
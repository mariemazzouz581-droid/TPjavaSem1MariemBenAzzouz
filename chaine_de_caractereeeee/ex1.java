import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 ="j";
        String s2 =s1;
        s1=s1.concat("ava");
        System.out.println("s1="+s1);/*s1=java */
        System.out.println("s2="+s2);/*s2=j */
        sc.close();
    }
}

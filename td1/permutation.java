import java.util.Scanner;
public class permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("donner un entier x");
        x=sc.nextInt();
        System.out.println("donner un entier y");
        y=sc.nextInt();
        x=y+x;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+" y="+y);

    }
}

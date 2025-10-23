import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,i,j;
        do{ 
             System.out.println("enter the number of lines:");
             x=sc.nextInt();
            }while(x<=0);
         System.out.println("enter the number of lines: "+x);
         for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();    
        }
        sc.close();
    }
}

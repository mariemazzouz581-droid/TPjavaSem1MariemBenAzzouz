import java.util.Scanner;

public class exercice3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x; int i;
         do{ 
             System.out.println("saisir un nombre");
             x=sc.nextInt();
         }while(x<1 || x>10);
         System.out.println("Table de multiplication de "+x);
         for(i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+ (x*i));

         }
         sc.close();
      }
   }


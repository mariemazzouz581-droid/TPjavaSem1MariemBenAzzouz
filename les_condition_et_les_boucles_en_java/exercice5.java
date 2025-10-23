import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,a;
         System.out.println("donner l'année");
        a=sc.nextInt();
        do{
        System.out.println("donner le nb de mois");
        x=sc.nextInt();}
        while(x>12 || x<1);{
        switch (x) {
            case 1,3,5,8,12:
                System.out.println("le mois"+x+" a 31jours"+" dans l'anné   "+a);
                break;
            case 4,6,9,10:
                System.out.println("le mois"+x+" a 30jours"+" dans l'anné   "+a);
                break;
            case 2:
                if((a % 4==0) && (a %100)!=0 || (a%400)==0){System.out.println("le mois"+x+" a 29jours car  l'année "+a+"est bissectile");}
                else{System.out.println("le mois"+x+" a 28 jours"+" dans l'anné   "+a);}
                break;
        }}
        sc.close();
    }
}

import java.util.Scanner;

public class ex4 {
    public static int LectureN(){
        int x;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("saisir un entier strictement positive et inférieurs à 1000");
            x=sc.nextInt();
        }while(x<=0 || x>=1000); return x;
    }
    public static boolean estArmstrong(int nb){
        int c;
        int s=0;
        int n=nb;
        while(n>0){
            c=n%10;
            s +=c*c*c;
            n= n/10;
        }return s==nb;
    }
    public static void main(String[] args) {
        int l=LectureN();
        if(estArmstrong(l)){
            System.out.println(l+"ce nb est armstrong ");
        }
        else{
            System.out.println(l+"ce nb n'est pas armstrong ");
        }
        
        
    }
}

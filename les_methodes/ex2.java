import java.util.Scanner;

public class ex2 {
    public static int LectureN(){
        int x;
        Scanner sc =new Scanner (System.in);
    do{
        System.out.println("donner un entier postive");
        x=sc.nextInt();
    }while(x<=0);
    return x;}
    public static int compter(int n){
        int k=0;
        do{
            n=n/10;
            k++;
        }while(n>0); 
        return k;
    }
    public static void main(String[] args) {    
       int n=LectureN();
       int b=compter(n);
       System.out.println("le nombre competer "+n+"  est  "+b);
    }
}

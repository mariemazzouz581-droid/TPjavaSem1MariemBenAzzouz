import java.util.Scanner;

public class saison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do{
        System.out.println("donner le nb de mois");
        x=sc.nextInt();}
        while(x>12 || x<1){
        switch (x) {
            case 12,1,2:
                System.out.println("hiver");
                break;
            case 3,4,5:
                System.out.println("printemps");
                break;
            case 6,7,8:
                System.out.println("été");
                break;
            case 9,10,11:
                System.out.println("automne");
                break;
            default:
            System.out.println("saisir invalid");
            
        }}
        sc.close();
    }
}

import java.util.Scanner;

public class app2mat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l,c;
        do{
          System.out.println("Saisir  c:");
          c=sc.nextInt();
        }while(c <= 0 || c >= 30);
        do{
          System.out.println("Saisir l ");
          l=sc.nextInt();
        }while(l>=30 );
        int [][]m=new int[l][c];
        int p=1;int s=0; 
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.println("donner des enties:");
                m[i][j]=sc.nextInt();
                p*=m[i][j];
                System.out.println("le produit est:"+p);
                s+=m[i][j];
                System.out.println("la somme est:"+s);
                double moy = (double) s / nb;
                System.out.println("la moyenne est:"+moy);
            }
        }
    }}

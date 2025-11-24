import java.util.Scanner;

public class app3_tab{
    static Scanner sc =new Scanner(System.in);
    //1)lecture
        public static int lectureN(){
            int n;
            do{
                System.out.println("donner la taille du n");
                n=sc.nextInt();
            }while(n<=0);
        
        return n;}
    //2) remplir
    public static void remplitTab(int []t,int n){
        System.out.println("saisir "+n+"entier positif");
        for(int i=0;i<n;i++){
            do{
                System.out.println("donner t ["+i+"]");
                t[i]=sc.nextInt();
            }while ((t[i]<=0));
            
    }}
    //pair 
    public static int[] creeTpair(int[]t){
        int c=0;
        for(int i=0;i<t.length;i++){
          if (t[i]%2==0){ c++;}}
          int[] tpair=new int[c];
          int j=0;
          for(int i=0;i<t.length;i++){
            if(t[i]%2==0){
                tpair[j]=t[i];
                j++;
            }
          }
          return tpair;
        
    }
    //impair
    public static int[] creeTimpair(int[]t){
        int c=0;
        for(int i=0;i<t.length;i++){
          if (t[i]%2!=0){ c++;}}
          int[] timpair=new int[c];
          int j=0;
          for(int i=0;i<t.length;i++){
            if(t[i]%2!=0){
                timpair[j]=t[i];
                j++;
            }
          }
          return timpair;
        
    }
    //5)affichage
    public static void afficherTab(int[] t) {
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=lectureN();
        int[] t=new int[n];
        remplitTab(t, n);
        int[] tpair = creeTpair(t);
        int[] timpair = creeTimpair(t);
        System.out.print("Tableau  : ");
        afficherTab(t);
        System.out.print("Tableau pair : ");
        afficherTab(tpair);
        System.out.print("Tableau impair : ");
        afficherTab(timpair);
    }
}

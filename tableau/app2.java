import java.util.*;
public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl;
        do {
            System.out.print("Entrez le nombre de lignes : ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 30);
        int nc;
        do {
            System.out.print("Entrez le nombre de colonnes  : ");
            nc = sc.nextInt();
        } 
        while (nc <= 0 || nc >= 30);
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
        //lecture matrice
        for (int i = 0; i < nl; i++) {
            ArrayList<Integer> ligne = new ArrayList<>();
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                ligne.add(sc.nextInt());   
            }
            M.add(ligne);
        }
        int somme = 0;
        int prod = 1;
        int count = nl * nc;
         for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                int val = M.get(i).get(j);
                somme += val;
                prod *= val;
            }
        }
        double moyenne = (double) somme / count;

        System.out.println("\nRésultats :");
        System.out.println("Somme = " + somme);
        System.out.println("Produit = " + prod);
        System.out.println("Moyenne = " + moyenne);

        sc.close();




    }}



    
    
    
    
    
  

    
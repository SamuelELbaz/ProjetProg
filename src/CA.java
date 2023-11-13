import java.util.ArrayList;
import java.util.Scanner;



public class CA {

    int nbVilles;
    ArrayList<ArrayList<Ville>> communaute;
    ArrayList<Ville> villes;

    public CA(int nbVilles){
        this.nbVilles = nbVilles;
        communaute = new ArrayList<ArrayList<Ville>>();
        villes = new ArrayList<Ville>();
    }

    public void creerCA(){
        
        for(int i=0; i<nbVilles; i++){
            communaute.add(new ArrayList<Ville>());
        }

        Scanner sc = new Scanner(System.in);
        int p;

        for (int i =0;i<nbVilles;i++){
            System.out.println("Quel est le nom de la ville ?");
            villes.add(new Ville(sc.next()));

            System.out.println("Combien a-t-elle de voisins ?");
            p=sc.nextInt();

            for(int j=0;j<p;j++){
                System.out.println("Entrez une villes voisine");
                communaute.get(i).add(new Ville(sc.next()));
            }
        }
        sc.close();
        
    }

    
    public void affiche(){
        for(int i=0; i<nbVilles;i++){
            System.out.println("voisins de ville " +villes.get(i).getNom()+" :");
            for(int j=0;j<communaute.get(i).size();j++){
                System.out.println(communaute.get(i).get(j).getNom());
            }
        }
    }
    
}

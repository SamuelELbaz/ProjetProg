public class Ville {

    String nom;
    Boolean zoneRecharge;

    public Ville(String nom){
        this.nom=nom;
        zoneRecharge=false;        
    }

    
    public String getNom(){
        return nom;
    }

    public Boolean getZR(){
        return zoneRecharge;
    }

    public void setZR(Boolean bool){
        zoneRecharge = bool;
    }
}

package tn.essat.miniprojet.domaine;

public class Categorie {

    private int id ;
    private String name ;
    private int nbPfe = 0 ;

    public Categorie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getNbPfe() {
        return nbPfe;
    }

    public void setNbPfe(int nbPfe) {
        this.nbPfe = nbPfe;
    }

    public void setName(String name) {
        this.name = name;
    }
}

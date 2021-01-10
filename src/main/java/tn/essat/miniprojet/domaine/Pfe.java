package tn.essat.miniprojet.domaine;

public class Pfe {

    private int id ;
    private String titre ;
    private Categorie type ;

    public Pfe(int id, String titre, Categorie type) {
        this.id = id;
        this.titre = titre;
        this.type = type;
    }
    public Pfe(String titre, Categorie type) {
        this.titre = titre;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Categorie getType() {
        return type;
    }

    public void setType(Categorie type) {
        this.type = type;
    }
}

package tn.essat.miniprojet.repository;

import tn.essat.miniprojet.domaine.Categorie;
import tn.essat.miniprojet.domaine.Pfe;

import java.util.List;

public interface PfeRepository {

    public void addPFE(Pfe pfe);
    public void deletePFE(Pfe pfe);
    public List<Pfe> listPfes();
    public List<Categorie> categorie();

}

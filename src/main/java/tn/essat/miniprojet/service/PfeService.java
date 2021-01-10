package tn.essat.miniprojet.service;


import tn.essat.miniprojet.domaine.Categorie;
import tn.essat.miniprojet.domaine.Pfe;
import tn.essat.miniprojet.repository.PfeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PfeService implements PfeRepository {

    public  static List<Pfe> pfes = new ArrayList<Pfe>();
    public  static List<Categorie> categories = new ArrayList<>();
    private static int countPFE = 3 ;
    private static int countCat = 3 ;

    @PostConstruct
    public void init (){
        Categorie categorie1 = new Categorie(1,"Developpment");
        Categorie categorie2 = new Categorie(2,"Réseaux");
        Categorie categorie3 = new Categorie(3,"Télécom");
        this.categories.add(categorie1);
        this.categories.add(categorie2);
        this.categories.add(categorie3);
        Pfe pfe1 = new Pfe(1,"PFE Developpment",categorie1);
        Pfe pfe2 = new Pfe(2,"PFE Résaux ",categorie2);
        Pfe pfe3 = new Pfe(3,"PFE Télécom ",categorie3);
        pfes.add(pfe1);
        pfes.add(pfe2);
        pfes.add(pfe3);
    }

    @Override
    public void addPFE(Pfe pfe) {
        countPFE ++ ;
        pfe.setId(countPFE);
        this.pfes.add(pfe);
    }

    @Override
    public void deletePFE(Pfe pfe) {
        this.pfes.remove(pfe);
    }

    @Override
    public List<Pfe> listPfes() {
        return this.listPfes();
    }

    @Override
    public List<Categorie> categorie() {
        return this.categorie();
    }





}

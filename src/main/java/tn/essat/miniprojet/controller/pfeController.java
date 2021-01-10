package tn.essat.miniprojet.controller;


import tn.essat.miniprojet.controller.MV.PfeMV;
import tn.essat.miniprojet.domaine.Categorie;
import tn.essat.miniprojet.domaine.Pfe;
import tn.essat.miniprojet.service.PfeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/pfe" )
@CrossOrigin("http://localhost:4200")
class PfeController {


    @Autowired
    private PfeService pfeService;

    @GetMapping
    @ResponseBody
    public List<Pfe> pfe(@RequestParam("idcat") String idCat){
        System.out.println(idCat);
        if(idCat == null || Integer.parseInt(idCat) == -1 )
            return pfeService.pfes;
        else
            return  pfeService.pfes.stream().filter(x->x.getType().getId()==Integer.parseInt(idCat)).collect(Collectors.toList());

    }

    @GetMapping("categories")
    @ResponseBody
    public List<Categorie> categories(){
        return pfeService.categories;
    }

    @PostMapping
    @ResponseBody
    public void addPfe(@RequestBody PfeMV pfe){
        System.out.println(pfe.getIdCategorie() +" " + pfe.getTite());
        Categorie catego = pfeService.categories.stream().filter(x->x.getId()==pfe.getIdCategorie()).findFirst().orElse(null);
        Pfe PFE = new Pfe(pfe.getTite(),catego);
        pfeService.addPFE(PFE);
    }

    @PutMapping
    public void updatePfe(@RequestBody Pfe pfe){

    }

    @DeleteMapping("/{idpfe}")
    public String deletePfe(@PathVariable("idpfe") int idpfe){
        System.out.println(idpfe);
        Pfe pfe = pfeService.pfes.stream().filter(x->x.getId()==idpfe).findFirst().orElse(null);
        if(pfe!=null)
            pfeService.pfes.remove(pfe);
        return "DELETED";
    }

    @GetMapping("nbPfeByCat/{idcat}")
    public long nbPfeByCat(@PathVariable("idcat") int idcat){
        return pfeService.pfes.stream().filter(x->x.getType().getId()==idcat).count();
    }










}

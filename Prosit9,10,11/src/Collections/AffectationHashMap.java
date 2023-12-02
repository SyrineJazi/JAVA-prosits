package Collections;
import Classes.*;

import java.util.*;

public class AffectationHashMap {
    Map<Departement,Employe> MapSociete = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d){
        MapSociete.put(d,e);
    }
    public void afficherEmployesDepartements(){
        for(Map.Entry<Departement,Employe> element : MapSociete.entrySet()){

            System.out.println("\n"+element.getValue()+ " =====> " +element.getKey()
                    +"\n--------------");
        }
    }
    public void supprimerEmployeDepartement(Departement dept){
        MapSociete.remove(dept);
        this.afficherEmployesDepartements();
    }
    public void supprimerEmploye(Employe e){
        Iterator<Map.Entry<Departement,Employe>> it = MapSociete.entrySet().iterator();
        while(it.hasNext()){
            if(e.equals(it.next().getValue())){
                it.remove();
                break;
            }
        }
        afficherEmployes();
    }
    public void afficherEmployes(){
        Collection<Employe> Employees = MapSociete.values();
        for(Employe value : Employees){
            System.out.println(value);
        }
    }
    public void afficherDepartements(){
        Set<Departement> Departements = MapSociete.keySet();
        for(Departement key : Departements){
            System.out.println(key);
        }
    }
    public boolean chercherEmploye(Employe e){
        return MapSociete.containsValue(e);
    }
    public boolean chercherDepartement(Departement d){
        return MapSociete.containsKey(d);
    }
    public TreeMap<Departement,Employe> trierMAP(){
        return new TreeMap<>(MapSociete);
    }




}

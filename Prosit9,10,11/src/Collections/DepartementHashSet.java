package Collections;
import Classes.Departement;
import interfaces.IDépartement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<Departement> {
    Set<Departement> ListDepartements = new HashSet<>();
    public void ajouterDepartement(Departement dept){
        ListDepartements.add(dept);
    }
    public boolean rechercherDepartement(String nom){
        boolean exist = false;
        Iterator<Departement> it = ListDepartements.iterator();
        while(it.hasNext() && !exist){
            Departement currentObj = it.next();
            if(currentObj.getNom().equalsIgnoreCase(nom)){
                exist = true;
            }
        }
        return exist;
    }
    public boolean rechercherDepartement(Departement dept){
        return ListDepartements.contains(dept);
    }
    public void supprimerDepartement(Departement dept){
        ListDepartements.remove(dept);
    }
    public void displayDepartement(){
        for(Departement dept : ListDepartements){
            System.out.println(dept);
        }
    }
    public TreeSet<Departement> trierDepartementByID(){
        TreeSet<Departement> List_trié = new TreeSet<>(ListDepartements);
        return List_trié;
    }
    public void returnHashCodes(){
        Iterator<Departement> it = ListDepartements.iterator();
        while(it.hasNext()){
            Departement currentObj = it.next();
            System.out.println("Le hashCode de "+currentObj.getNom()+" est : "+currentObj.hashCode());
        }
    }
}

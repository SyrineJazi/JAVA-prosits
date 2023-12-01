import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> Societe = new ArrayList<>();
    public void ajouterEmploye(Employe e){
    Societe.add(e);
    }
    public boolean rechercherEmploye(String nom){
        boolean exist = false;
        int i = 0;
        while(!exist && i < Societe.size()){
            if(Societe.get(i).getNom().equals(nom)){
                exist = true;
            }
            else {i++;}
        }
        return exist;
    }
    public boolean rechercherEmploye(Employe e){
        return Societe.contains(e);
    }
    public void supprimerEmploye(Employe e){
        Societe.remove(e);
    }
    public void displayEmploye(){
    for(Employe e : Societe){
        System.out.println(e);
    }
    }
    public void trierEmployeParID(){
        Collections.sort(Societe);
    }
    public void trierEmployepPar_nom_departement_grade(){
        Comparator<Employe> byName = Comparator.comparing(Employe::getNom);
        Comparator<Employe> byDept = Comparator.comparing(Employe::getDepartement);
        Comparator<Employe> byGrade = Comparator.comparing(Employe::getGrade);

        Societe.sort(byName.thenComparing(byDept).thenComparing(byGrade));
    }
}

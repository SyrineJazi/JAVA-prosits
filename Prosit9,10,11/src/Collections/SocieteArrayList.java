package Collections;

import Classes.Employe;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> EmployeeList = new ArrayList<>();
    public void ajouterEmploye(Employe e){
    EmployeeList.add(e);
    }
    public boolean rechercherEmploye(String nom){
        boolean exist = false;
        int i = 0;
        while(!exist && i < EmployeeList.size()){
            if(EmployeeList.get(i).getNom().toUpperCase().equals(nom.toUpperCase())){
                exist = true;
            }
            else {i++;}
        }
        return exist;
    }
    public boolean rechercherEmploye(Employe e){
        return EmployeeList.contains(e);
    }
    public void supprimerEmploye(Employe e){
        EmployeeList.remove(e);
    }
    public void displayEmploye(){
    for(Employe e : EmployeeList){
        System.out.println(e);
    }
    }
    public void trierEmployeParID(){
        Collections.sort(EmployeeList);
        this.displayEmploye();
    }
    public void trierEmployepPar_nom_departement_grade(){
        Comparator<Employe> byName = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        };
        //Comparator<Employe> byName = Comparator.comparing(Employe::getNom);
        Comparator<Employe> byDept = Comparator.comparing(Employe::getDepartement);
        Comparator<Employe> byGrade = Comparator.comparing(Employe::getGrade);

        EmployeeList.sort(byName.thenComparing(byDept).thenComparing(byGrade));
        this.displayEmploye();
    }
    public Employe getEmploye(int index){
        return EmployeeList.get(index);
    }
}

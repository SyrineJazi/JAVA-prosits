import Classes.Departement;
import Classes.Employe;
import Collections.DepartementHashSet;
import Collections.SocieteArrayList;

import java.util.TreeSet;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        /*
        // PROSIT 9
        System.out.println("----AJOUT DES EMPLOYES----");
        SocieteArrayList Societe = new SocieteArrayList();
        Societe.ajouterEmploye(new Employe(3,"Parker","Peter","Journalism",3));
        Societe.ajouterEmploye(new Employe(4,"Arlecchino","Gabriel","Human Resources",1));
        Societe.ajouterEmploye(new Employe(5,"Brown","Chris","Accounting",2));
        Societe.ajouterEmploye(new Employe(6,"Storm","Micha","Human Resources",3));
        Societe.ajouterEmploye(new Employe(2,"Einsworth","Elias","marketing",1));
        Societe.ajouterEmploye(new Employe(1,"Smith","Walter","Finance",1));
        Societe.displayEmploye();


        System.out.println("----TRI PAR ID----");
        Societe.trierEmployeParID();
        System.out.println("----TRI PAR NOM,DEPT ET GRADE----");
        Societe.trierEmployepPar_nom_departement_grade();
        System.out.println("----CHERCHER UN EMPLOYE PAR NOM----");
        System.out.println(Societe.rechercherEmploye("Arlecchino"));
        System.out.println(Societe.rechercherEmploye("arlecchino"));
        System.out.println("----CHERCHER UN EMPLOYE ----");
        Employe employe = new Employe(1,"Smith","Walter","Finance",1);
        System.out.println(Societe.rechercherEmploye(employe));
        System.out.println("----SUPPRIMER UN EMPLOYE ----");
        Societe.supprimerEmploye(employe);
        Societe.displayEmploye();
         */

        //PROSIT 10
        System.out.println("----AJOUT DES DEPARTEMENTS----");
        DepartementHashSet Departements = new DepartementHashSet();
        Departements.ajouterDepartement(new Departement(1,"Finance",12));
        Departements.ajouterDepartement(new Departement(2,"Accounting",5));
        Departements.ajouterDepartement(new Departement(4,"human recourses",3));
        Departements.ajouterDepartement(new Departement(3,"Journalism",10));
        Departements.ajouterDepartement(new Departement(5,"Marketing",13));
        Departements.displayDepartement();
        Departements.returnHashCodes();

        System.out.println("----RECHERCHE PAR NOM----");
        System.out.println(Departements.rechercherDepartement("finance"));
        System.out.println(Departements.rechercherDepartement("journalism"));

        System.out.println("----RECHERCHE PAR OBJET----");
        Departement dept1 = new Departement(1,"Finance",12);
        Departement dept2 = new Departement(6,"Direction",3);
        System.out.println(Departements.rechercherDepartement(dept1));
        System.out.println(Departements.rechercherDepartement(dept2));

        System.out.println("----TRI DU SET AVEC TREESET----");
        //option1
        System.out.println(Departements.trierDepartementByID());
        //option2
        TreeSet<Departement> Tree_of_departements = new TreeSet<>();
        Tree_of_departements = Departements.trierDepartementByID();
        System.out.println(Tree_of_departements);

        System.out.println("----SUPPRIMER UN OBJET----");
        Departements.supprimerDepartement(dept1);
        Departements.displayDepartement();












    }
    }

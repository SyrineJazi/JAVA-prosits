import Classes.Employe;
import Collections.SocieteArrayList;

public class Main {
    public static void main(String[] args) {

    //System.out.println(employe1);

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





    }
    }

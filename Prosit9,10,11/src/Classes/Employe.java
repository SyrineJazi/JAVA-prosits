package Classes;

public class Employe implements Comparable<Employe>{
    int ID, grade;
    String nom, prenom, departement;

    public Employe() {
    }

    public Employe(int ID, String nom, String prenom, String departement, int grade) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } //if this object is compared to itself
        if (!(o instanceof Employe)) {
            return false;
        } //check if the object of comparison is even of the same class
        Employe e = (Employe) o;
        return this.ID == e.getID() && this.nom.equalsIgnoreCase(e.getNom());
    }
    @Override
    public String toString(){
        return "ID: "+ID+"\n" +
                "Nom: "+nom+"\n" +
                "Prenom: "+prenom+"\n" +
                "Departement: "+departement+"\n" +
                "Grade: "+grade;
    }

    @Override
    public int compareTo(Employe autre) {
        return this.ID - autre.getID();
    }

}

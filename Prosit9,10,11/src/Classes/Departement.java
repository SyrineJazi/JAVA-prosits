package Classes;

public class Departement implements Comparable<Departement>{
    int ID,nombre_employes;
    String nom;
    public Departement(){}
    public Departement(int ID,String nom,int nombre_employes){
        this.ID = ID;
        this.nom = nom;
        this.nombre_employes = nombre_employes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNombre_employes() {
        return nombre_employes;
    }

    public void setNombre_employes(int nombre_employes) {
        this.nombre_employes = nombre_employes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Departement)){
            return false;
        }
        Departement dept = (Departement) o;
        return this.ID == dept.getID() && this.nom.equalsIgnoreCase(dept.getNom());
    }
    @Override
    public String toString(){
        return "ID: "+ID+"\n"+"Nom du département: "+nom+"\n"+"Nombre d'employés: "+nombre_employes;
    }
    int ASCIISumOfString(String input){
        int sum = 0;
        for(int i=0; i<input.length() ;i++){
            sum+= (int) input.charAt(i);
        }
        return sum;
    }
    @Override
    public int hashCode(){
        String input = this.getNom();
        int result = 17;
        result*= ASCIISumOfString(input);
        //result%=10;
        return result;
    }

    @Override
    public int compareTo(Departement o) {
        return this.ID - o.getID();
    }
}

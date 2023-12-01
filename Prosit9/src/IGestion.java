public interface IGestion<T> { //interface générique
    public void ajouterEmploye(T t); //T = employe
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);
    public void supprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeParID();
    public void trierEmployepPar_nom_departement_grade();
}

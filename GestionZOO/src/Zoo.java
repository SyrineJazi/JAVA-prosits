import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    List<Animal> Animals = new ArrayList<>();
    Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticAnimalsnumber;
    private String name;
    private String city;
    public final int NBR_CAGES = 10;
    private int nbrAnimaux;
    private int nbrAnimauxAjoutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public int getNbrAnimaux() {
        return nbrAnimaux;
    }

    public void setNbrAnimaux(int nbrAnimaux) {
        this.nbrAnimaux = nbrAnimaux;
    }

    public int getNbrAnimauxAjoutes() {
        return nbrAnimauxAjoutes;
    }

    public void setNbrAnimauxAjoutes(int nbrAnimauxAjoutes) {
        this.nbrAnimauxAjoutes = nbrAnimauxAjoutes;
    }

    public Zoo(String name, String city, int nbrAnimaux) {
        nbrAnimauxAjoutes = 0;
        aquaticAnimalsnumber = 0;
        this.name = name;
        this.city = city;
        this.nbrAnimaux = nbrAnimaux;
    }

    public void displayZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(NBR_CAGES);
    }

    @Override
    public String toString() {
        return name + " de " + city;
    }

    public boolean addAnimal(Animal newAnimal) {
        if ((!isZooFull()) && (Animals.indexOf(newAnimal) == -1)) {
            Animals.add(newAnimal);
            nbrAnimauxAjoutes++;
            return true;
        } else return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < Animals.size(); i++) {
            System.out.println(Animals.get(i));
        }
    }

    public boolean removeAnimal(Animal animal) {
        for (Iterator<Animal> itr = Animals.iterator(); itr.hasNext(); ) {
            Animal nextAnimal = itr.next();
            if (animal.getName().equals(nextAnimal.getName())) {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    boolean isZooFull() {
        return nbrAnimauxAjoutes == NBR_CAGES;
    }

    Zoo Zoo_le_plus_habite(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nbrAnimauxAjoutes > zoo2.nbrAnimauxAjoutes) return zoo1;
        else return zoo2;
    }

    public boolean addAquaticAnimal(Aquatic newAnimal) {
        boolean exist = false;
        for (int i = 0; i < aquaticAnimalsnumber; i++) {
            if (aquaticAnimals[i] != null && aquaticAnimals[i].getName().equals(newAnimal.getName())) {
                exist = true;
                break;
            }
        }

        if (!isZooFull() && !exist) {
            if (aquaticAnimalsnumber < aquaticAnimals.length) {
                aquaticAnimals[aquaticAnimalsnumber] = newAnimal;
                aquaticAnimalsnumber++;
                return true;
            } else {
                System.out.println("The aquatic animals array is full.");
            }
        } else {
            System.out.println("Animal already exists or the zoo is full.");
        }
        return false;
    }
    public void displayAquaticAnimals() {
        for (int i = 0; i < aquaticAnimalsnumber; i++) {
                System.out.println("Animal "+ (i+1) +":");
                System.out.println(aquaticAnimals[i]);
                System.out.println("Methode swim:");
                aquaticAnimals[i].swim();

        }
    }
    public float maxPenguinSwimmingDepth(){
        float max = 0;
        for(int i=0; i<aquaticAnimalsnumber;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if(((Penguin) aquaticAnimals[i]).getSwimmingDepth()>max){
                    max = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nombreDauphins = 0;
        int nombrePenguins = 0;

        for(int i=0; i<aquaticAnimalsnumber;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nombrePenguins++;
                }else nombreDauphins++;
            }
        System.out.println("Le nombre de dauphins est: "+nombreDauphins);
        System.out.println("Le nombre de penguins est: "+nombrePenguins);
        }




}









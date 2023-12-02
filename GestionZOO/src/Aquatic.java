
public non-sealed abstract class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic() {
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    public void eatMeat(Food meat){
        System.out.println("This animal eats meat");
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    public boolean equals(Aquatic aquatic){
        if(this.getName().equals(aquatic.getName()) && this.getAge() == aquatic.getAge() && this.getHabitat().equals(aquatic.getHabitat()))
        {
            return true;
        }else return false;
    }


}
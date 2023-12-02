public sealed class Animal permits Aquatic, Terrestrial {
    public String family;
    public String name;
    public int age;
    public Boolean isMammal;

    public Animal() {
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String family, String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String toString(){
        return name + " de la famille des " + family;
    }
}

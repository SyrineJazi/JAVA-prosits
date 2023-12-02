
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Felins", "Lion", 14, true);
        Animal animal2 = new Animal("Felins", "Lynx", 10, true);
        Animal animal3 = new Animal("Birds", "Canary", 3, false);
        Animal animal4 = new Animal("Insects","Lady bugs",1,false);
        Zoo myZoo = new Zoo("ZOOLAND", "San Diego", 4);
        Zoo anotherZoo = new Zoo("Belvédère", "tunis", 2);
        System.out.println("le Zoo " + myZoo.getName() + " contient " + myZoo.NBR_CAGES + " cages");
        myZoo.displayZoo();
        System.out.println("__INSTRUCTION8et9__");
        System.out.println(anotherZoo);
        //System.out.println(myZoo.toString());
        System.out.println(animal1);
        //System.out.println(animal1.toString());
        System.out.println("__INSTRUCTION10__");
        System.out.println(myZoo.addAnimal(animal1));//printing true or false
        System.out.println(myZoo.addAnimal(animal2));
        System.out.println(myZoo.addAnimal(animal3));
        myZoo.displayAnimals();
        System.out.println("__INSTRUCTION11__");
        System.out.println(myZoo.Animals.indexOf(animal3));
        System.out.println(myZoo.addAnimal(animal2));
        System.out.println(myZoo.addAnimal(animal4));
        System.out.println("__INSTRUCTION12__");
        System.out.println(myZoo.removeAnimal(animal2));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(animal2));
        System.out.println("__INSTRUCTION15__");
        System.out.println(myZoo.isZooFull());
        System.out.println("__INSTRUCTION16__");
        System.out.println(anotherZoo.addAnimal(animal1));//printing true or false
        System.out.println(myZoo.Zoo_le_plus_habite(myZoo,anotherZoo));


        System.out.println("--------------PROSIT5---------------");
        //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Dolphin dolphinDouble = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 15.3f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Morty", 3, true, "Ocean", 11.2f);
        Penguin penguin3 = new Penguin("Spheniscidae", "Stooge", 3, true, "Ocean", 19.0f);
        Penguin penguin4 = new Penguin("Spheniscidae", "Shana", 3, true, "Ocean", 10.3f);

        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        //aquatic.swim();
        dolphin.swim();
        penguin.swim();

        //System.out.println(myZoo.addAquaticAnimal(aquatic));
        System.out.println(myZoo.addAquaticAnimal(dolphin));
        System.out.println(myZoo.addAquaticAnimal(penguin));
        System.out.println(myZoo.addAquaticAnimal(penguin2));
        System.out.println(myZoo.addAquaticAnimal(penguin3));
        System.out.println(myZoo.addAquaticAnimal(penguin4));

        myZoo.displayAquaticAnimals();
        System.out.println("Profondeur de nage maximale:"+myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(dolphin.equals(penguin2));
        System.out.println(dolphin.equals(dolphinDouble));

        terrestrial.eatPlantAndMeat(Food.BOTH);








    }
}
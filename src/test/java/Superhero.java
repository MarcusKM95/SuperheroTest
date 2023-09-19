public class Superhero {

    private String name;
    private String superHeroName;
    private String superPower;
    private int creationYear;
    private int strength;

    //contructor 1
    public Superhero(String name, String superHeroName, String superPower, int creationYear, int strength) {
        this.name = name;
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    //constructor 2
    public Superhero(String name, String superPower, int creationYear, int strength) {
        this.name = name;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int getStrength() {
        return strength;
    }

    //setters


    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Superhelt:" + "\n" +
                "Navn:" + " " + name + "\n" +
                "Superheltenavn:" + " " + superHeroName + "\n" +
                "Superkræft:" + " " + superPower + "\n" +
                "skabelsesår:" + " " + creationYear + "\n" +
                "Styrke:" + " " + strength + "\n";
    }
}

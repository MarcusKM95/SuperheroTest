import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Database {

    ArrayList<Superhero> superheroList;

    public Database() {
        this.superheroList = new ArrayList<Superhero>();
    }
    @Test
    public void addSuperHero(Superhero hero) {
        this.superheroList.add(hero);
    }

    public void showHeroList() {
        int counter = 0;
        for (Superhero hero : this.superheroList) {
            System.out.println(counter + " " + hero.toString());
            counter++;

        }
    }

    public void søg(String søgning) {
        for (Superhero hero : this.superheroList) {
            if (hero.getName().contains(søgning) || hero.getSuperHeroName().contains(søgning)) {
                System.out.println(hero.toString());
            }

        }

    }

    public void slet(int i) {
        this.superheroList.remove(i);
    }

    public void rediger(int nummer, String navn) {
        this.superheroList.get(nummer).setName(navn);
        //sh.setName(navn);
        //System.out.println(sh.getName());

    }

}


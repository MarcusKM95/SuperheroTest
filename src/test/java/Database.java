import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {

    ArrayList<Superhero> superheroList;


    public Database() {

        this.superheroList = new ArrayList<Superhero>();
    }
    //Test at den adder endnu en superhelt til listen (superherolist+1)

        @Test
        public void addSuperHero (Superhero hero){
            this.superheroList.add(hero);


    }

    public void showHeroList() {
        int counter = 0;
        for (Superhero hero : this.superheroList) {
            System.out.println(counter + " " + hero.toString());
            counter++;

        }
    }
    //Test, at søgemetoden kan finde 0, 1 og flere resultater

        @Test
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


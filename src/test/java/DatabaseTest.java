import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Superhero spooderman;
    Superhero subaman;
    Database db;

    @BeforeEach
    void setUp() {
        spooderman = new Superhero("Peter Parker", "Spiderman", "Webartist and fighter", 1943, 9);
        subaman = new Superhero("Ken Clarke", "Superman", "Super Strong", 1940, 10);
        db.addSuperHero(spooderman);
        db.addSuperHero(subaman);

    }


    @Test
    void antalsuperhelte() {
        int forventetAntalHelte = 2;
        assertEquals(forventetAntalHelte, 2);


    }

    @Test
    void søg(String søgning) {
        for (Superhero hero : this.superheroList) {
            if (hero.getName().contains(søgning) || hero.getSuperHeroName().contains(søgning)) {
                System.out.println(hero.toString());



            }
        }
    }
}

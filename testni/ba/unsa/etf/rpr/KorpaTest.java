package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Supermarket supermarket;

    @BeforeEach
    void initializeSupermarket(){
        supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("Hljeb", 2,"123"));
    }

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Korpa korpa=new Korpa();
        boolean vrijednost=korpa.dodajArtikl(new Artikl("voda",1,"12"));
        assertTrue(vrijednost);
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("bombona",5,"99"));
        Artikl a=korpa.izbaciArtiklSaKodom("99");
        assertEquals("99", a.getKod());
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala() {
        supermarket.dodajArtikl(new Artikl("Cokolada",3,"777"));
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Cokolada",3,"777"));
        int cijena=korpa.dajUkupnuCijenuArtikala();
        assertEquals(3,korpa.dajUkupnuCijenuArtikala());
    }


}
package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket=new Supermarket();
        boolean vrijednost=supermarket.dodajArtikl(new Artikl("salama",12,"12"));
        assertTrue(vrijednost);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("banana",1,"bn"));
        Artikl a=supermarket.izbaciArtiklSaKodom("bn");
        assertEquals("bn",a.getKod());
    }
}
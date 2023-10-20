package metier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditMetierImplTest  {

    private ICreditMetier metier ;

    @BeforeEach
    void setUp() throws Exception {
      metier = new CreditMetierImpl() ;
    }

    @Test
    void testCalculerMesualiteCredit() {

        double capitale = 200000 ;
        double taux = 4.5 ;
        int duree = 240 ;

        double res_attendu = 1265.2987 ;

        double res_calculer = metier.calculerMesualiteCredit(capitale,taux,duree);

        assertEquals(res_attendu , res_calculer , 0.0001);
    }
}
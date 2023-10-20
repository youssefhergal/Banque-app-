package metier;

public class CreditMetierImpl implements ICreditMetier{
    @Override
    public double calculerMesualiteCredit(double capitale, double taux, int duree) {
        double t = taux /100 ;
        double t1 = t*capitale / 12 ;
        double t2 = 1- Math.pow(1+t/12 , - duree);
        return t1 / t2 ;
    }
}

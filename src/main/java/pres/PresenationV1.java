package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresenationV1 {
    public static void main(String[] args){

        /*
        Injection des dépendances par instanciation statique => new
         */

        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);//Injection des dépendances via le constructor

        //metier.setDao(d); //Injection via setter
        System.out.println("RES = "+metier.calcul());
    }
}

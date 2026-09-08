package pres;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            //DaoImplV2 d = new DaoImplV2();
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao) cDao.getConstructor().newInstance();

            //MetierImpl metier = new MetierImpl(d);
            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            //constructor avec parametres
            //IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            //Constructor sans parametres
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            //metier.setDao(d); //Injection via setter
            Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier,dao);

            System.out.println("RES = "+metier.calcul());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
